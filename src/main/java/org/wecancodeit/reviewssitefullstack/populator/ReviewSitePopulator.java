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
				.save(new Review("Link To The Past", "/images/link-to-the-past-cover.png", "Rating: 8/10\r\n" + 
						"Link to the past  is one of my all time favorite games up in my to five the aesthetic and the feeling of adventure fostered my love of video game but is not a perfect game it can be easy to get lost in the  overworld world while trying to figure out what to do next and the indication markers on the map detract from the felling of the world in addition they are not that helpful in when traveling to  the dungeons. I personally would have liked to see these markers removed and replaced with an alternate hint.\r\n" + 
						"", game));
		Review superMarioWorld = reviewRepo
				.save(new Review("Super Mario World", "/images/super-mario-world-cover.png", "Rating: 8/10\r\n" + 
						"Super Mario is a great game that provides players with a friendly atmosphere and daunting challenge with 72 stages that range from easy to challenging super mario is a game that provides a great experience for gamers of all ages.\r\n" + 
						"", game));
		Review superMetroid = reviewRepo
				.save(new Review("Super Metroid", "/images/super-metroid-cover.png", "Rating 9/10\r\n" + 
						"Super metroid is one of the best 2D platformers of all time frome its atmosphere to its gameplay metroid is a joy to from play from your first trip through Zebes or your tenth. Super Metroid accomplishes this feat through its smart game design providing first time players with a clear path through all its dangers providing subtle hints about the complex strategies that can  allow players to blaze through the game on new  a playthrough skipping many of the introductory parts of the game. This ability to hold new players hands and allow old players the freedom to play their way is the mark of a truly great game.\r\n" + 
						"", game));

	}

}
