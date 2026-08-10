package ir.tamin.hub.application.port.in.usecase;

import io.qoop.filter.bean.api.UseCaseService;
import ir.tamin.hub.domain.repository.MetadataLegalRepository;
import lombok.RequiredArgsConstructor;

@UseCaseService
@RequiredArgsConstructor
public class MetadataLegalUseCase  {

    private final MetadataLegalRepository metadataLegalRepository;


}
