package org.wecancodeit.reviewssitefullstack.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviewssitefullstack.model.Review;

public interface ReviewRepository extends CrudRepository<Review, Long> {

}
