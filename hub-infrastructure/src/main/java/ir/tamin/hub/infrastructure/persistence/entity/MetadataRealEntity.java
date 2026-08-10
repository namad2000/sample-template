package ir.tamin.hub.infrastructure.persistence.entity;

import io.qoop.jpa.persistence.entity.embeddable.AuditingEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_METADATA_REAL")
@AttributeOverride(name = "id", column = @Column(name = "METADATA_ID"))
@SequenceGenerator(name = "ENTITY_SEQ", sequenceName = "METADATA_REAL_SEQ", allocationSize = 1)
public class MetadataRealEntity extends AuditingEntity<Long> {

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId
    @JoinColumn(name = "METADATA_ID")
    private InsMetadataEntity metadata;

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Column(name = "FAMILY", nullable = false, length = 100)
    private String family;

    /**
     * IRANIAN | FOREIGN
     */
    @Column(name = "NATIONALITY_TYPE", nullable = false, length = 10)
    private String nationalityType = "IRANIAN";

    @Column(name = "NATIONAL_ID", nullable = false, unique = true, length = 20)
    private String nationalId;

    @Column(name = "NATIONALITY", length = 50)
    private String nationality;

    @Column(name = "INSURANCE_NUMBER", length = 20)
    private String insuranceNumber;
}
