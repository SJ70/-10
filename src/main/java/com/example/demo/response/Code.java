package com.example.demo.response;

import com.example.demo.Config;
import org.springframework.http.HttpStatus;

public enum Code {

    OK(2000, HttpStatus.OK, "OK"),
    GRADE_OVER(500, HttpStatus.BAD_REQUEST, String.format("grade는 %d 이상을 입력할 수 없습니다.", Config.GRADE_MAX_VALUE + 1));

    private final int code;
    private final HttpStatus httpStatus;
    private final String message;

    Code(int code, HttpStatus httpStatus, String message) {
        this.code = code;
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

}
