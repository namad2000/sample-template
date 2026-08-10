package ir.tamin.hub.domain.model;

import io.qoop.domain.model.embeddable.AuditingDomain;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * Domain equivalent of TbMetadataLegal — id is the same as the related InsMetadata identifier
 */
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class MetadataLegal extends AuditingDomain<Long> {
    private String companyName;
    private String registrationNo;
    private String economicCode;
}
