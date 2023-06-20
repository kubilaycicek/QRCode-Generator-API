package com.kubilaycicek.qrcodeservice.data.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateQRCodeRequestTest {

    private final String CODE = "KUBILAY";
    private final Integer WIDTH = 200;
    private final Integer HEIGHT = 200;

    @Test
    void generateQRCodeRequest() {
        GenerateQRCodeRequest request = new GenerateQRCodeRequest(CODE, WIDTH, HEIGHT);
        assertEquals(CODE, request.codeText());
        assertEquals(WIDTH, request.width());
        assertEquals(HEIGHT, request.height());
    }

}