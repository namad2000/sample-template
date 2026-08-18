package ir.tamin.hub.presentation.rest.bank;


import io.qoop.builder.specification.api.model.FilterWrapper;
import io.qoop.builder.specification.api.model.SortWrapper;
import io.qoop.domain.model.PageFilterData;
import io.qoop.logs.DomainLogger;
import io.qoop.logs.annotation.Logged;
import io.qoop.security.api.CurrentUser;
import io.qoop.security.api.User;
import ir.tamin.hub.application.port.in.model.cmd.CreateBankCmd;
import ir.tamin.hub.application.port.in.model.result.BankResult;
import ir.tamin.hub.application.port.in.usecase.BankUseCase;
import ir.tamin.hub.presentation.dto.request.CreateBankRequest;
import ir.tamin.hub.presentation.dto.response.BankResponse;
import ir.tamin.hub.presentation.identity.Roles;
import ir.tamin.hub.presentation.mapper.BankCommandMapper;
import jakarta.annotation.security.RolesAllowed;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import static ir.tamin.hub.presentation.rest.bank.BanckResoucreExceptionCode.LIMIT_MAX_MESSAGE;

@RestController
@RequestMapping("/bank")
@RequiredArgsConstructor
@Logged("HUB-RESOURCE-BANK")
public class BankResource {

    private final BankUseCase bankUseCase;
    private final BankCommandMapper bankCommandMapper;
    private final DomainLogger logger;

    @PostMapping("/create")
    public BankResponse create(@RequestBody @Valid CreateBankRequest request) {
        CreateBankCmd command = bankCommandMapper.toCommand(request);
        BankResult productResult = bankUseCase.create(command);

        return bankCommandMapper.toResponse(productResult);
    }

    @GetMapping("/get-User-roles-allowed")
    @RolesAllowed({Roles.ALL_USERS})
    public User getUserRolesAllowed(@CurrentUser User user) {
        return user;
    }

    @GetMapping("/get-User-pre-authorize")
    @PreAuthorize("hasRole('ALL USERS')")
    public User getUserPreAuthorize(@CurrentUser User user) {
        logger.info("Get User PreAuthorize with user name: {}", user.getName());
        logger.warnWithKey("HUB-RESOURCE-BANK-TEST-KEY", "Get User PreAuthorize with user name: {}", user.getName());
        return user;
    }

    @GetMapping("/get-User-roles-allowed-forbidden")
    @RolesAllowed({"forbidden USERS"})
    public User getUserRolesAllowedForbidden(@CurrentUser User user) {

        return user;
    }

    @GetMapping("/get-User-pre-authorize-forbidden")
    @PreAuthorize("hasRole('forbidden USERS')")
    public User getUserPreAuthorizeForbidden(@CurrentUser User user) {
        return user;
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
