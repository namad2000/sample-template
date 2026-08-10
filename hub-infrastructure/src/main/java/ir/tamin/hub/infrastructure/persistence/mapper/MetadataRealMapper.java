package ir.tamin.hub.infrastructure.persistence.mapper;


import io.qoop.mapper.core.CommonsMapperConfig;
import io.qoop.mapper.core.mapper.PageMapper;
import ir.tamin.hub.infrastructure.persistence.entity.MetadataRealEntity;
import org.mapstruct.Mapper;

@Mapper(config = CommonsMapperConfig.class)
public interface MetadataRealMapper extends PageMapper<ir.tamin.hub.domain.model.MetadataReal, MetadataRealEntity> {
}
