package com.example.demo.response;

public class Status {
    private Code code;
    private String message;

    public Status(Code code, String message) {
        this.code = code;
        this.message = message;
    }

    public Code getCode() {
        return code;
    }
}
