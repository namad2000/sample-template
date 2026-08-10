package ir.tamin.hub.infrastructure.persistence.repository.jpa;

import ir.tamin.hub.domain.model.BankAccount;
import ir.tamin.hub.domain.repository.BankAccountRepository;
import ir.tamin.hub.infrastructure.persistence.mapper.BankAccountMapper;
import ir.tamin.hub.infrastructure.persistence.repository.jpa.spring.BankAccountJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class BankAccountRepositoryAdapter implements BankAccountRepository {

    private final BankAccountJpaRepository jpaRepository;
    private final BankAccountMapper mapper;


    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(BankAccount domain) {

    }

    @Override
    public Optional<BankAccount> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public BankAccount save(BankAccount domain) {
        return null;
    }
}
