package org.wecancodeit.reviewssitefullstack.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.wecancodeit.reviewssitefullstack.repository.CategoryRepository;

@Controller
public class CategoryController {

	@Resource
	CategoryRepository categoryRepo;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("categories", categoryRepo.findAll());
		return "index";
	}
}
