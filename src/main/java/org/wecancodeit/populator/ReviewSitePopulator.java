package org.wecancodeit.populator;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.model.Category;
import org.wecancodeit.model.Review;
import org.wecancodeit.repository.CategoryRepository;
import org.wecancodeit.repository.ReviewRepository;

@Service
public class ReviewSitePopulator implements CommandLineRunner {
	
	@Resource
	ReviewRepository reviewRepo;
	@Resource
	CategoryRepository categoryRepo;
	
	@Override
	
	public void run(String...args) throws Exception {
		Category game = categoryRepo.save(new Category("Game"));
		Category sprite = categoryRepo.save(new Category("Sprite"));
		Review link = reviewRepo.save(new Review("Link", "/images/link-to-the-past.png", "ads;lpkufgsdalkj"));
		Review mario = reviewRepo.save(new Review("Mario", "/images/super-mario-world.png", "ads;lpkufgsdalkj"));
		Review samus = reviewRepo.save(new Review("Samus", "/images/super-metroid.png", "ads;lpkufgsdalkj"));
		Review linkToThePast = reviewRepo.save(new Review("Link To The Past", "/images/link-to-the-past.png", "ads;lpkufgsdalkj"));
		Review superMarioWorld = reviewRepo.save(new Review("Super Mario World", "/images/link-to-the-past.png", "ads;lpkufgsdalkj"));
		Review superMetroid = reviewRepo.save(new Review("Super Metroid", "/images/link-to-the-past.png", "ads;lpkufgsdalkj"));

	}

}
