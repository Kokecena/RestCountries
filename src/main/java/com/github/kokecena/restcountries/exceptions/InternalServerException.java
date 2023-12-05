package com.github.kokecena.restcountries.exceptions;

import org.springframework.http.HttpStatus;

public class InternalServerException extends ResponseException {
    public InternalServerException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }
}
