package ir.tamin.hub.infrastructure.persistence.repository.jpa.spring;

import ir.tamin.hub.infrastructure.persistence.entity.MetadataLegalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetadataLegalJpaRepository extends JpaRepository<MetadataLegalEntity, Long> {

}
