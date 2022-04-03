package ru.gb.gbsbmarch.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @ConditionalOnProperty("test.property")
    @Bean
    public String testBean() {
        System.out.println("test");
        return "test";
    }
}
