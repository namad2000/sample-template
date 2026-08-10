package ir.tamin.hub.infrastructure.persistence.entity;

import io.qoop.jpa.persistence.entity.embeddable.AuditingEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_PAY_LOG")
@SequenceGenerator(name = "ENTITY_SEQ", sequenceName = "PAY_LOG_SEQ", allocationSize = 1)
public class PayLogEntity extends AuditingEntity<Long> {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BILL_ID")
    private PaymentBillEntity bill;

    /**
     * HAMTA | BANK | CALLBACK | SYSTEM | GL | POS
     */
    @Column(name = "LOG_SOURCE", nullable = false, length = 20)
    private String logSource;

    @Column(name = "STATUS", nullable = false, length = 30)
    private String status;

    @Column(name = "BANK_ID")
    private Long bankId;

    @Column(name = "BANK_PLATFORM", length = 50)
    private String bankPlatform;

    @Column(name = "DESCRIPTIONS", length = 2000)
    private String descriptions;

    @Lob
    @Column(name = "MODEL_DATA")
    private String modelData;
}
