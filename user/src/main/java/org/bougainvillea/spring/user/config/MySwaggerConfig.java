package org.bougainvillea.spring.user.config;

import org.bougainvilleas.spring.web.SwaggerConfig;
import org.bougainvilleas.spring.web.SwaggerInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.Assert;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
@EnableOpenApi
public class MySwaggerConfig
{

    SwaggerConfig swaggerConfig;

    public MySwaggerConfig(SwaggerConfig swaggerConfig)
    {
        Assert.notNull(swaggerConfig, "SwaggerConfig must be not null");
        this.swaggerConfig = swaggerConfig;
    }

    private ApiInfo userApiInfo()
    {
        return new ApiInfoBuilder()
                .title("user center")
                .description("用户中心")
                .contact(swaggerConfig.getSwaggerInfo().getContact())
                .version("0.0.3")
                .termsOfServiceUrl(swaggerConfig.getSwaggerInfo().getServiceUrl())
                .license(swaggerConfig.getSwaggerInfo().getLicense())
                .licenseUrl(swaggerConfig.getSwaggerInfo().getLicenseUrl())
                .build();
    }

    @Bean
    public Docket v1Api()
    {

        return new Docket(DocumentationType.OAS_30)
                .groupName("v1")
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.bougainvillea.spring.user.v1")
                        .or(RequestHandlerSelectors.basePackage("org.bougainvillea.spring.user"))
                )
                .paths(PathSelectors.regex("/stop").negate())
                .build()
                .apiInfo(userApiInfo());
    }
}
