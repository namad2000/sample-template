package ir.tamin.hub.application.port.in.mapper;


import io.qoop.filter.bean.api.DomainMapper;
import io.qoop.mapper.api.mapper.DomainPageMapper;
import io.qoop.mapper.api.mapper.SourceMapper;
import io.qoop.mapper.api.shift.Shift;
import ir.tamin.hub.application.port.in.model.result.BankResult;
import ir.tamin.hub.domain.model.Bank;


@DomainMapper
public class BankMapper implements DomainPageMapper<Bank, BankResult>, SourceMapper<Bank, BankResult> {

    @Override
    public BankResult toTarget(Bank bank) {
        if (bank == null) return null;

        return Shift.just(bank)
                .toShift(BankResult.class)
                .map((bankCreated, bankResult) -> {
                    bankResult.setBankCode(bankCreated.getCode());
                    bankResult.setBankName(bankCreated.getName());
                })
                .orElse(null);
    }

    @Override
    public Bank toSource(BankResult bankResult) {
        return Shift.just(bankResult).toObject(Bank.class);
    }
}
