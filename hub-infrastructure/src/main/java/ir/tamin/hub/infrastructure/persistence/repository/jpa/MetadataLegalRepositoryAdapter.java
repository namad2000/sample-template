package ir.tamin.hub.infrastructure.persistence.repository.jpa;

import ir.tamin.hub.domain.model.MetadataLegal;
import ir.tamin.hub.domain.repository.MetadataLegalRepository;
import ir.tamin.hub.infrastructure.persistence.mapper.MetadataLegalMapper;
import ir.tamin.hub.infrastructure.persistence.repository.jpa.spring.MetadataLegalJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MetadataLegalRepositoryAdapter implements MetadataLegalRepository {

    private final MetadataLegalJpaRepository jpaRepository;
    private final MetadataLegalMapper mapper;


    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(MetadataLegal domain) {

    }

    @Override
    public Optional<MetadataLegal> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public MetadataLegal save(MetadataLegal domain) {
        return null;
    }
}
