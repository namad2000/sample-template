package ir.tamin.hub.domain.model;


import io.qoop.domain.model.ActiveModel;
import io.qoop.fault.handler.api.exception.DomainBusinessException;
import ir.tamin.hub.domain.enumaration.BankEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import static ir.tamin.hub.domain.exception.BanckExceptionCode.BANK_IS_INACTIVE;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 */

@Setter
@Getter
@SuperBuilder
public class Bank extends ActiveModel<Long> {
    private BankEnum code;
    private String name;

    public void validateIdIsActive() {
        if (!isActive()) {
            throw DomainBusinessException.of(BANK_IS_INACTIVE);
        }
    }
}
