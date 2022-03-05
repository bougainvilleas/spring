package org.bougainvilleas.spring.web;


import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.Assert;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

/**
 * @author renqiankun
 * 2022-03-04 16:03:46 星期五
 */
@Configuration
@EnableConfigurationProperties(SwaggerInfo.class)
@EnableOpenApi
public class SwaggerConfig
{

    private final SwaggerInfo swaggerInfo;

    public SwaggerConfig(SwaggerInfo swaggerInfo)
    {
        Assert.notNull(swaggerInfo, "SwaggerConfig must be not null");
        this.swaggerInfo = swaggerInfo;
    }

    /**
     * 单元测试使用
     */
    public String getBasePackage() {
        return swaggerInfo.getBasePackage();
    }

    public SwaggerInfo getSwaggerInfo() {
        return swaggerInfo;
    }

    @Bean
    public Docket api()
    {
        return new Docket(DocumentationType.OAS_30)
                .select()
                .apis(RequestHandlerSelectors.basePackage(swaggerInfo.getBasePackage()))
                .paths(PathSelectors.regex(swaggerInfo.getPathRegex()).negate())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo()
    {
        return new ApiInfo(
                swaggerInfo.getTitle(),
                swaggerInfo.getDescription(),
                swaggerInfo.getVersion(),
                swaggerInfo.getServiceUrl(),
                swaggerInfo.getContact(),
                swaggerInfo.getLicense(),
                swaggerInfo.getLicenseUrl(),
                Collections.emptyList());
    }
}
