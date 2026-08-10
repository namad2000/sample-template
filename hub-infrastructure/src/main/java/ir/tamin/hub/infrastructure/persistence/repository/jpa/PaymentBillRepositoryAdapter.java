package ir.tamin.hub.infrastructure.persistence.repository.jpa;

import ir.tamin.hub.domain.model.PaymentBill;
import ir.tamin.hub.domain.repository.PaymentBillRepository;
import ir.tamin.hub.infrastructure.persistence.mapper.PaymentBillMapper;
import ir.tamin.hub.infrastructure.persistence.repository.jpa.spring.PaymentBillJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PaymentBillRepositoryAdapter implements PaymentBillRepository {

    private final PaymentBillJpaRepository jpaRepository;
    private final PaymentBillMapper mapper;


    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(PaymentBill domain) {

    }

    @Override
    public Optional<PaymentBill> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public PaymentBill save(PaymentBill domain) {
        return null;
    }
}
