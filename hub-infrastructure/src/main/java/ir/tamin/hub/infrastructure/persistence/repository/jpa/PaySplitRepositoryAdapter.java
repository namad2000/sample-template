package ir.tamin.hub.infrastructure.persistence.repository.jpa;

import ir.tamin.hub.domain.model.PaySplit;
import ir.tamin.hub.domain.repository.PaySplitRepository;
import ir.tamin.hub.infrastructure.persistence.mapper.PaySplitMapper;
import ir.tamin.hub.infrastructure.persistence.repository.jpa.spring.PaySplitJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PaySplitRepositoryAdapter implements PaySplitRepository {

    private final PaySplitJpaRepository jpaRepository;
    private final PaySplitMapper mapper;


    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(PaySplit domain) {

    }

    @Override
    public Optional<PaySplit> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public PaySplit save(PaySplit domain) {
        return null;
    }
}
