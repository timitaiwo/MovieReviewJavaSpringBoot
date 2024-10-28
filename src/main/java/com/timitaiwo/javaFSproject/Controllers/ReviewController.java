package com.timitaiwo.javaFSproject.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timitaiwo.javaFSproject.ReviewService;
import com.timitaiwo.javaFSproject.Models.Review;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("")
    public ResponseEntity<Review> addReview(@RequestBody Map<String, String> payload) {
        
        return new ResponseEntity<Review>(
                        reviewService.createReview(
                            payload.get("imdbId"),
                            payload.get("reviewBody")
                        ),
                        HttpStatus.CREATED
                    );
    }
}
