package org.wecancodeit.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.review.Review;

public interface ReviewRepository extends CrudRepository<Review, Long> {

}
