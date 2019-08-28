package com.mumu.springcloud.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;

/**
 * @ClassName DemoApplication
 * @Description TODO
 * @Author caddyR
 * @Date 2019-06-14 11:24
 * @Version 1.0
 **/
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplicationBuilder builder=new SpringApplicationBuilder(DemoApplication.class);
        builder.bannerMode(Banner.Mode.OFF).run(args);
//        FilterRegistrationBean test=SpringUtil.getBean(FilterRegistrationBean.class);
//        int i=0;
    }
}
