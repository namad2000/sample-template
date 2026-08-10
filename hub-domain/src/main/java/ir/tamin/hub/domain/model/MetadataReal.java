package ir.tamin.hub.domain.model;

import io.qoop.domain.model.embeddable.AuditingDomain;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * Domain equivalent of TbMetadataReal.
 * The id of this class is the same as the related InsMetadata identifier (shared PK in the persistence layer).
 */
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class MetadataReal extends AuditingDomain<Long> {
    private String name;
    private String family;

    /**
     * IRANIAN | FOREIGN
     */
    @Builder.Default
    private String nationalityType = "IRANIAN";
    private String nationalId;
    private String nationality;
    private String insuranceNumber;
}
