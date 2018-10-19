package org.wecancodeit.reviewssitefullstack.model;

import java.util.HashSet;
import java.util.Set;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue
	private Long id;
	private String name;

	@OneToMany
	(mappedBy="category")
	private Set<Review> reviews = new HashSet<Review>();
	
	public Category() {
	}

	public Category(String name) {
		this.name = name;
	}

	public Set<Review> getReviews() {
		return reviews;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
