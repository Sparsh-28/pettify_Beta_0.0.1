package com.pettify.beta.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Breed")
public class BreedEntity {
	
	@Id
	private String breed;

	public BreedEntity(String breed) {
		super();
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "BreedEntity [breed=" + breed + "]";
	}

	
}
