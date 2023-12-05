package com.github.kokecena.restcountries.exceptions;

import org.springframework.http.HttpStatus;

public class IllegalCharacterException extends ResponseException {
    public IllegalCharacterException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.BAD_REQUEST;
    }

}
