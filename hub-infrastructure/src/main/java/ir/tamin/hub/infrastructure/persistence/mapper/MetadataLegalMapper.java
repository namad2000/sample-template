package ir.tamin.hub.infrastructure.persistence.mapper;


import io.qoop.mapper.core.CommonsMapperConfig;
import io.qoop.mapper.core.mapper.PageMapper;
import ir.tamin.hub.domain.model.MetadataLegal;
import ir.tamin.hub.infrastructure.persistence.entity.MetadataLegalEntity;
import org.mapstruct.Mapper;

@Mapper(config = CommonsMapperConfig.class)
public interface MetadataLegalMapper extends PageMapper<MetadataLegal, MetadataLegalEntity> {
}
