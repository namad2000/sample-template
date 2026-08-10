package ir.tamin.hub.application.port.in.usecase;

import io.qoop.filter.bean.api.UseCaseService;
import ir.tamin.hub.domain.repository.PayLogRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@UseCaseService
@RequiredArgsConstructor
public class PayLogUseCase  {

    private final PayLogRepository payLogRepository;


}
