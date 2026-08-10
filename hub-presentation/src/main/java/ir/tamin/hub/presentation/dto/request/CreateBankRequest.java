package ir.tamin.hub.presentation.dto.request;

import ir.tamin.hub.domain.enumaration.BankCodeEnum;
import ir.tamin.hub.presentation.rest.bank.BanckResoucreExceptionCode;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateBankRequest {
    @NotNull
    private BankCodeEnum bankCode;

    @NotEmpty(message = BanckResoucreExceptionCode.BANK_NAME_NOT_EMPTY)
    private String bankName;

    @Builder.Default
    private boolean active = true;
}
