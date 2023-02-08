package com.ecom.exception;

import lombok.Data;


public class ApiError {

    private int statusCode;
    private  String codeMsg;

    public ApiError(int statusCode, String codeMsg) {
        this.statusCode = statusCode;
        this.codeMsg = codeMsg;
    }
}
