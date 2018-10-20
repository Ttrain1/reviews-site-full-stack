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
		Review link = reviewRepo.save(new Review("Link", "/images/link-to-the-past.png", "Rating: 8/10\r\n" + 
				"Links sprite page contains all of Links extensive animation set along with a few unique animation loops to deal with one time key events. In addition Link’s sheet contains all ancillary items that link generates in his attack animation. The one problem with this sheet is that there are a few repeated keyframes in the the walk animation cycle.\r\n" + 
				" " , sprite));
		Review mario = reviewRepo
				.save(new Review("Mario", "/images/super-mario-world.png", "Rating: 10/10\r\n" + 
						"Mario’s sprite is one of the most iconic sprites of all time. The use of only four key frames for Mariols run cycle and two for his jump provide the striking visuales that have been the gold standard for sprite animation in the modern day.\r\n" + 
						"", sprite));
		Review samus = reviewRepo.save(new Review("Samus", "/images/super-metroid.png", "Rating: 9/10\r\n" + 
				"Samus nonsymmetrical sprite requires key frames for her left and right side this requirement prevents simply reflecting her key frames. The attention to detail handling this shows the fanese used when managing her 8 farme move cycle.\r\n" + 
				"", sprite));
		Review linkToThePast = reviewRepo
				.save(new Review("Link To The Past", "/images/link-to-the-past-cover.png", "ads;lpkufgsdalkj", game));
		Review superMarioWorld = reviewRepo
				.save(new Review("Super Mario World", "/images/super-mario-world-cover.png", "ads;lpkufgsdalkj", game));
		Review superMetroid = reviewRepo
				.save(new Review("Super Metroid", "/images/super-metroid-cover.png", "ads;lpkufgsdalkj", game));

	}

}
