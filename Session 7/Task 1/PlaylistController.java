package com.jatin;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlaylistController {

    @RequestMapping("/playlists")
    public String show(ModelMap model) {

        List<String> playlists = Arrays.asList(
                "My Favorites",
                "Workout Songs",
                "Romantic Songs",
                "Bollywood Hits"
        );

        model.addAttribute("playlists", playlists);

        return "playlists";
    }
}