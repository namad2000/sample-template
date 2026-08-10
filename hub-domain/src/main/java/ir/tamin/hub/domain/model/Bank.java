package ir.tamin.hub.domain.model;

import io.qoop.domain.model.embeddable.AuditingDomain;
import io.qoop.fault.handler.api.exception.DomainBusinessException;
import ir.tamin.hub.domain.enumaration.BankCodeEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import static ir.tamin.hub.domain.exception.BanckExceptionCode.BANK_IS_INACTIVE;

/**
 * Domain equivalent of TbCfgBank
 */
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Bank extends AuditingDomain<Long> {
    private BankCodeEnum code;
    private String name;
    private boolean active;

    public void validateIdIsActive() {
        if (!isActive()) {
            throw DomainBusinessException.of(BANK_IS_INACTIVE);
        }
    }
}
