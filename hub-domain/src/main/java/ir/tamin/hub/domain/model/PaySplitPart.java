package ir.tamin.hub.domain.model;

import io.qoop.domain.model.embeddable.AuditingDomain;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * Domain equivalent of TbPaySplitPart
 */
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class PaySplitPart extends AuditingDomain<Long> {
    private Long splitId;

    /**
     * CREDIT | BANK
     */
    private String partType;
    private Integer partOrder;
    private Long amount;

    /**
     * PENDING | SETTLED | PAID | FAILED | CANCELLED
     */
    @Builder.Default
    private String status = "PENDING";
    private Long bankBillId;
}
