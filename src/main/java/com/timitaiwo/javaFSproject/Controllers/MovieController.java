package com.timitaiwo.javaFSproject.Controllers;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timitaiwo.javaFSproject.MovieService;
import com.timitaiwo.javaFSproject.Models.Movie;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping()
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Movie> getMovieById(@PathVariable String imdbId) {
        Optional<Movie> movie = movieService.moviebyId(imdbId);

        if (movie.isPresent()) return new ResponseEntity<Movie>(movie.get(), HttpStatus.OK);

        return new ResponseEntity<>(new Movie(), HttpStatus.NOT_FOUND);
    }
}
