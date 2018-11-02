package org.wecancodeit.reviewssitefullstack.repository;

import javax.swing.text.html.HTML.Tag;

import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Tag,Long>{

	Tag findByNameIgnoreCase(String name);
}
