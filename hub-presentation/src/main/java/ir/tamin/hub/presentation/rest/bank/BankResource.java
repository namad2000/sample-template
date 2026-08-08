package ir.tamin.hub.presentation.rest.bank;


import ir.tamin.hub.application.port.in.model.cmd.CreateBankCmd;
import ir.tamin.hub.application.port.in.model.result.BankResult;
import ir.tamin.hub.application.port.in.usecase.BankUseCase;
import ir.tamin.hub.presentation.dto.request.CreateBankRequest;
import ir.tamin.hub.presentation.dto.response.BankResponse;
import ir.tamin.hub.presentation.mapper.BankCommandMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
@RequiredArgsConstructor
public class BankResource {

    private final BankUseCase bankUseCase;
    private final BankCommandMapper bankCommandMapper;

    @PostMapping("/create")
    public BankResponse create(@RequestBody CreateBankRequest request) {
        CreateBankCmd command = bankCommandMapper.toCommand(request);
        BankResult productResult = bankUseCase.create(command);

        return bankCommandMapper.toResponse(productResult);
    }
}
