package com.github.kokecena.restcountries.exceptions;

import com.github.kokecena.restcountries.utils.Response;
import com.github.kokecena.restcountries.utils.ResponseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CountryNotFoundException extends ResponseException {
    public CountryNotFoundException() {
        super("Country not found");
    }

    @Override
    public ResponseEntity<Response<?>> getResponse() {
        return ResponseUtils.createResponse(getMessage(),HttpStatus.BAD_REQUEST);
    }

}
