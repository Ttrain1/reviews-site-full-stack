package org.wecancodeit.reviewssitefullstack.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.wecancodeit.reviewssitefullstack.repository.ReviewRepository;

@Controller
public class ReviewController {
	
	@Resource
	ReviewRepository reviewRepo;
	
	@GetMapping("/review/{id}")
	public String index(@PathVariable (value="id")Long id ,Model model) {
	model.addAttribute("review", reviewRepo.findById(id));
	return("review");
	}
}
