package com.jatin;

public class PlaylistService {

    private SongRepository songRepository;

    public PlaylistService(SongRepository rs) {
        this.rs = rs;
    }

    public void showPlaylist() {
        System.out.println("Playlist is ready");
        rs.showSongs();
    }
}