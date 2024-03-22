package com.pettify.beta.businessbean;

public class BreedBean {
	
	private String breed;

	public BreedBean() {
		super();
	}

	public BreedBean(String breed) {
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
		return "BreedBean [breed=" + breed + "]";
	}

}
