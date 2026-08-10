package ir.tamin.hub.application.port.in.usecase;

import io.qoop.filter.bean.api.UseCaseService;
import ir.tamin.hub.domain.repository.BankAccountRepository;
import lombok.RequiredArgsConstructor;



@UseCaseService
@RequiredArgsConstructor
public class BankAccountUseCase  {

    private final BankAccountRepository bankAccountRepository;

}
