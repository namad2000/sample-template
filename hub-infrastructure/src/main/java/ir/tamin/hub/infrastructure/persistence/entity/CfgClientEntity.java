package ir.tamin.hub.infrastructure.persistence.entity;

import io.qoop.jpa.persistence.entity.embeddable.AuditingEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_CFG_CLIENT")
@SequenceGenerator(name = "ENTITY_SEQ", sequenceName = "CFG_CLIENT_SEQ", allocationSize = 1)
public class CfgClientEntity extends AuditingEntity<Long> {

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Column(name = "IS_ACTIVE", nullable = false)
    private Boolean active = Boolean.TRUE;
}
