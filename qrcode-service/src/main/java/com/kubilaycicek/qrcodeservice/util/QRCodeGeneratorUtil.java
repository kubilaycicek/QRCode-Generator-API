package com.kubilaycicek.qrcodeservice.util;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.kubilaycicek.qrcodeservice.data.enums.ImageType;
import lombok.extern.slf4j.Slf4j;

import java.io.ByteArrayOutputStream;
;
import java.nio.file.FileSystems;
import java.nio.file.Path;

@Slf4j
public class QRCodeGeneratorUtil {

    private QRCodeGeneratorUtil() {
    }

    private static final String QR_CODE_IMAGE_PATH = "./src/main/resources/QRCode.png";

    public static void generateQRCodeImage(String text, int width, int height) {
        try {
            BitMatrix bitMatrix = new QRCodeWriter().encode(text, BarcodeFormat.QR_CODE, width, height);
            Path path = FileSystems.getDefault().getPath(QR_CODE_IMAGE_PATH);
            MatrixToImageWriter.writeToPath(bitMatrix, ImageType.PNG.name(), path);
        } catch (Exception exception) {
            log.error("ERROR! Message : " + exception.getMessage());
            log.error("Could not download code : " + text);
        }
    }

    public static byte[] getQRCodeImage(String text, int width, int height) {
        try {
            BitMatrix bitMatrix = new QRCodeWriter().encode(text, BarcodeFormat.QR_CODE, width, height);
            ByteArrayOutputStream pngOutputStream = new ByteArrayOutputStream();
            MatrixToImageWriter.writeToStream(bitMatrix, ImageType.PNG.name(), pngOutputStream);
            return pngOutputStream.toByteArray();
        } catch (Exception exception) {

            log.error("ERROR! Message : " + exception.getMessage());
            log.error("Could not generate code : " + text);
            return "".getBytes();
        }
    }
}