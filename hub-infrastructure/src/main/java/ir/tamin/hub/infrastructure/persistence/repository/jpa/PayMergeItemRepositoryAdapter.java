package ir.tamin.hub.infrastructure.persistence.repository.jpa;

import ir.tamin.hub.domain.model.PayMergeItem;
import ir.tamin.hub.domain.repository.PayMergeItemRepository;
import ir.tamin.hub.infrastructure.persistence.mapper.PayMergeItemMapper;
import ir.tamin.hub.infrastructure.persistence.repository.jpa.spring.PayMergeItemJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PayMergeItemRepositoryAdapter implements PayMergeItemRepository {

    private final PayMergeItemJpaRepository jpaRepository;
    private final PayMergeItemMapper mapper;


    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(PayMergeItem domain) {

    }

    @Override
    public Optional<PayMergeItem> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public PayMergeItem save(PayMergeItem domain) {
        return null;
    }
}
