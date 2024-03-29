package com.lovingscience.reviews;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import java.util.Collection;

import org.junit.Test;

public class ReviewRepositoryTest {

	ReviewRepository underTest;

	private Long firstReviewId = 1L;
	private Review firstReview = new Review(firstReviewId, "name", "url", "category", "content");

	private Long secondReviewId = 2L;
	private Review secondReview = new Review(secondReviewId, "name", "url", "category", "content");

	@Test
	public void shoulFindAReview() {
		underTest = new ReviewRepository(firstReview);
		Review result = underTest.findOne(firstReviewId);
		assertThat(result, is(firstReview));
	}

	@Test
	public void shouldFindSecondReview() {
		underTest = new ReviewRepository(secondReview);
		Review result = underTest.findOne(secondReviewId);
		assertThat(result, is(secondReview));

	}

	@Test
	public void shouldFindAllReviews() {
		underTest = new ReviewRepository(firstReview, secondReview);
		Collection<Review> result = underTest.findAll();
		assertThat(result, containsInAnyOrder(firstReview, secondReview));

	}
}
