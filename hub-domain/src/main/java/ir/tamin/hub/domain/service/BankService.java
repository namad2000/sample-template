package ir.tamin.hub.domain.service;


import io.qoop.builder.specification.api.model.FilterWrapper;
import io.qoop.builder.specification.api.model.SortWrapper;
import io.qoop.domain.model.PageFilterData;
import io.qoop.fault.handler.api.exception.DomainBusinessException;
import io.qoop.filter.bean.api.DomainService;
import ir.tamin.hub.domain.enumaration.BankEnum;
import ir.tamin.hub.domain.model.Bank;
import ir.tamin.hub.domain.repository.BankRepository;
import ir.tamin.hub.domain.validator.BankServiceValidator;
import lombok.RequiredArgsConstructor;

import static io.qoop.fault.handler.api.presentation.HttpStatus.NOT_FOUND;
import static ir.tamin.hub.domain.exception.BanckExceptionCode.BANK_NOT_FOUND;

@DomainService
@RequiredArgsConstructor
public class BankService {

    private final BankRepository bankRepository;
    private final BankServiceValidator bankServiceValidator;

    public Bank create(BankEnum code, String name, boolean active) {
        bankServiceValidator.validateBankIsUnique(code);
        return bankRepository.save(
                Bank.builder()
                        .code(code)
                        .name(name)
                        .active(active)
                        .build()
        );
    }

    public Bank update(Bank updatedBank) {
        bankServiceValidator.validateBankExistence(updatedBank);
        bankServiceValidator.validateBankIsUnique(updatedBank.getCode());

        return bankRepository.save(updatedBank);
    }

    public Bank getById(Long bankId) {
        Bank bank = bankRepository.findById(bankId)
                .orElseThrow(() -> DomainBusinessException.of(BANK_NOT_FOUND, NOT_FOUND));

        bank.validateIdIsActive();

        return bank;
    }

    public void deleteById(Long bankId) {
        bankServiceValidator.validateBankExistence(bankId);
        bankRepository.deleteById(bankId);
    }

    public PageFilterData<Bank> getAll(FilterWrapper filterWrapper, SortWrapper sortWrapper, Integer start, Integer limit) {
        return bankRepository.findAll(filterWrapper, sortWrapper, start, limit);
    }
}
