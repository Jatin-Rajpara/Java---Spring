package com.jatin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        PlaylistService pservice =
                context.getBean(PlaylistService.class);

        RecommendationService rservice =
                context.getBean(RecommendationService.class);

        pservice.show();
        rservice.showr();
    }
}