package org.wecancodeit.reviewssitefullstack.model;

import java.util.Set;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


import antlr.collections.List;


@Entity
public class Tag {

	@Id
	@GeneratedValue
	private Long id;
	private String name;



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

