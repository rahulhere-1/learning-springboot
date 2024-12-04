package com.example.learning.Learning.Spring.Boot.entity;

import org.springframework.http.HttpStatus;

public class ErrorMessage {

    private HttpStatus httpStatus;
    private String message;

    public ErrorMessage(HttpStatus notFound, String studentNotAvailable) {
        this.httpStatus=notFound;
        this.message=studentNotAvailable;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
