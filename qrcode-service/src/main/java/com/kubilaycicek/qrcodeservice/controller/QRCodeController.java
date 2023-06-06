package com.kubilaycicek.qrcodeservice.controller;


import com.kubilaycicek.qrcodeservice.data.request.GenerateQRCodeRequest;
import com.kubilaycicek.qrcodeservice.data.response.GeneretedQRCodeResponse;
import com.kubilaycicek.qrcodeservice.util.QRCodeGeneratorUtil;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RequestMapping("qrcode-service/")
@RestController
public class QRCodeController {
    @GetMapping(value = "generateAndDownloadQRCode")
    public void download(@RequestBody GenerateQRCodeRequest request) {
        QRCodeGeneratorUtil.generateQRCodeImage(request.codeText(), request.width(), request.height());
    }

    @GetMapping(value = "generateQRCode")
    public ResponseEntity<GeneretedQRCodeResponse> generateQRCode(@RequestBody GenerateQRCodeRequest request) {
        return ResponseEntity.status(HttpStatus.OK).body(new GeneretedQRCodeResponse(QRCodeGeneratorUtil.getQRCodeImage(request.codeText(), request.width(), request.height())));
    }
}