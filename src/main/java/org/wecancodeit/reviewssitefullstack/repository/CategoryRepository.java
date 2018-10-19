package org.wecancodeit.reviewssitefullstack.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviewssitefullstack.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
