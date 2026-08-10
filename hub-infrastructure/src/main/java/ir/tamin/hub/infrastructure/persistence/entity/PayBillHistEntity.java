package ir.tamin.hub.infrastructure.persistence.entity;

import io.qoop.jpa.persistence.entity.embeddable.IDEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "TB_PAY_BILL_HIST")
@SequenceGenerator(name = "ENTITY_SEQ", sequenceName = "PAY_BILL_HIST_SEQ", allocationSize = 1)
public class PayBillHistEntity extends IDEntity<Long> {

    /**
     * INSERT | UPDATE | DELETE
     */
    @Column(name = "HIST_ACTION", nullable = false, length = 10)
    private String histAction;

    @Column(name = "HIST_AT", nullable = false)
    private LocalDateTime histAt;

    @Column(name = "HIST_BY", nullable = false, length = 100)
    private String histBy;

    @Column(name = "BILL_ID", nullable = false)
    private Long billId;

    @Column(name = "OLD_STATUS", length = 30)
    private String oldStatus;

    @Column(name = "NEW_STATUS", length = 30)
    private String newStatus;

    @Column(name = "OLD_AMOUNT")
    private Long oldAmount;

    @Column(name = "NEW_AMOUNT")
    private Long newAmount;

    @Lob
    @Column(name = "SNAPSHOT")
    private String snapshot;
}
