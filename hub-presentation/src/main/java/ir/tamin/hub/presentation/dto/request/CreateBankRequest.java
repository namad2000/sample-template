package ir.tamin.hub.presentation.dto.request;

import ir.tamin.hub.domain.enumaration.BankEnum;
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
    @NotNull(message = "")
    private BankEnum bankCode;

    @NotEmpty
    private String bankName;

    @NotNull
    private boolean active;
}
