package org.wecancodeit.reviewssitefullstack.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String imageUrl;
	@Lob
	private String description;
	
	@ManyToOne
	private Category category;
	
	public Category getCategory() {
		return category;
	}

	public Review() {}
	
	public Review(String name, String imageUrl, String description, Category category) {
		this.name = name;
		this.imageUrl = imageUrl;
		this.description = description;
		this.category= category;
	
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

