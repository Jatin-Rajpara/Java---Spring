package com.jatin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlaylistService {

    @Autowired
    private SongService service;

    public void show() {
        System.out.println("it's active with SongService...");
    }
}