package ir.tamin.hub.presentation.rest.bank;


import io.qoop.builder.specification.api.model.FilterWrapper;
import io.qoop.builder.specification.api.model.SortWrapper;
import io.qoop.domain.model.PageFilterData;
import ir.tamin.hub.application.port.in.model.cmd.CreateBankCmd;
import ir.tamin.hub.application.port.in.model.result.BankResult;
import ir.tamin.hub.application.port.in.usecase.BankUseCase;
import ir.tamin.hub.presentation.dto.request.CreateBankRequest;
import ir.tamin.hub.presentation.dto.response.BankResponse;
import ir.tamin.hub.presentation.mapper.BankCommandMapper;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static ir.tamin.hub.presentation.rest.bank.BanckResoucreExceptionCode.LIMIT_MAX_MESSAGE;

@RestController
@RequestMapping("/bank")
@RequiredArgsConstructor
public class BankResource {

    private final BankUseCase bankUseCase;
    private final BankCommandMapper bankCommandMapper;

    @PostMapping("/create")
    public BankResponse create(@RequestBody @Valid CreateBankRequest request) {
        CreateBankCmd command = bankCommandMapper.toCommand(request);
        BankResult productResult = bankUseCase.create(command);

        return bankCommandMapper.toResponse(productResult);
    }

    @GetMapping
    public PageFilterData<BankResult> getAll(
            @RequestParam(required = false) FilterWrapper filter,
            @RequestParam(required = false) SortWrapper sort,
            @RequestParam(defaultValue = "0") Integer start,
            @RequestParam(defaultValue = "100") @Max(value = 100, message = LIMIT_MAX_MESSAGE) Integer limit) {

        return bankUseCase.getAll(filter, sort, start, limit);
    }
}
