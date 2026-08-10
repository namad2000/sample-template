package ir.tamin.hub.infrastructure.persistence.entity;

import io.qoop.jpa.persistence.entity.embeddable.AuditingEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "TB_METADATA_LEGAL")
@AttributeOverride(name = "id", column = @Column(name = "METADATA_ID"))
@SequenceGenerator(name = "ENTITY_SEQ", sequenceName = "METADATA_LEGAL_SEQ", allocationSize = 1)
public class MetadataLegalEntity extends AuditingEntity<Long> {

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId
    @JoinColumn(name = "METADATA_ID")
    private InsMetadataEntity metadata;

    @Column(name = "COMPANY_NAME", nullable = false, length = 200)
    private String companyName;

    @Column(name = "REGISTRATION_NO", unique = true, length = 30)
    private String registrationNo;

    @Column(name = "ECONOMIC_CODE", length = 30)
    private String economicCode;
}
