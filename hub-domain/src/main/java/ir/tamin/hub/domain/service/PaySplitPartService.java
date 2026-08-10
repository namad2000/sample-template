package ir.tamin.hub.domain.service;

import io.qoop.filter.bean.api.DomainService;
import ir.tamin.hub.domain.repository.PaySplitPartRepository;
import lombok.RequiredArgsConstructor;


import java.util.List;

@DomainService
@RequiredArgsConstructor
public class PaySplitPartService {

    private final PaySplitPartRepository paySplitPartRepository;

   }
