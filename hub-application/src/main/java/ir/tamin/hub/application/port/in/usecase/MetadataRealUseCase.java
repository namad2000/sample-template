package ir.tamin.hub.application.port.in.usecase;

import io.qoop.filter.bean.api.UseCaseService;
import ir.tamin.hub.domain.repository.MetadataRealRepository;
import lombok.RequiredArgsConstructor;


@UseCaseService
@RequiredArgsConstructor
public class MetadataRealUseCase  {

    private final MetadataRealRepository metadataRealRepository;

}
