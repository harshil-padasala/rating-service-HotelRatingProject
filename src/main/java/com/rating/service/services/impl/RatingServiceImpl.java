package com.rating.service.services.impl;

import com.rating.service.entities.Rating;
import com.rating.service.repositories.RatingRepository;
import com.rating.service.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating create(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getAllRatingsByUserId(String userId) {
        return ratingRepository.findRatingsByUserId(userId);
    }

    @Override
    public List<Rating> getAllRatingsByHotelId(String hotelId) {
        return ratingRepository.findRatingsByHotelId(hotelId);
    }

    @Override
    public Rating deleteRatingById(String ratingId) {
        Rating rating = ratingRepository.findById(ratingId).orElseThrow();
        ratingRepository.deleteById(ratingId);

        return rating;
    }

    @Override
    public void deleteRatingByUserId(String userId) {
        ratingRepository.deleteRatingByUserId(userId);
    }


}
