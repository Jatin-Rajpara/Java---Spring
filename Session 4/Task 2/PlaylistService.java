package com.jatin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlaylistService {

    @Autowired
    private SongService songService;

    public void show() {
        System.out.println("Active SongService...");
    }
}