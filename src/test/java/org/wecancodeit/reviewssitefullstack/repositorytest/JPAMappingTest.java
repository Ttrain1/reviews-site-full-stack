package org.wecancodeit.reviewssitefullstack.repositorytest;

import static org.hamcrest.Matchers.hasItems;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.wecancodeit.reviewssitefullstack.model.Category;
import org.wecancodeit.reviewssitefullstack.repository.CategoryRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class JPAMappingTest {

	@Resource
	CategoryRepository repo;
	

	@Test
	public void shouldReturnAllCategorys() {
		Category category = repo.save(new Category(""));

		Iterable<Category> result = repo.findAll();

		Assert.assertThat(result, hasItems(category));

	}
}