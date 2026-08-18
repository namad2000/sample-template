package ir.tamin.hub.domain.service;


import io.qoop.builder.specification.api.model.FilterWrapper;
import io.qoop.builder.specification.api.model.SortWrapper;
import io.qoop.domain.model.PageFilterData;
import io.qoop.fault.handler.api.exception.DomainBusinessException;
import io.qoop.filter.bean.api.DomainService;
import io.qoop.logs.DomainLogger;
import io.qoop.logs.annotation.Logged;
import ir.tamin.hub.domain.enumaration.BankCodeEnum;
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
    private final DomainLogger logger;

    public Bank create(BankCodeEnum code, String name, boolean active) {
        bankServiceValidator.validateBankIsUnique(code);
        return bankRepository.save(
                Bank.builder()
                        .code(code)
                        .name(name)
                        .active(active)
                        .build()
        );
    }

    @Logged("HUB-DOMAIN-BANK-UPDATE")
    public Bank update(Bank updatedBank) {
        bankServiceValidator.validateBankExistence(updatedBank);
        bankServiceValidator.validateBankIsUnique(updatedBank.getCode());

        logger.info("Updating Bank with code: {}" + updatedBank.getCode());

        return bankRepository.save(updatedBank);
    }

    public Bank getById(Long bankId) {
        Bank bank = bankRepository.findById(bankId)
                .orElseThrow(() -> DomainBusinessException.of(BANK_NOT_FOUND, NOT_FOUND));

        bank.validateIdIsActive();

        logger.infoWithKey("HUB-DOMAIN-BANK-Get", "Got Bank with code: {}" + bank.getCode());

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
