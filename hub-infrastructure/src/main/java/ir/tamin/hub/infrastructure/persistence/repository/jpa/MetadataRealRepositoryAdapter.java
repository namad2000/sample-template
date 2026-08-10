package ir.tamin.hub.infrastructure.persistence.repository.jpa;

import ir.tamin.hub.domain.model.MetadataReal;
import ir.tamin.hub.domain.repository.MetadataRealRepository;
import ir.tamin.hub.infrastructure.persistence.mapper.MetadataRealMapper;
import ir.tamin.hub.infrastructure.persistence.repository.jpa.spring.MetadataRealJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MetadataRealRepositoryAdapter implements MetadataRealRepository {

    private final MetadataRealJpaRepository jpaRepository;
    private final MetadataRealMapper mapper;


    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(MetadataReal domain) {

    }

    @Override
    public Optional<MetadataReal> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public MetadataReal save(MetadataReal domain) {
        return null;
    }
}
