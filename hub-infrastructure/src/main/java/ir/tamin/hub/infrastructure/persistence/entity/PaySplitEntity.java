package ir.tamin.hub.infrastructure.persistence.entity;

import io.qoop.jpa.persistence.entity.embeddable.AuditingEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_PAY_SPLIT")
@SequenceGenerator(name = "ENTITY_SEQ", sequenceName = "PAY_SPLIT_SEQ", allocationSize = 1)
public class PaySplitEntity extends AuditingEntity<Long> {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ORIGIN_BILL_ID", nullable = false)
    private PaymentBillEntity originBill;

    @Column(name = "TOTAL_AMOUNT", nullable = false)
    private Long totalAmount;

    @Column(name = "CREDIT_AMOUNT", nullable = false)
    private Long creditAmount;

    @Column(name = "BANK_AMOUNT", nullable = false)
    private Long bankAmount;

    /**
     * PENDING   | Settlement pending, bank pending
     * PARTIAL   | Partially settled
     * COMPLETED | Both parts settled
     * CANCELLED | Cancelled
     */
    @Column(name = "STATUS", nullable = false, length = 20)
    private String status = "PENDING";

    @Column(name = "SPLIT_REASON", length = 100)
    private String splitReason;
}
