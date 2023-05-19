package com.cabtrips.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    OpenAPI custonOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("API de de viajes CabTrips.")
                .version("1.0.0")
                .description("Esta API se ancarga de manejar la informacion de los viajes")
        );
    }

}