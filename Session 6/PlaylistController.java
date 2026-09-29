package com.jatin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlaylistController {

    @GetMapping("/addSong.action")
    public String addSong() {
        return "addSong";
    }
}
