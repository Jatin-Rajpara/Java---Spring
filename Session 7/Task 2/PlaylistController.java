package com.jatin;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlaylistController {

    @RequestMapping("/playlists")
    public String showPlaylists(ModelMap model) {

        List<String> playlists = Arrays.asList(
                "My Favorites",
                "Workout Songs",
                "Romantic Songs",
                "Bollywood Hits"
        );

        model.addAttribute("playlists", playlists);

        return "playlists";
    }


    @RequestMapping("/addPlaylist")
    public String Show() {

        return "addPlaylist";
    }


    @RequestMapping("/savePlaylist")
    public String save(
            @RequestParam("name") String name,
            @RequestParam("description") String description,
            ModelMap model) {

        model.addAttribute("name", name);
        model.addAttribute("description", description);

        return "addPlaylist";
    }
}