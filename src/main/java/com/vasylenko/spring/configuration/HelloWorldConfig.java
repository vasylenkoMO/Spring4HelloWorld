package com.vasylenko.spring.configuration;

import com.vasylenko.spring.domain.HelloWorld;
import com.vasylenko.spring.domain.HelloWorldImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

/**
 * Created by vastl271nko on 08.10.16.
 */

@Configuration

public class HelloWorldConfig {

    @Bean(name = "helloWorldBean")
    @Description("This is a sample HelloWorld Bean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
}
