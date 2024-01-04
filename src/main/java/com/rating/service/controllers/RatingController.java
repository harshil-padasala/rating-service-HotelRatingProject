package com.rating.service.controllers;

import com.rating.service.entities.Rating;
import com.rating.service.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    // creating rating
    @PostMapping
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
        Rating createdRating = ratingService.create(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdRating);
    }

    // getting all ratings
    @GetMapping
    public ResponseEntity<List<Rating>> fetchAllRatings() {
        return ResponseEntity.ok(ratingService.getAllRatings());
    }

    // fetching all ratings by userId
    @GetMapping("/user-id/{userId}")
    public ResponseEntity<List<Rating>> fetchAllRatingsByUserId(@PathVariable String userId) {
        return ResponseEntity.ok(ratingService.getAllRatingsByUserId(userId));
    }

    // fetching all ratings by hotelId
    @GetMapping("/hotel-id/{hotelId}")
    public ResponseEntity<List<Rating>> fetchAllRatingsByHotelId(@PathVariable String hotelId) {
        return ResponseEntity.ok(ratingService.getAllRatingsByHotelId(hotelId));
    }

    // Deleting ratings by ratingId
    @DeleteMapping("/{ratingId}")
    public ResponseEntity<Rating> deleteByRatingId(@PathVariable String ratingId) {
        return ResponseEntity.ok(ratingService.deleteRatingById(ratingId));
    }

    // Deleting ratings by UserId
    @DeleteMapping("/user-id/{user-id}")
    public ResponseEntity<Object> deleteRatingByUserId(@PathVariable("user-id") String userId) {
        ratingService.deleteRatingByUserId(userId);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
