package com.rating.service.services;

import com.rating.service.entities.Rating;

import java.util.List;

public interface RatingService {

    // Create
    Rating create(Rating rating);

    // get all ratings
    List<Rating> getAllRatings();

    // get all rating by userId
    List<Rating> getAllRatingsByUserId(String userId);

    // get all ratings by hotelId
    List<Rating> getAllRatingsByHotelId(String hotelId);

    // delete rating by ratingId
    Rating deleteRatingById(String ratingId);

    void deleteRatingByUserId(String userId);
}
