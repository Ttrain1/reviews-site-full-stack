package org.wecancodeit.populator;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class ReviewSitePopulator implements CommandLineRunner {
	
	@Resource
	ReviewRepository reviewRepo;
	@Resource
	CatagoryRepository catagoryRepo;
	
	@Override
	
	public void run(String...args) throws Exception {
		
	}

}
