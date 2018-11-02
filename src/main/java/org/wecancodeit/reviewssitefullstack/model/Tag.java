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
}
