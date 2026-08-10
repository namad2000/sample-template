package ir.tamin.hub.infrastructure.persistence.entity;

import io.qoop.jpa.persistence.entity.embeddable.AuditingEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "TB_INS_METADATA")
@SequenceGenerator(name = "ENTITY_SEQ", sequenceName = "INS_METADATA_SEQ", allocationSize = 1)
public class InsMetadataEntity extends AuditingEntity<Long> {

    @Column(name = "PERSON_TYPE", nullable = false, length = 10)
    private String personType;

    @Column(name = "UNIT_CODE", length = 10)
    private String unitCode;

    @Column(name = "MOEIN_UNIT_CODE", length = 10)
    private String moeinUnitCode;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BILL_ID", nullable = false)
    private PaymentBillEntity bill;

    @Column(name = "INS_PAYMENT_ID", length = 50)
    private String insPaymentId;

    @Column(name = "DEBT_NUMBER", length = 50)
    private String debtNumber;

    @Column(name = "DEBT_TYPE", length = 10)
    private String debtType;

    @Column(name = "IS_DEBT")
    private Boolean debt;

    @Column(name = "TREATY_NUMBER", length = 20)
    private String treatyNumber;

    @Column(name = "PAYMENT_FOR", length = 500)
    private String paymentFor;

    @Lob
    @Column(name = "DEBT_DETAIL")
    private String debtDetail;
}
