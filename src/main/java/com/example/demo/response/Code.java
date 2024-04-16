package com.example.demo.response;

import org.springframework.http.HttpStatus;

public enum Code {

    OK(2000, HttpStatus.OK, "OK"),
    BAD_REQUEST(500, HttpStatus.BAD_REQUEST, "BAD_REQUEST");

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

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
