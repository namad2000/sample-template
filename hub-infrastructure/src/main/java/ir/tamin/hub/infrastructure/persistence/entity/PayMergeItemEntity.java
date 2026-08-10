package ir.tamin.hub.infrastructure.persistence.entity;

import io.qoop.jpa.persistence.entity.embeddable.IDEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_PAY_MERGE_ITEM")
@SequenceGenerator(name = "ENTITY_SEQ", sequenceName = "PAY_MERGE_ITEM_SEQ", allocationSize = 1)
public class PayMergeItemEntity extends IDEntity<Long> {

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BILL_ID", nullable = false, unique = true)
    private PaymentBillEntity bill;

    @Column(name = "STATUS", nullable = false, length = 30)
    private String status;

    @Column(name = "CANCEL_REASON", length = 50)
    private String cancelReason;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_BILL_ID")
    private PaymentBillEntity parentBill;
}
