package com.pettify.beta.businessbean;

public class PetBean {
	
	private Integer petId;
	private String petName;
	private Integer age;
	private String about;
	private Integer ownerId;
	private String type;
	private String breed;
	
	public PetBean() {
		super();
	}

	public PetBean(Integer petId, String petName, Integer age, String about, Integer ownerId, String type,
			String breed) {
		super();
		this.petId = petId;
		this.petName = petName;
		this.age = age;
		this.about = about;
		this.ownerId = ownerId;
		this.type = type;
		this.breed = breed;
	}

	public Integer getPetId() {
		return petId;
	}

	public void setPetId(Integer petId) {
		this.petId = petId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "PetBean [petId=" + petId + ", petName=" + petName + ", age=" + age + ", about=" + about + ", ownerId="
				+ ownerId + ", type=" + type + ", breed=" + breed + "]";
	}
	
}
