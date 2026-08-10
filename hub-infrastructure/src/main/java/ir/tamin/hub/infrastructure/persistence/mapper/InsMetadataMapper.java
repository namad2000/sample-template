package ir.tamin.hub.infrastructure.persistence.mapper;


import io.qoop.mapper.core.CommonsMapperConfig;
import io.qoop.mapper.core.mapper.PageMapper;
import ir.tamin.hub.domain.model.InsMetadata;
import ir.tamin.hub.infrastructure.persistence.entity.InsMetadataEntity;
import org.mapstruct.Mapper;

@Mapper(config = CommonsMapperConfig.class)
public interface InsMetadataMapper extends PageMapper<InsMetadata, InsMetadataEntity> {
}
