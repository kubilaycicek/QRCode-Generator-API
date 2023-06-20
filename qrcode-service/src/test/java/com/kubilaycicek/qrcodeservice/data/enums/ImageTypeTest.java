package com.kubilaycicek.qrcodeservice.data.enums;

import net.bytebuddy.pool.TypePool;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImageTypeTest {

    @Test
    void getImageTypeNamesTest() {
        assertAll(
                () -> assertEquals("PNG", ImageType.PNG.name()),
                () -> assertEquals("JPG", ImageType.JPG.name())
        );
    }

    @Test
    void imageTypeIsFound() {
        ImageType result = ImageType.findByValue("png");
        assertEquals("PNG", result.name());
    }

    @Test
    void imageTypeIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            ImageType.findByValue(null);
        });
    }
}