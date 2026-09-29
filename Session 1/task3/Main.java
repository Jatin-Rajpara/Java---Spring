package com.jatin;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Playlist playlist = context.getBean(Playlist.class);

        System.out.println(playlist);

        context.close();
    }
}