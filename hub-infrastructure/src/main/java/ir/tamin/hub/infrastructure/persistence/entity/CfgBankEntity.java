package ir.tamin.hub.infrastructure.persistence.entity;

import io.qoop.jpa.persistence.entity.embeddable.AuditingEntity;
import ir.tamin.hub.domain.enumaration.BankCodeEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "TB_CFG_BANK")
@SequenceGenerator(name = "ENTITY_SEQ", sequenceName = "CFG_BANK_SEQ", allocationSize = 1)
public class CfgBankEntity extends AuditingEntity<Long> {

    @Column(name = "CODE", nullable = false, unique = true, length = 10)
    @Enumerated(EnumType.STRING)
    private BankCodeEnum code;

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Column(name = "IS_ACTIVE", nullable = false)
    private Boolean active = Boolean.TRUE;
}
