package ir.tamin.hub.domain.model;

import io.qoop.domain.model.embeddable.AuditingDomain;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * Domain equivalent of TbPaySplit
 */
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class PaySplit extends AuditingDomain<Long> {
    private Long originBillId;
    private Long totalAmount;
    private Long creditAmount;
    private Long bankAmount;

    /**
     * PENDING | PARTIAL | COMPLETED | CANCELLED
     */
    @Builder.Default
    private String status = "PENDING";
    private String splitReason;
}
