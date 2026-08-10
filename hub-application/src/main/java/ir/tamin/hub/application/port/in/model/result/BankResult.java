package ir.tamin.hub.application.port.in.model.result;


import io.qoop.application.model.cmd.UpdateCmd;
import ir.tamin.hub.domain.enumaration.BankCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class BankResult extends UpdateCmd<Long> {
    private BankCodeEnum bankCode;
    private String bankName;
    private boolean active;
}
