package org.wecancodeit.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.model.Review;

public interface ReviewRepository extends CrudRepository<Review, Long> {

}
