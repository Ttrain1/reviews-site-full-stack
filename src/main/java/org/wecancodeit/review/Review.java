package org.wecancodeit.review;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String imageUrl;
	private String description;
	
	public Review() {}
	
	public Review(String name, String imageUrl, String description) {
		this.name = name;
		this.imageUrl = imageUrl;
		this.description = description;
	
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public String getDescription() {
		return description;
	}
	
	
}

