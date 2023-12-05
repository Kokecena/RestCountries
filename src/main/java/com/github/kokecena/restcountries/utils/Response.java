package com.github.kokecena.restcountries.utils;

public record Response<T>(Integer code, T message) {}
