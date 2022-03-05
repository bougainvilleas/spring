package org.bougainvilleas.spring.web;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import springfox.documentation.service.Contact;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author renqiankun
 * 2022-03-04 17:26:53 星期五
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Component
@ConfigurationProperties(prefix = "swagger")
public class SwaggerInfo
{
    private boolean enable;
    private String basePackage;
    private String pathRegex;
    private String title;
    private String description;
    private String version;
    private String serviceUrl;
    private String license;
    private String licenseUrl;
    private String name;
    private String url;
    private String email;

    private Contact contact;

    public Contact getContact()
    {
        return new Contact(name,url,email);
    }
}
