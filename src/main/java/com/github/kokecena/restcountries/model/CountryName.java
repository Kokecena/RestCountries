package com.github.kokecena.restcountries.model;

import lombok.Data;

import java.util.Map;

@Data
public class CountryName {
    private String common;
    private String official;
    private Map<String, NativeName> nativeName;
}
