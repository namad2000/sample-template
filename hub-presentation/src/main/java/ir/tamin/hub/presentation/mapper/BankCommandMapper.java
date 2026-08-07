package ir.tamin.hub.presentation.mapper;

import io.qoop.mapper.core.CommonsMapperConfig;
import ir.tamin.hub.application.port.in.model.cmd.CreateBankCmd;
import ir.tamin.hub.application.port.in.model.result.BankResult;
import ir.tamin.hub.presentation.dto.request.CreateBankRequest;
import ir.tamin.hub.presentation.dto.response.BankResponse;
import org.mapstruct.Mapper;

@Mapper(config = CommonsMapperConfig.class)
public interface BankCommandMapper {
    CreateBankCmd toCommand(CreateBankRequest request);

    BankResponse toResponse(BankResult result);
}
