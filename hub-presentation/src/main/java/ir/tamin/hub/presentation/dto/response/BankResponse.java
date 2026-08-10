package ir.tamin.hub.presentation.dto.response;


import ir.tamin.hub.domain.enumaration.BankCodeEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 */

@Setter
@Getter
@SuperBuilder
public class BankResponse {
    private BankCodeEnum bankCode;
    private String bankName;
    private boolean active;
}
