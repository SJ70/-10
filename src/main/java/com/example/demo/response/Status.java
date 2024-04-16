package com.example.demo.response;

public class Status {
    private Code code;
    private String message;

    public Status(Code code) {
        this.code = code;
        this.message = code.getMessage();
    }

    public Status(Code code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code.getCode();
    }

    public String getMessage() {
        return message;
    }

}
