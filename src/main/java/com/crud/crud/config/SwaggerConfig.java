package com.crud.crud.config;


import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration

public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new io.swagger.v3.oas.models.info.Info()
                        .title("CRUD API")
                        .version("1.0")
                        .description("CRUD API Documentation")
                        .contact(new io.swagger.v3.oas.models.info.Contact()
                                .email("yagofellipe09@Gmail.com")
                                .name("Yago Fellipe")
                                .url("yagofellipe.github.io")
                        )
                        .license(new io.swagger.v3.oas.models.info.License()
                                .name("Apache 2.0")
                                .url("http://www.apache.org/licenses/LICENSE-2.0.html")
                        ) );
    }

}