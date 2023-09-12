package com.fact.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {SpringApplication.run(Demo2Application.class, args);}
    @Bean
    WebClient.Builder getWebClient()
    {
        return WebClient.builder();
    }
}
