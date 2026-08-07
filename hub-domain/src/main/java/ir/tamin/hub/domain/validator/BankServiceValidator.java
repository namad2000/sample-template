package ir.tamin.hub.domain.validator;


import io.qoop.fault.handler.api.exception.DomainBusinessException;
import io.qoop.fault.handler.api.exception.DomainValidationException;
import io.qoop.filter.bean.api.DomainValidator;
import ir.tamin.hub.domain.enumaration.BankEnum;
import ir.tamin.hub.domain.model.Bank;
import ir.tamin.hub.domain.repository.BankRepository;

import static ir.tamin.hub.domain.exception.BanckExceptionCode.BANK_DUPLICATED;
import static ir.tamin.hub.domain.exception.BanckExceptionCode.BANK_NOT_FOUND;

@DomainValidator
public record BankServiceValidator(BankRepository bankRepository) {
    public void validateBankExistence(Bank updatedBank) {
        validateBankExistence(updatedBank.getId());
    }

    public void validateBankExistence(Long bankId) {
        if (!bankRepository.existsById(bankId)) {
            throw DomainValidationException.of(BANK_NOT_FOUND);
        }
    }

    public void validateBankIsUnique(BankEnum code) {
        if (bankRepository.existsByCode(code)) {
            throw DomainBusinessException.withParams(BANK_DUPLICATED, code);
        }
    }
}
