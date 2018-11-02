package org.wecancodeit.reviewssitefullstack.controller;

import javax.swing.text.html.HTML.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.reviewssitefullstack.repository.TagRepository;

@RestController
public class ApiController {

	@Autowired
	TagRepository tagRepo;
	
	@GetMapping("/api/tags")
	public Iterable<Tag> showTags() {
	return tagRepo.findAll();
	}
}
