package ir.tamin.hub.application.port.in.usecase;

import io.qoop.builder.specification.api.model.FilterWrapper;
import io.qoop.builder.specification.api.model.SortWrapper;
import io.qoop.domain.model.PageFilterData;
import io.qoop.filter.bean.api.UseCaseService;
import io.qoop.validation.api.IsValid;
import ir.tamin.hub.application.port.in.mapper.BankMapper;
import ir.tamin.hub.application.port.in.model.cmd.CreateBankCmd;
import ir.tamin.hub.application.port.in.model.result.BankResult;
import ir.tamin.hub.domain.model.Bank;
import ir.tamin.hub.domain.service.BankService;
import lombok.RequiredArgsConstructor;

@UseCaseService
@RequiredArgsConstructor
public class BankUseCase {
    private final BankService bankService;
    private final BankMapper bankMapper;

    public BankResult create(@IsValid CreateBankCmd createBankCmd) {
        Bank bank = bankService.create(
                createBankCmd.getBankCode(),
                createBankCmd.getBankName(),
                createBankCmd.isActive()
        );

        return bankMapper.toTarget(bank);
    }

    public PageFilterData<BankResult> getAll(FilterWrapper filter, SortWrapper sort, int start, int limit) {
        PageFilterData<Bank> bankData = bankService.getAll(filter, sort, start, limit);
        return bankMapper.toPageFilterData(bankData);
    }
}