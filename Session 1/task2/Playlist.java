package com.jatin;

import org.springframework.stereotype.Component;

@Component
public class Playlist {

    private String name = "My Playlist";
    private String createdBy = "Jatin";
    private int songCount = 5;

    public String getName() {
        return name;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public int getSongCount() {
        return songCount;
    }

    @Override
    public String toString() {
        return "Playlist Name: " + name +
                ", Created By: " + createdBy +
                ", Songs: " + songCount;
    }
}