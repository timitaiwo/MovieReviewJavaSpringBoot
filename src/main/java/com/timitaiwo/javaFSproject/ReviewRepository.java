package com.timitaiwo.javaFSproject;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.timitaiwo.javaFSproject.Models.Review;

public interface ReviewRepository extends MongoRepository<Review, ObjectId> {

}
