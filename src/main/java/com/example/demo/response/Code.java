package com.example.demo.response;

import com.example.demo.Config;

public enum Code {

    OK(2000, "OK"),
    GRADE_OVER(500, String.format("grade는 %d 이상을 입력할 수 없습니다.", Config.GRADE_MAX_VALUE + 1));

    private final int code;
    private final String message;

    Code(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
