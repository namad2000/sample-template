package ir.tamin.hub.domain.model;

import io.qoop.domain.model.embeddable.IDDomain;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * Domain equivalent of TbPayMergeItem — this table has no audit fields
 */
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class PayMergeItem extends IDDomain<Long> {
    private Long billId;
    private String status;
    private String cancelReason;
    private Long parentBillId;
}
