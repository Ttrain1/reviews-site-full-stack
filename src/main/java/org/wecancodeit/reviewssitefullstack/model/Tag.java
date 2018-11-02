package org.wecancodeit.reviewssitefullstack.model;

import java.util.Set;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


import antlr.collections.List;


@Entity
@Embeddable
public class Tag {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
@ManyToMany
private Review review;
private Set<Review> reviews;

	public Long getId( ) {
		return id;
	}
	public String getName() {
		return name;
	}
	public Tag(String name) {
		this.name = name;
	}

	


	
}

