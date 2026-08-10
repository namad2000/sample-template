package ir.tamin.hub.domain.service;

import io.qoop.filter.bean.api.DomainService;
import ir.tamin.hub.domain.repository.MetadataLegalRepository;
import lombok.RequiredArgsConstructor;

@DomainService
@RequiredArgsConstructor
public class MetadataLegalService{

    private final MetadataLegalRepository metadataLegalRepository;

}
