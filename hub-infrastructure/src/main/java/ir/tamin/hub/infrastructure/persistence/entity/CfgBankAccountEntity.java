package ir.tamin.hub.infrastructure.persistence.entity;

import io.qoop.jpa.persistence.entity.embeddable.AuditingEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_CFG_BANK_ACCOUNT",
        uniqueConstraints = @UniqueConstraint(columnNames = {"CLIENT_ID", "BANK_ID", "ACCOUNT_NUMBER"}))
@SequenceGenerator(name = "ENTITY_SEQ", sequenceName = "CFG_BANK_ACCOUNT_SEQ", allocationSize = 1)
public class CfgBankAccountEntity extends AuditingEntity<Long> {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    private CfgClientEntity client;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BANK_ID", nullable = false)
    private CfgBankEntity bank;

    @Column(name = "ACCOUNT_NUMBER", nullable = false, length = 50)
    private String accountNumber;

    @Column(name = "IS_ACTIVE", nullable = false)
    private Boolean active = Boolean.TRUE;
}
