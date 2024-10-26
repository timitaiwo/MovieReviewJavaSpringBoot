package com.timitaiwo.javaFSproject;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.timitaiwo.javaFSproject.Models.Movie;
import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId>{

    Optional<Movie> findMovieByImdbId(String imdbId);

}
