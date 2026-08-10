package ir.tamin.hub.presentation.dto.request;

import ir.tamin.hub.domain.enumaration.BankEnum;
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
    private BankEnum bankCode;

    @NotEmpty(message = BanckResoucreExceptionCode.BANK_NAME_NOT_EMPTY)
    private String bankName;

    private boolean active = true;
}
