package ir.tamin.hub.application.port.in.usecase;

import io.qoop.filter.bean.api.UseCaseService;
import ir.tamin.hub.domain.repository.ClientRepository;
import lombok.RequiredArgsConstructor;


@UseCaseService
@RequiredArgsConstructor
public class ClientUseCase   {

    private final ClientRepository clientRepository;

}
