package ir.tamin.hub.infrastructure.persistence.repository.jpa.spring;

import ir.tamin.hub.infrastructure.persistence.entity.MetadataRealEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetadataRealJpaRepository extends JpaRepository<MetadataRealEntity, Long> {

}
