package org.wecancodeit.reviewssitefullstack.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.wecancodeit.reviewssitefullstack.repository.CategoryRepository;
import org.wecancodeit.reviewssitefullstack.repository.ReviewRepository;

@RunWith(SpringRunner.class)
@WebMvcTest(CategoryController.class)
public class CategoryControllerTest {

	@Autowired
	MockMvc mockmvc;

	@MockBean
	ReviewRepository reviewRepo;

	@MockBean
	CategoryRepository categoryRepo;

	@Test
	public void shouldBeOk() throws Exception {
		mockmvc.perform(get("/")).andExpect(status().isOk());
	}

}
