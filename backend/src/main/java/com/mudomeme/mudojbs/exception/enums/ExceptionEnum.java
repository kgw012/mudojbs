package com.mudomeme.mudojbs.exception.enums;

import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter
@ToString
public enum ExceptionEnum {
    BAD_REQUEST_EXCEPTION(HttpStatus.BAD_REQUEST, "000", "잘못된 요청입니다."),
    RUNTIME_EXCEPTION(HttpStatus.BAD_REQUEST, "001", "알 수 없는 오류가 발생했습니다."),
    ACCESS_DENIED_EXCEPTION(HttpStatus.UNAUTHORIZED, "002", "인증되지 않은 요청입니다."),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "003", "알 수 없는 오류가 발생했습니다."),

    IMAGE_NOT_FOUND(HttpStatus.NOT_FOUND, "104", "해당 이미지를 찾을 수 없습니다.");

    private final HttpStatus status;
    private final String code;
    private final String message;

    ExceptionEnum(HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
