package ir.tamin.hub.domain.model;

import io.qoop.domain.model.embeddable.CreationAudit;
import io.qoop.domain.model.embeddable.IDDomain;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * Domain equivalent of TbPayBankResponse
 */
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class PayBankResponse extends IDDomain<Long> {
    private Long billId;
    private Long bankId;
    private Long paymentAmount;
    private String accountNumber;
    private String bankTrackingNumber;
    private LocalDateTime bankPaymentDate;
    private String tfhId;
    private String paymentGateway;
    private LocalDateTime paymentUpdatedDate;

    /**
     * SUCCESS | FAILED | PENDING | REVERSED
     */
    private String status;
    private String descriptions;

    @Builder.Default
    private CreationAudit audit = new CreationAudit();
}
