package com.openapi3.example.swaggerConfig;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@OpenAPIDefinition
@Component
public class SwaggerConfig {

    @Bean
    public OpenAPI openApi(){

        return new OpenAPI().info(new Info()
                            .title("Student API")
                            .version("1.1.1")
                            .termsOfService("www.example.com/tersmofservice")
                            .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }

    @Bean
    public GroupedOpenApi studentGroup(){
        return GroupedOpenApi.builder()
                             .group("Student Group")
                             .pathsToMatch("/api/students/**")
                             .build();
    }

    @Bean
    public GroupedOpenApi universityGroup(){
        return GroupedOpenApi.builder()
                             .group("University Group")
                             .pathsToMatch("/api/university/**")
                             .build();
    }
}
