package ir.tamin.hub.domain.model;

import io.qoop.domain.model.embeddable.AuditingDomain;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Domain equivalent of TbCfgClient
 */
@Getter
@Setter
@NoArgsConstructor
public class Client extends AuditingDomain<Long> {
    private String name;
    private Boolean active;
}
