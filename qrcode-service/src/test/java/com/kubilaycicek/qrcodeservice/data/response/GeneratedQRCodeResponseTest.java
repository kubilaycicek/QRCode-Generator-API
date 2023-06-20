package com.kubilaycicek.qrcodeservice.data.response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GeneratedQRCodeResponseTest {
    private static final byte[] QRCODE = "DATA".getBytes();

    @Test
    void generatedQRCodeResponse() {
        GeneratedQRCodeResponse response = new GeneratedQRCodeResponse(QRCODE);
        Assertions.assertEquals(QRCODE, response.qrCode());
    }

}