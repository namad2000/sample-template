package ir.tamin.hub.infrastructure.persistence.entity;

import io.qoop.jpa.persistence.entity.embeddable.AuditingEntity;
import io.qoop.jpa.persistence.entity.embeddable.SoftDeletionAudit;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@Entity
@Table(name = "TB_PAYMENT_BILL")
@SequenceGenerator(name = "ENTITY_SEQ", sequenceName = "PAYMENT_BILL_SEQ", allocationSize = 1)
public class PaymentBillEntity extends AuditingEntity<Long> {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    private CfgClientEntity client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BANK_ID")
    private CfgBankEntity bank;

    @Column(name = "INS_PAYMENT_ID", nullable = false, length = 50)
    private String insPaymentId;

    @Column(name = "INS_ORD_NUMBER", nullable = false, length = 30)
    private String insOrdNumber;

    @Column(name = "HAMTA_PAYMENT_ID", unique = true, length = 50)
    private String hamtaPaymentId;

    @Column(name = "PAYMENT_AMOUNT", nullable = false)
    private Long paymentAmount;

    @Column(name = "YEAR_MONTH", nullable = false)
    private Integer yearMonth;

    @Column(name = "PAYMENT_DEADLINE", nullable = false)
    private LocalDateTime paymentDeadline;

    @Column(name = "PAYMENT_BILL_DATE")
    private LocalDateTime paymentBillDate;

    @Column(name = "BANK_PLATFORM", length = 50)
    private String bankPlatform;

    @Column(name = "LOCK_UNTIL")
    private LocalDateTime lockUntil;

    @Column(name = "CALLBACK_URL", length = 500)
    private String callbackUrl;

    @Column(name = "PAYMENT_HASH", length = 250)
    private String paymentHash;

    @Column(name = "PAYMENT_TICKET", length = 250)
    private String paymentTicket;

    @Column(name = "RRN", length = 50)
    private String rrn;

    @Column(name = "PAYMENT_ORD_IDENTIFIER", length = 50)
    private String paymentOrdIdentifier;

    @Column(name = "GL_SYSTEM_ID")
    private Long glSystemId;

    @Column(name = "INSURANCE_TYPE", length = 10)
    private String insuranceType;

    @Lob
    @Column(name = "REQUEST_JSON")
    private String requestJson;

    /**
     * PENDING | IN_PROGRESS | PAID | FAILED | CANCELLED | EXPIRED | REVERSED
     */
    @Column(name = "STATUS", nullable = false, length = 30)
    private String status;

    /**
     * SIMPLE:    Standalone, directly payable bill
     * IN_MERGE:  Locked, waiting for Merge completion
     * SPLIT:     Locked, waiting for Split completion
     * PAID:      Settled
     * CANCELLED: Cancelled
     */
    @Column(name = "BILL_STATE", nullable = false, length = 20)
    private String billState = "SIMPLE";

    /**
     * DEBIT | CREDIT
     */
    @Column(name = "BILL_TYPE", nullable = false, length = 10)
    private String billType = "DEBIT";

    @Column(name = "IS_SENT_TO_GL", nullable = false)
    private Boolean sentToGl = Boolean.FALSE;

    @Column(name = "ACTIVE_SPLIT_ID")
    private Long activeSplitId;

    @Column(name = "NATIONAL_CODE", length = 10)
    private String nationalCode;

    @Embedded
    private SoftDeletionAudit softDelete = new SoftDeletionAudit();
}
