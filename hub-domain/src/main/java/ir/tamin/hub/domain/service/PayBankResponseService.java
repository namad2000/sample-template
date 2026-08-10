package ir.tamin.hub.domain.service;

import io.qoop.filter.bean.api.DomainService;
import ir.tamin.hub.domain.repository.PayBankResponseRepository;
import ir.tamin.hub.domain.repository.PaymentBillRepository;
import lombok.RequiredArgsConstructor;


@DomainService
@RequiredArgsConstructor
public class PayBankResponseService {

    private final PayBankResponseRepository payBankResponseRepository;
    private final PaymentBillRepository paymentBillRepository;


}
