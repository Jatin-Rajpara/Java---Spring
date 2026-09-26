package com.jatin;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.jatin");

        PlaylistService service =
                context.getBean(PlaylistService.class);

        service.show();
    }
}