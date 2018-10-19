package org.wecancodeit.reviewssitefullstack.populator;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.reviewssitefullstack.model.Category;
import org.wecancodeit.reviewssitefullstack.model.Review;
import org.wecancodeit.reviewssitefullstack.repository.CategoryRepository;
import org.wecancodeit.reviewssitefullstack.repository.ReviewRepository;

@Service
public class ReviewSitePopulator implements CommandLineRunner {

	@Resource
	ReviewRepository reviewRepo;
	@Resource
	CategoryRepository categoryRepo;

	@Override

	public void run(String... args) throws Exception {

		Category game = categoryRepo.save(new Category("Game"));
		Category sprite = categoryRepo.save(new Category("Sprite"));
		Review link = reviewRepo.save(new Review("Link", "/images/link-to-the-past.png", "ads;lpkufgsdalkj", sprite));
		Review mario = reviewRepo
				.save(new Review("Mario", "/images/super-mario-world.png", "ads;lpkufgsdalkj", sprite));
		Review samus = reviewRepo.save(new Review("Samus", "/images/super-metroid.png", "ads;lpkufgsdalkj", sprite));
		Review linkToThePast = reviewRepo
				.save(new Review("Link To The Past", "/images/link-to-the-past-cover.png", "ads;lpkufgsdalkj", game));
		Review superMarioWorld = reviewRepo
				.save(new Review("Super Mario World", "/images/super-mario-world-cover.png", "ads;lpkufgsdalkj", game));
		Review superMetroid = reviewRepo
				.save(new Review("Super Metroid", "/images/super-metroid-cover.png", "ads;lpkufgsdalkj", game));

	}

}
