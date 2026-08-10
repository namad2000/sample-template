package ir.tamin.hub.domain.model;

import io.qoop.domain.model.embeddable.AuditingDomain;
import io.qoop.domain.model.embeddable.SoftDeletionAudit;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * Domain equivalent of TbPaymentBill
 */
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class PaymentBill extends AuditingDomain<Long> {

    private Long clientId;
    private Long bankId;

    private String insPaymentId;
    private String insOrdNumber;
    private String hamtaPaymentId;
    private Long paymentAmount;
    private Integer yearMonth;
    private LocalDateTime paymentDeadline;
    private LocalDateTime paymentBillDate;
    private String bankPlatform;
    private LocalDateTime lockUntil;
    private String callbackUrl;
    private String paymentHash;
    private String paymentTicket;
    private String rrn;
    private String paymentOrdIdentifier;
    private Long glSystemId;
    private String insuranceType;
    private String requestJson;

    /**
     * PENDING | IN_PROGRESS | PAID | FAILED | CANCELLED | EXPIRED | REVERSED
     */
    private String status;

    /**
     * SIMPLE | IN_MERGE | SPLIT | PAID | CANCELLED
     */
    @Builder.Default
    private String billState = "SIMPLE";

    /**
     * DEBIT | CREDIT
     */
    @Builder.Default
    private String billType = "DEBIT";

    @Builder.Default
    private Boolean sentToGl = Boolean.FALSE;
    private Long activeSplitId;
    private String nationalCode;

    @Builder.Default
    private SoftDeletionAudit softDelete = new SoftDeletionAudit();
}
