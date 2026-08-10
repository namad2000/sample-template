package ir.tamin.hub.domain.model;

import io.qoop.domain.model.embeddable.AuditingDomain;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * Domain equivalent of TbInsMetadata
 */
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class InsMetadata extends AuditingDomain<Long> {

    /**
     * REAL | LEGAL
     */
    private String personType;
    private String unitCode;
    private String moeinUnitCode;
    private Long billId;
    private String insPaymentId;
    private String debtNumber;
    private String debtType;
    private Boolean debt;
    private String treatyNumber;
    private String paymentFor;
    private String debtDetail;
}
