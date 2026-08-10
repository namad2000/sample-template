package ir.tamin.hub.infrastructure.persistence.repository.jpa;

import ir.tamin.hub.domain.model.PayBillHistory;
import ir.tamin.hub.domain.repository.PayBillHistoryRepository;
import ir.tamin.hub.infrastructure.persistence.mapper.PayBillHistMapper;
import ir.tamin.hub.infrastructure.persistence.repository.jpa.spring.PayBillHistJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PayBillHistoryRepositoryAdapter implements PayBillHistoryRepository {

    private final PayBillHistJpaRepository jpaRepository;
    private final PayBillHistMapper mapper;


    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(PayBillHistory domain) {

    }

    @Override
    public Optional<PayBillHistory> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public PayBillHistory save(PayBillHistory domain) {
        return null;
    }
}
