package ir.tamin.hub.application.port.in.usecase;

import io.qoop.filter.bean.api.UseCaseService;
import ir.tamin.hub.domain.model.PaySplitPart;
import ir.tamin.hub.domain.repository.PaySplitPartRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@UseCaseService
@RequiredArgsConstructor
public class PaySplitPartUseCase {

    private final PaySplitPartRepository paySplitPartRepository;


}
