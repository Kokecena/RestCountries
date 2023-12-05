package com.github.kokecena.restcountries.feign.handle;

import feign.Response;

public interface FeignHttpExceptionHandler {
    Exception handle(Response response);
}
