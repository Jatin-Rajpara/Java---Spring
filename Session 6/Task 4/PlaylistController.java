package com.jatin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlaylistController {

    @GetMapping("/addSong")
    public String addSong() {
        return "addSong";
    }

    @PostMapping("/save")
    public String saveSong(
            @RequestParam("songName") String songName,
            @RequestParam("artist") String artist,
            ModelMap model) {

        model.addAttribute("songName", songName);
        model.addAttribute("artist", artist);

        return "songConfirmation";
    }
}