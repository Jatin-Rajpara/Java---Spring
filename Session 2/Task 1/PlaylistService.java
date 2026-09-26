package com.jatin;

public class PlaylistService {

    private SongRepository rs;

    public void setSongRepository(SongRepository rs) {
        this.rs = rs;
    }

    public void showPlaylist() {
        System.out.println("Playlist is ready");
        rs.showSongs();
    }
}