package ir.tamin.hub.application.port.in.usecase;

import io.qoop.filter.bean.api.UseCaseService;
import io.qoop.mapper.api.shift.Shift;
import io.qoop.validation.api.IsValid;
import ir.tamin.hub.application.port.in.model.cmd.CreateBankCmd;
import ir.tamin.hub.application.port.in.model.result.BankResult;
import ir.tamin.hub.domain.model.Bank;
import ir.tamin.hub.domain.service.BankService;
import lombok.RequiredArgsConstructor;

@UseCaseService
@RequiredArgsConstructor
public class BankUseCase {

    private final BankService bankService;

    public BankResult create(@IsValid CreateBankCmd createBankCmd) {
        Bank bank = bankService.create(
                createBankCmd.getBankCode(),
                createBankCmd.getBankName(),
                createBankCmd.isActive()
        );

        return Shift.just(bank)
                .toShift(BankResult.class)
                .map((bankCreated, bankResult) -> {
                    bankResult.setBankCode(bankCreated.getCode());
                    bankResult.setBankName(bankCreated.getName());
                })
                .orElse(null);
    }
}