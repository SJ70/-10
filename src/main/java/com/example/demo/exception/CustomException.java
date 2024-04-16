package com.example.demo.exception;

import com.example.demo.response.Code;

public class CustomException extends RuntimeException {

    private Code code;
    private String message;
    private Object data;

    public CustomException(Code code) {
        this.code = code;
        this.message = code.getMessage();
    }

    public CustomException(Code code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Code getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
}
