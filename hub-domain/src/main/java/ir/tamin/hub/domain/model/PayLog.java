package ir.tamin.hub.domain.model;

import io.qoop.domain.model.embeddable.CreationAudit;
import io.qoop.domain.model.embeddable.IDDomain;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * Domain equivalent of TbPayLog
 */
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class PayLog extends IDDomain<Long> {
    private Long billId;

    /**
     * HAMTA | BANK | CALLBACK | SYSTEM | GL | POS
     */
    private String logSource;
    private String status;
    private Long bankId;
    private String bankPlatform;
    private String descriptions;
    private String modelData;

    @Builder.Default
    private CreationAudit audit = new CreationAudit();
}
