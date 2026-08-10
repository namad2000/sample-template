package ir.tamin.hub.infrastructure.persistence.mapper;


import io.qoop.mapper.core.CommonsMapperConfig;
import io.qoop.mapper.core.mapper.PageMapper;
import ir.tamin.hub.domain.model.PaySplitPart;
import ir.tamin.hub.infrastructure.persistence.entity.PaySplitPartEntity;
import org.mapstruct.Mapper;

@Mapper(config = CommonsMapperConfig.class)
public interface PaySplitPartMapper extends PageMapper<PaySplitPart, PaySplitPartEntity> {
}
