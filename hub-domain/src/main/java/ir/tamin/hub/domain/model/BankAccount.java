package ir.tamin.hub.domain.model;

import io.qoop.domain.model.embeddable.AuditingDomain;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * Domain equivalent of TbCfgBankAccount
 */
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class BankAccount extends AuditingDomain<Long> {
    private Long clientId;
    private Long bankId;
    private String accountNumber;
    private Boolean active;
}
