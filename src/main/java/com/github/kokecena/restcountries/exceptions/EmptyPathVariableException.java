package com.github.kokecena.restcountries.exceptions;

import org.springframework.http.HttpStatus;

public class EmptyPathVariableException extends ResponseException {

    public EmptyPathVariableException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.BAD_REQUEST;
    }

}
