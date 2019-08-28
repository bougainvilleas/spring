package com.mumu.springcloud.demo.config.listeners;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionListener;

/**
 * @ClassName TestListenerConfig
 * @Description TODO
 * @Author caddyR
 * @Date 2019-07-16 09:51
 * @Version 1.0
 **/
//@Configuration
public class TestListenerConfig {
    @Bean("servletContextListenerRegistrationBean")
    public ServletListenerRegistrationBean<ServletContextListener> servletContextListenerRegistrationBean(){
        ServletListenerRegistrationBean<ServletContextListener> registrationBean=new ServletListenerRegistrationBean<>();
        registrationBean.setListener(new MyServletContextListerner());
        return registrationBean;
    }
    @Bean("servletSessionListenerRegistrationBean")
    public ServletListenerRegistrationBean<HttpSessionListener> servletSessionListenerRegistrationBean(){
        ServletListenerRegistrationBean<HttpSessionListener> registrationBean=new ServletListenerRegistrationBean<>();
        registrationBean.setListener(new MyServletSessionListerner());
        return registrationBean;
    }
    @Bean("servletRequestListenerRegistrationBean")
    public ServletListenerRegistrationBean<ServletRequestListener> servletRequestListenerRegistrationBean(){
        ServletListenerRegistrationBean<ServletRequestListener> registrationBean=new ServletListenerRegistrationBean<>();
        registrationBean.setListener(new MyServletRequestListerner());
        return registrationBean;
    }
}
