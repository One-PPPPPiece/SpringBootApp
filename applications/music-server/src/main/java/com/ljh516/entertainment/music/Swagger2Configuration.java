package com.ljh516.entertainment.music;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Configuration {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ljh516.entertainment.music"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiEndPointsInfo());
    }

    private ApiInfo apiEndPointsInfo() {

        String summary = "The **Music_API** is implemented as _microservice_ using Spring Boot. \n";

        String details =
                "\nThe following **Music_API** have been implemented in this project.\n"
                        + "- Create music api\n"
                        + "- Get all music api";

        return new ApiInfoBuilder()
                .title("Entertainment Music API")
                .version("1.0.0")
                .description(summary + details)
                .build();
    }
}
