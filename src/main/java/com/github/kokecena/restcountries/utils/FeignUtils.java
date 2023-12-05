package com.github.kokecena.restcountries.utils;

import feign.Response;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public abstract class FeignUtils {
    public static String readBody(Response.Body body) {
        try (InputStream inputStream = body.asInputStream()) {
            return IOUtils.toString(inputStream,StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
