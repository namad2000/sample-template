package ir.tamin.hub.domain.service;

import io.qoop.filter.bean.api.DomainService;
import ir.tamin.hub.domain.repository.ClientRepository;
import lombok.RequiredArgsConstructor;


@DomainService
@RequiredArgsConstructor
public class ClientService  {

    private final ClientRepository clientRepository;


}
