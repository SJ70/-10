package com.example.demo.controller;

import com.example.demo.exception.CustomException;
import com.example.demo.response.ApiResponse;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;

abstract public class BaseController {

    @ExceptionHandler(CustomException.class)
    public <T> ApiResponse<T> customExceptionHandler(HttpServletResponse response, CustomException customException) {
        response.setStatus(customException.getCode().getHttpStatus().value());

        return new ApiResponse<T>(customException.getCode());
    }

}
