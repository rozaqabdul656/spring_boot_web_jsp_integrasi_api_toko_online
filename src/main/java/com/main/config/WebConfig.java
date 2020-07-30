package com.main.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
    	   registry.addResourceHandler("/admin/**/*").addResourceLocations("classpath:/static/");
    	   registry.addResourceHandler("/front_end/**/*").addResourceLocations("classpath:/static/front_end/");
    	   
    	   registry.addResourceHandler("/img/*").addResourceLocations("/ui/img/");
//    	     registry.addResourceHandler("/*.css/**").addResourceLocations("/ui/img/");
    	     
    }
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
//        registry.addViewController("/login").setViewName("login");
    }
    	
}
