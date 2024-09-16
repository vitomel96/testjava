package cibernacion.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public org.springdoc.core.models.GroupedOpenApi publicApi() {
        return org.springdoc.core.models.GroupedOpenApi.builder()
                .group("employee-api")
                .pathsToMatch("/**")
                .packagesToScan("cibernacion.test.ui.controllers")
                .build();
    }
}
