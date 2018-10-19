package org.wecancodeit.reviewssitefullstack.repository;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.wecancodeit.reviewssitefullstack.model.Category;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CategoryRepositoryTest {

	@Resource
	CategoryRepository repo;

	@Test
	public void shouldReturnAllContacts() {
		// Arrange
		Category category = repo.save(new Category(""));

		// Act
		Iterable<Category> result = repo.findAll();

		// Assert
		assertThat(result, contains(category));
	}
}
