package com.github.kokecena.restcountries.exceptions;

import com.github.kokecena.restcountries.utils.Response;
import org.springframework.http.ResponseEntity;

public abstract class ResponseException extends RuntimeException {
    public ResponseException() {
    }

    public ResponseException(String message) {
        super(message);
    }

    public ResponseException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResponseException(Throwable cause) {
        super(cause);
    }

    public ResponseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public abstract ResponseEntity<Response<?>> getResponse();

}
