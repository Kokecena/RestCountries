package com.github.kokecena.restcountries.feign;

import com.github.kokecena.restcountries.exceptions.CountryNotFoundException;
import com.github.kokecena.restcountries.feign.handle.HandleFeignError;
import com.github.kokecena.restcountries.feign.handler.CountryClientExceptionHandler;
import com.github.kokecena.restcountries.model.Country;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "countries", url = "https://restcountries.com/v3.1/")
public interface CountryClient {
    @GetMapping(value = "name/{name}", consumes = MediaType.APPLICATION_JSON_VALUE)
    @HandleFeignError(CountryClientExceptionHandler.class)
    List<Country> getCountry(@PathVariable String name, @RequestParam(required = false) boolean fullText) throws CountryNotFoundException;
}
