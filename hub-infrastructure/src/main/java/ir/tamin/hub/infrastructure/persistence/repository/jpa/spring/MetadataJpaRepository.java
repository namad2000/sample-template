package ir.tamin.hub.infrastructure.persistence.repository.jpa.spring;

import ir.tamin.hub.infrastructure.persistence.entity.InsMetadataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetadataJpaRepository extends JpaRepository<InsMetadataEntity, Long> {

}
