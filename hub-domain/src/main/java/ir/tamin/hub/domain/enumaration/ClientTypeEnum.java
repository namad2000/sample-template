package ir.tamin.hub.domain.enumaration;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 */

@Getter
@AllArgsConstructor
public enum ClientTypeEnum {
    BANK_CLIENT("BANK_CLIENT", "کلاینت بانک"),
    INTERNAL_CLIENT("INTERNAL_CLIENT", "کلاینت داخلی");
    private final String code;
    private final String name;
}
