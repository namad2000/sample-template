package ir.tamin.hub.infrastructure.persistence.entity;

import io.qoop.jpa.persistence.entity.embeddable.AuditingEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "TB_PAY_SPLIT_PART", uniqueConstraints = @UniqueConstraint(columnNames = {"SPLIT_ID", "PART_TYPE"}))
@SequenceGenerator(name = "ENTITY_SEQ", sequenceName = "PAY_SPLIT_PART_SEQ", allocationSize = 1)
public class PaySplitPartEntity extends AuditingEntity<Long> {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SPLIT_ID", nullable = false)
    private PaySplitEntity split;

    /**
     * CREDIT: Credit settlement | BANK: Bank payment
     */
    @Column(name = "PART_TYPE", nullable = false, length = 10)
    private String partType;

    @Column(name = "PART_ORDER", nullable = false)
    private Integer partOrder;

    @Column(name = "AMOUNT", nullable = false)
    private Long amount;

    /**
     * PENDING   | Pending
     * SETTLED   | Settled (CREDIT only)
     * PAID      | Paid (BANK only)
     * FAILED    | Failed (BANK only)
     * CANCELLED | Cancelled
     */
    @Column(name = "STATUS", nullable = false, length = 20)
    private String status = "PENDING";

    /**
     * For BANK type only: Newly created TB_PAYMENT_BILL for this part
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BANK_BILL_ID")
    private PaymentBillEntity bankBill;
}
