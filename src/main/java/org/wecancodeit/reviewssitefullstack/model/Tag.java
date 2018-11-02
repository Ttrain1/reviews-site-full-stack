package org.wecancodeit.reviewssitefullstack.model;

import java.util.Collection;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import antlr.collections.List;

@Embeddable
public class Tag {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@ManyToMany
	(mappedBy="review")
	private Collection<Review> reviews;
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Collection<Review> getReviews() {
		return reviews;
	}
	public Tag(String name, Collection<Review> reviews) {
		super();
		this.name = name;
		this.reviews = reviews;
	} 
	
	
}
