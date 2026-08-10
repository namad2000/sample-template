package ir.tamin.hub.infrastructure.persistence.repository.jpa;

import ir.tamin.hub.domain.model.PaySplitPart;
import ir.tamin.hub.domain.repository.PaySplitPartRepository;
import ir.tamin.hub.infrastructure.persistence.mapper.PaySplitPartMapper;
import ir.tamin.hub.infrastructure.persistence.repository.jpa.spring.PaySplitPartJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PaySplitPartRepositoryAdapter implements PaySplitPartRepository {

    private final PaySplitPartJpaRepository jpaRepository;
    private final PaySplitPartMapper mapper;


    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(PaySplitPart domain) {

    }

    @Override
    public Optional<PaySplitPart> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public PaySplitPart save(PaySplitPart domain) {
        return null;
    }
}
