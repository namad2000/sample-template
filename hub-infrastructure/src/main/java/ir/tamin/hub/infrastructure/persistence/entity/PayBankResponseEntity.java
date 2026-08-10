package ir.tamin.hub.infrastructure.persistence.entity;

import io.qoop.jpa.persistence.entity.embeddable.CreationAudit;
import io.qoop.jpa.persistence.entity.embeddable.IDEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "TB_PAY_BANK_RESPONSE")
@SequenceGenerator(name = "ENTITY_SEQ", sequenceName = "PAY_BANK_RESPONSE_SEQ", allocationSize = 1)
public class PayBankResponseEntity extends IDEntity<Long> {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BILL_ID", nullable = false)
    private PaymentBillEntity bill;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BANK_ID", nullable = false)
    private CfgBankEntity bank;

    @Column(name = "PAYMENT_AMOUNT", nullable = false)
    private Long paymentAmount;

    @Column(name = "ACCOUNT_NUMBER", nullable = false, length = 50)
    private String accountNumber;

    @Column(name = "BANK_TRACKING_NUMBER", nullable = false, length = 50)
    private String bankTrackingNumber;

    @Column(name = "BANK_PAYMENT_DATE", nullable = false)
    private LocalDateTime bankPaymentDate;

    @Column(name = "TFH_ID", length = 20)
    private String tfhId;

    @Column(name = "PAYMENT_GATEWAY", length = 30)
    private String paymentGateway;

    @Column(name = "PAYMENT_UPDATED_DATE")
    private LocalDateTime paymentUpdatedDate;

    /**
     * SUCCESS | FAILED | PENDING | REVERSED
     */
    @Column(name = "STATUS", nullable = false, length = 30)
    private String status;

    @Column(name = "DESCRIPTIONS", length = 1000)
    private String descriptions;

    /**
     * This table has no UPDATED_* fields -> CreationAudit is used.
     */
    @Embedded
    private CreationAudit audit = new CreationAudit();
}
