package ir.tamin.hub.domain.enumaration;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 */

public enum ActiveStatusEnum {
    ACTIVE("فعال"),
    INACTIVE("غیر فعال");

    private final String title;

    ActiveStatusEnum(String title) {
        this.title = title;
    }

    public String title() {
        return this.title;
    }
}
