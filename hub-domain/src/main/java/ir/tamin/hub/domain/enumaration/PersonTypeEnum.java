package ir.tamin.hub.domain.enumaration;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 */

@Getter
@AllArgsConstructor
public enum PersonTypeEnum {
    REAL("REAL", "شخص حقیقی"),
    LEGAL("LEGAL", "شخص حقوقی"),
    FOREIGN("FOREIGN", "اتباع غیر ایرانی");

    private final String code;
    private final String name;

    public static PersonTypeEnum fromCode(String code) {
        if (code == null) return null;

        for (PersonTypeEnum e : values()) {
            if (e.code.equalsIgnoreCase(code)) {
                return e;
            }
        }

        throw new IllegalArgumentException("Invalid PersonType code: " + code);
    }
}
