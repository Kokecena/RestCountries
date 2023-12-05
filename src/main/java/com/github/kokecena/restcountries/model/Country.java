package com.github.kokecena.restcountries.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Country {
    private CountryName name;
    private List<String> capital;
    private Map<String,String> languages;
    private Map<String,Currency> currencies;
    private Long population;
}
