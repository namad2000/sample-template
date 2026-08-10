package ir.tamin.hub.domain.service;

import io.qoop.filter.bean.api.DomainService;
import ir.tamin.hub.domain.repository.PaySplitPartRepository;
import ir.tamin.hub.domain.repository.PaySplitRepository;
import ir.tamin.hub.domain.repository.PaymentBillRepository;
import lombok.RequiredArgsConstructor;

@DomainService
@RequiredArgsConstructor
public class PaySplitService  {

    private final PaySplitRepository paySplitRepository;
    private final PaySplitPartRepository paySplitPartRepository;
    private final PaymentBillRepository paymentBillRepository;


}
