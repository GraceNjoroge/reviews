package com.lovingscience.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository

public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();
	
	public ReviewRepository() {
		Review cOSI = new Review (1L, "COSI", "COSI.jpg", "Columbus","Explore science! COSI is a dynamic hands-on science center with lots to do for all ages.");
		Review franklinParkConservatory	= new Review (2L, "FranklinParkConservatory", "FPC.jpg", "Columbus", "A botanical garden and conservatory showcasing exotic plant collections, special exhibitions and artwork.");
		Review ohioHistoryCenter = new Review (3L, "OhioHistoryCenter", "Imagination.jpg", "Columbus", "Showcases Ohio's rich history from the ice age to today.");
		Review greatLakesScienceCenter = new Review (4L, "GreatLakesScienceCenter", "NASA.jpg", "Cleveland", "Education facility with science, technology, engineering and math to inform decision making and enrich lives.");
		Review imaginationStation = new Review (5L, "ImaginationStation", "OHC.jpg", "Toledo", "Hand-on science museum with over 300 fun exhibits for people of all ages.");
		
		reviewList.put(cOSI.getId(), cOSI);
		reviewList.put(franklinParkConservatory.getId(), franklinParkConservatory);
		reviewList.put(ohioHistoryCenter.getId(), ohioHistoryCenter);
		reviewList.put(greatLakesScienceCenter.getId(), greatLakesScienceCenter);
		reviewList.put(imaginationStation.getId(), imaginationStation);
		
	}

//constructor for testing purposes
	public ReviewRepository(Review... reviews) {
		for (Review review : reviews) {
			reviewList.put(review.getId(),review);
		}
	}

	public Review findOne(Long id) {
		return reviewList.get(id);
	}

	public Collection<Review> findAll() {
		return reviewList.values();
	}

}
