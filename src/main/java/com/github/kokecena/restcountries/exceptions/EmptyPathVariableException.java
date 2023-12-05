package com.github.kokecena.restcountries.exceptions;

import com.github.kokecena.restcountries.utils.Response;
import com.github.kokecena.restcountries.utils.ResponseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class EmptyPathVariableException extends ResponseException {

    public EmptyPathVariableException(String message) {
        super(message);
    }

    @Override
    public ResponseEntity<Response<?>> getResponse() {
        return ResponseUtils.createResponse(getMessage(), HttpStatus.BAD_REQUEST);
    }
}
