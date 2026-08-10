package ir.tamin.hub.infrastructure.persistence.mapper;


import io.qoop.mapper.core.CommonsMapperConfig;
import io.qoop.mapper.core.mapper.PageMapper;
import ir.tamin.hub.domain.model.PaySplit;
import ir.tamin.hub.infrastructure.persistence.entity.PaySplitEntity;
import org.mapstruct.Mapper;

@Mapper(config = CommonsMapperConfig.class)
public interface PaySplitMapper extends PageMapper<PaySplit, PaySplitEntity> {
}
