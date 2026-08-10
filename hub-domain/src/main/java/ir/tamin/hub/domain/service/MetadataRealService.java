package ir.tamin.hub.domain.service;

import io.qoop.filter.bean.api.DomainService;
import ir.tamin.hub.domain.repository.MetadataRealRepository;
import lombok.RequiredArgsConstructor;


@DomainService
@RequiredArgsConstructor
public class MetadataRealService {

    private final MetadataRealRepository metadataRealRepository;


}
