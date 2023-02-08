package com.ecom.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<ApiError> exceptionHandlerMethod1() {

        ApiError a1 = new ApiError(1, "Not Found-custmised Exceptin Throws");


        return new ResponseEntity<ApiError>(a1, HttpStatus.NOT_FOUND);


    }
}
