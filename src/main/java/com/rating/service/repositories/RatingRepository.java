package com.rating.service.repositories;

import com.rating.service.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends MongoRepository<Rating, String> {

    // get all rating by userId
    List<Rating> findRatingsByUserId(String userId);

    // get all ratings by hotelId
    List<Rating> findRatingsByHotelId(String hotelId);

    void deleteRatingByUserId(String userID);
}
