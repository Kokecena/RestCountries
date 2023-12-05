package com.github.kokecena.restcountries.feign;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients("com.github.kokecena.restcountries.feign")
public class FeignConfig { }
