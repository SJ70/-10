package com.example.demo.exception;

import com.example.demo.response.Code;

public class CustomException extends RuntimeException {

    private Code code;
    private String message;

    public CustomException(Code code) {
        this.code = code;
        this.message = code.name();
    }

    public CustomException(Code code, String message) {
        this.code = code;
        this.message = message;
    }

    public Code getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return message;
    }


}
