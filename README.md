# QRCode Generator API

This is a qrcode  generater API. I used the google zxing library. Also I added the postman request collection for you.

## Used Technologies
* Java 17
* Spring Boot 3.1.0
* Lombok
* Google ZXING

## CURL
```code
curl --location --request GET 'http://localhost:9090/qrcode-service/generateQRCode' \ --header 'Content-Type: application/json' \--data '{"codeText":"https://google.com.tr", "width":200, "height":300 }
```
# Request
```json
{
    "codeText":"https://google.com.tr",
    "width":200,
    "height":200
}
  ```
 # Response
 ```json
 {
    "qrCode": "iVBORw0KGgoAAAANSUhEUgAAAMgAAAEsAQAAAACugcETAAABM0lEQVR4Xu2WS47EIAxEzYpjcNMO3JRjeIXHZdIfRT3LmdTCJRKBXxYlTKGI/Sa5Fl5KkgRKkgRKkgRK8heki6sNbb3aUCwKDRn+aFtRcH5WSIhKccsCeMSEkPiOGiUZNtFnNmIwa4rtxGRXOEhHMNrQPbAoNORUlI/XkoP0CMfuuR/Gj27fT8xmsRnQa/PAYCG9otx3k/W5qRzEzRri21adD9x/jYe4Xy/3GAtxueTnTnJ2O96P2NdBQ3wjizaLA7hdHzRkwC/eblzqnrMQ2xFR94uJxKaykFCPcAwf/gkNCafIR7Qa3S40BB7jr/MdER6iaPWqtnDBiFTEhYoMbYbbBbCQEZxE/Dr5J+/b5X5iEeI6cR6rhX0W0kVgdt/K4Jf83Em+K0kSKEkSKEkSKMn/kR/OqJcWKh1wTQAAAABJRU5ErkJggg=="
}
  ```
