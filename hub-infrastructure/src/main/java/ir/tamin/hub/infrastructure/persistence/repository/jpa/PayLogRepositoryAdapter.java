package ir.tamin.hub.infrastructure.persistence.repository.jpa;

import ir.tamin.hub.domain.model.PayLog;
import ir.tamin.hub.domain.repository.PayLogRepository;
import ir.tamin.hub.infrastructure.persistence.mapper.PayLogMapper;
import ir.tamin.hub.infrastructure.persistence.repository.jpa.spring.PayLogJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PayLogRepositoryAdapter implements PayLogRepository {

    private final PayLogJpaRepository jpaRepository;
    private final PayLogMapper mapper;


    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(PayLog domain) {

    }

    @Override
    public Optional<PayLog> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public PayLog save(PayLog domain) {
        return null;
    }
}
