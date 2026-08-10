package ir.tamin.hub.infrastructure.persistence.repository.jpa;

import ir.tamin.hub.domain.model.Client;
import ir.tamin.hub.domain.repository.ClientRepository;
import ir.tamin.hub.infrastructure.persistence.mapper.ClientMapper;
import ir.tamin.hub.infrastructure.persistence.repository.jpa.spring.ClientJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ClientRepositoryAdapter implements ClientRepository {

    private final ClientJpaRepository jpaRepository;
    private final ClientMapper mapper;


    @Override
    public Client save(Client domain) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Client domain) {

    }

    @Override
    public Optional<Client> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }
}
