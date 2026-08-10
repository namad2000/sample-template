package ir.tamin.hub.infrastructure.persistence.repository.jpa;

import ir.tamin.hub.domain.model.PayBankResponse;
import ir.tamin.hub.domain.repository.PayBankResponseRepository;
import ir.tamin.hub.infrastructure.persistence.mapper.PayBankResponseMapper;
import ir.tamin.hub.infrastructure.persistence.repository.jpa.spring.PayBankResponseJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PayBankResponseRepositoryAdapter implements PayBankResponseRepository {

    private final PayBankResponseJpaRepository jpaRepository;
    private final PayBankResponseMapper mapper;


    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(PayBankResponse domain) {

    }

    @Override
    public Optional<PayBankResponse> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public PayBankResponse save(PayBankResponse domain) {
        return null;
    }
}
