package org.wecancodeit.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
