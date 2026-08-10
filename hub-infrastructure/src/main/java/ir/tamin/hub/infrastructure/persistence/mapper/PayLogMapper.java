package ir.tamin.hub.infrastructure.persistence.mapper;


import io.qoop.mapper.core.CommonsMapperConfig;
import io.qoop.mapper.core.mapper.PageMapper;
import ir.tamin.hub.domain.model.PayLog;
import ir.tamin.hub.infrastructure.persistence.entity.PayLogEntity;
import org.mapstruct.Mapper;

@Mapper(config = CommonsMapperConfig.class)
public interface PayLogMapper extends PageMapper<PayLog, PayLogEntity> {
}
