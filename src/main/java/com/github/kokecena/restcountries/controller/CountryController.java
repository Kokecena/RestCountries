package com.github.kokecena.restcountries.controller;

import com.github.kokecena.restcountries.service.CountryService;
import com.github.kokecena.restcountries.utils.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/country/")
@RequiredArgsConstructor
public class CountryController {

    private final CountryService service;

    @GetMapping("name/{name}")
    public ResponseEntity<Response<?>> getCountryByName(@PathVariable String name, @RequestParam(required = false) boolean fullText) {
        return service.getCountryByName(name, fullText);
    }

}

