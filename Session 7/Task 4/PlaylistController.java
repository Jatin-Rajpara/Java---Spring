package com.jatin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlaylistController {

    List<String> playlists = new ArrayList<>();

    public PlaylistController() {
        playlists.add("My Favorites");
        playlists.add("Workout Songs");
        playlists.add("Romantic Songs");
        playlists.add("Bollywood Hits");
    }

    @RequestMapping("/playlists")
    public String show(ModelMap model) {

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

        playlists.add(name);

        return "redirect:/playlists";
    }
}