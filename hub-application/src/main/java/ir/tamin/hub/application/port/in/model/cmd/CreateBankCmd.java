package ir.tamin.hub.application.port.in.model.cmd;

import io.qoop.validation.api.NotEmpty;
import io.qoop.validation.api.NotNull;
import ir.tamin.hub.domain.enumaration.BankCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateBankCmd {
    @NotNull
    private BankCodeEnum bankCode;

    @NotEmpty
    private String bankName;

    @NotNull
    private boolean active;
}
