package com.github.kokecena.restcountries.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public abstract class ResponseUtils {
    public static <T> ResponseEntity<Response<?>> createResponse(T object, HttpStatus httpStatus) {
        return new ResponseEntity<>(new Response<>(httpStatus.value(), object), httpStatus);
    }
}
