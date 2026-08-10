package ir.tamin.hub.application.port.in.usecase;

import io.qoop.filter.bean.api.UseCaseService;
import ir.tamin.hub.domain.repository.PayBankResponseRepository;
import ir.tamin.hub.domain.repository.PaymentBillRepository;
import lombok.RequiredArgsConstructor;

@UseCaseService
@RequiredArgsConstructor
public class PayBankResponseUseCase  {

    private final PayBankResponseRepository payBankResponseRepository;
    private final PaymentBillRepository paymentBillRepository;


}
