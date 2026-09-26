package com.jatin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.jatin")
public class AppConfig {

    @Bean
    public RecommendationService rservice() {
        return new RecommendationService();
    }
}