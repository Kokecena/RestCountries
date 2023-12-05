package com.github.kokecena.restcountries.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Currency {
    private String code;
    private String name;
    private String symbol;
}
