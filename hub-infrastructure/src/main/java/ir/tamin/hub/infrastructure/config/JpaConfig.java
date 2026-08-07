package ir.tamin.hub.infrastructure.config;

import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("ir.tamin.hub.infrastructure.persistence.repository.jpa.spring")
@EntityScan("ir.tamin.hub.infrastructure.persistence.entity")
public class JpaConfig {
}
