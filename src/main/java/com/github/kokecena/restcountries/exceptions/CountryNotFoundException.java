package com.github.kokecena.restcountries.exceptions;

import org.springframework.http.HttpStatus;

public class CountryNotFoundException extends ResponseException {
    public CountryNotFoundException() {
        super("Country not found");
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.NOT_FOUND;
    }

}
