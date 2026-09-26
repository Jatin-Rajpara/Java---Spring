package com.jatin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Playlist playlist = context.getBean("playlist", Playlist.class);
        Song song = context.getBean("song", Song.class);

        System.out.println("Playlist: " + playlist.getName());
        System.out.println("Song: " + song.getTitle());
        System.out.println("Artist: " + song.getArtist());
    }
}