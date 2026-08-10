package ir.tamin.hub.application.port.in.usecase;

import io.qoop.filter.bean.api.UseCaseService;
import ir.tamin.hub.domain.repository.PaymentBillRepository;
import lombok.RequiredArgsConstructor;


@UseCaseService
@RequiredArgsConstructor
public class PaymentBillUseCase {

    private final PaymentBillRepository paymentBillRepository;


}
