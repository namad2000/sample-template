package ir.tamin.hub.domain.enumaration;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 */

@Getter
@AllArgsConstructor
public enum StatusEnum {
    CREATED("CREATED", "ثبت اولیه"),
    FIRST_APPROVE("FIRST_APPROVE", "تایید اولیه"),
    REVIEW("REVIEW", "بررسی"),
    FINAL_APPROVE("FINAL_APPROVE", "تایید نهایی"),
    RECEIVED("RECEIVED", "وصول شده"),
    CANCEL("CANCEL", "ابطال");

    private final String code;
    private final String name;
}
