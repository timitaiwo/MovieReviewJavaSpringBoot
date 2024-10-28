package com.timitaiwo.javaFSproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.timitaiwo.javaFSproject.Models.Movie;
import com.timitaiwo.javaFSproject.Models.Review;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public Review createReview(String imdbId, String reviewBody) {


        Review newReview = reviewRepository.insert(new Review(reviewBody));

        System.out.println(newReview);

        mongoTemplate.update(Movie.class)
                     .matching(Criteria.where("imdbId").is(imdbId))
                     .apply(new Update().push("reviewIds").value(newReview))
                     .first();

        return newReview;
    }

}
