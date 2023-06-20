package com.kubilaycicek.qrcodeservice.data.enums;

import java.util.Arrays;

public enum ImageType {
    PNG("PNG"), JPG("JPG");

    private final String value;

    ImageType(String value) {
        this.value = value;
    }


    public static ImageType findByValue(String value) {
        return Arrays.stream(ImageType.values()).filter(x -> x.value.equalsIgnoreCase(value)).findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
