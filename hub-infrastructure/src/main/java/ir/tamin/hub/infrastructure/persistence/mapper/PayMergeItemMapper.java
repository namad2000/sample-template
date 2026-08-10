package ir.tamin.hub.infrastructure.persistence.mapper;


import io.qoop.mapper.core.CommonsMapperConfig;
import io.qoop.mapper.core.mapper.PageMapper;
import ir.tamin.hub.domain.model.PayMergeItem;
import ir.tamin.hub.infrastructure.persistence.entity.PayMergeItemEntity;
import org.mapstruct.Mapper;

@Mapper(config = CommonsMapperConfig.class)
public interface PayMergeItemMapper extends PageMapper<PayMergeItem, PayMergeItemEntity> {
}
