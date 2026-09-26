package com.jatin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public RecommendationService service() {
        return new RecommendationService();
    }
}