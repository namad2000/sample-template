package ir.tamin.hub.infrastructure.persistence.repository.jpa;

import ir.tamin.hub.domain.model.InsMetadata;
import ir.tamin.hub.domain.repository.InsMetadataRepository;
import ir.tamin.hub.infrastructure.persistence.mapper.InsMetadataMapper;
import ir.tamin.hub.infrastructure.persistence.repository.jpa.spring.MetadataJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class InsMetadataRepositoryAdapter implements InsMetadataRepository {

    private final MetadataJpaRepository jpaRepository;
    private final InsMetadataMapper mapper;


    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(InsMetadata domain) {

    }

    @Override
    public Optional<InsMetadata> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public InsMetadata save(InsMetadata domain) {
        return null;
    }
}
