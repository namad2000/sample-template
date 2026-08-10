package ir.tamin.hub.application.port.in.usecase;

import io.qoop.filter.bean.api.UseCaseService;
import ir.tamin.hub.domain.repository.PaySplitPartRepository;
import ir.tamin.hub.domain.repository.PaySplitRepository;
import ir.tamin.hub.domain.repository.PaymentBillRepository;
import lombok.RequiredArgsConstructor;

@UseCaseService
@RequiredArgsConstructor
public class PaySplitUseCase {

    private final PaySplitRepository paySplitRepository;
    private final PaySplitPartRepository paySplitPartRepository;
    private final PaymentBillRepository paymentBillRepository;


}
