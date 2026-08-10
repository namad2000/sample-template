package ir.tamin.hub.domain.service;

import io.qoop.filter.bean.api.DomainService;
import ir.tamin.hub.domain.repository.PayLogRepository;
import lombok.RequiredArgsConstructor;

@DomainService
@RequiredArgsConstructor
public class PayLogService {

    private final PayLogRepository payLogRepository;


}
