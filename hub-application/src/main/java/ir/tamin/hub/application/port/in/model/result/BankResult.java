package ir.tamin.hub.application.port.in.model.result;

import io.qoop.domain.model.UpdateModel;
import ir.tamin.hub.domain.enumaration.BankEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class BankResult extends UpdateModel<UUID> {
    private BankEnum bankCode;
    private String bankName;
    private boolean active;
}
