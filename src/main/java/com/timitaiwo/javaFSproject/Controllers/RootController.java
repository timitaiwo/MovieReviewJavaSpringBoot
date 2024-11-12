package com.timitaiwo.javaFSproject.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RootController {

    @GetMapping()
    public String rootMapping() {
        return "<b>This is not a valid url. Use /api/v1/movies to request information on all movies and their reviews and /api/v1/movies/{imdbID} to request information on a movie and it's reviews<b>";
    }
}
