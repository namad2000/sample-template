package ir.tamin.hub.infrastructure.persistence.mapper;


import io.qoop.mapper.core.CommonsMapperConfig;
import io.qoop.mapper.core.mapper.PageMapper;
import ir.tamin.hub.domain.model.Client;
import ir.tamin.hub.infrastructure.persistence.entity.CfgClientEntity;
import org.mapstruct.Mapper;

@Mapper(config = CommonsMapperConfig.class)
public interface ClientMapper extends PageMapper<Client, CfgClientEntity> {
}
