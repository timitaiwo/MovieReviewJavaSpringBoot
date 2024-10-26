package com.timitaiwo.javaFSproject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.timitaiwo.javaFSproject.Models.Movie;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> moviebyId(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }

    
}
