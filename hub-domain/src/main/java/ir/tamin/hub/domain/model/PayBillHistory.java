package ir.tamin.hub.domain.model;

import io.qoop.domain.model.embeddable.AuditingDomain;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * Domain equivalent of TbPayBillHist.
 * This table does not have standard audit fields; it has its own HIST_AT/HIST_BY fields.
 */
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class PayBillHistory extends AuditingDomain<Long> {

    /**
     * INSERT | UPDATE | DELETE
     */
    private String histAction;
    private LocalDateTime histAt;
    private String histBy;
    private Long billId;
    private String oldStatus;
    private String newStatus;
    private Long oldAmount;
    private Long newAmount;
    private String snapshot;
}
