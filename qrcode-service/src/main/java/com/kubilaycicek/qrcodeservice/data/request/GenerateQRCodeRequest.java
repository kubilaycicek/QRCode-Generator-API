package com.kubilaycicek.qrcodeservice.data.request;

public record GenerateQRCodeRequest(String codeText, Integer width, Integer height) { }
