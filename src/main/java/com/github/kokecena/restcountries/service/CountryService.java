package com.github.kokecena.restcountries.service;

import com.github.kokecena.restcountries.exceptions.CountryNotFoundException;
import com.github.kokecena.restcountries.exceptions.EmptyPathVariableException;
import com.github.kokecena.restcountries.exceptions.IllegalCharacterException;
import com.github.kokecena.restcountries.feign.CountryClient;
import com.github.kokecena.restcountries.utils.Response;
import com.github.kokecena.restcountries.utils.ResponseUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryClient countryClient;

    public ResponseEntity<Response<?>> getCountryByName(String name, boolean fullText) {
        try {
            if (StringUtils.containsWhitespace(name)) {
                throw new EmptyPathVariableException("No whitespaces");
            }
            if (!name.matches("^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\\\s-]+$")) {
                throw new IllegalCharacterException("Invalid characters: ".concat(name));
            }
            return ResponseUtils.createResponse(countryClient.getCountry(name, fullText), HttpStatus.OK);
        } catch (CountryNotFoundException | EmptyPathVariableException | IllegalCharacterException ex) {
            return ex.getResponse();
        }
    }
}
