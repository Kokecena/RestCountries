package com.github.kokecena.restcountries.feign.handler;

import com.github.kokecena.restcountries.exceptions.CountryNotFoundException;
import com.github.kokecena.restcountries.exceptions.InternalServerException;
import com.github.kokecena.restcountries.feign.handle.FeignHttpExceptionHandler;
import com.github.kokecena.restcountries.utils.FeignUtils;
import feign.Response;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class CountryClientExceptionHandler implements FeignHttpExceptionHandler {
    @Override
    public Exception handle(Response response) {
        HttpStatus httpStatus = HttpStatus.resolve(response.status());
        String body = FeignUtils.readBody(response.body());
        if (HttpStatus.NOT_FOUND.equals(httpStatus)) {
            return new CountryNotFoundException();
        }
        return new InternalServerException(body);
    }


}
