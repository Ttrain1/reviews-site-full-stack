package org.wecancodeit.reviewssitefullstack.model;

import java.util.Set;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
import antlr.collections.List;


public class Tag {

	@Id
	@GeneratedValue
	private Long id;
	private String name;


	@ManyToMany(mappedBy = "tag")
	private Set<Review> reviews;

	public String getName() {
		return name;
	}

	public Set<Review> getReviews() {
		return reviews;
	}


	
}

