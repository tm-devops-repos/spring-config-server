package com.tmgreyhat.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication
@ConfigurationProperties
public class ConfigConsumer {
    public static void main(String[] args) {
        SpringApplication.run(ConfigConsumer.class, args);
    }
}