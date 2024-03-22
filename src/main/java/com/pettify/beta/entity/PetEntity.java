package com.pettify.beta.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Pet")
public class PetEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer petCode;
	
	private String name;
	private Integer age;
	private String about;
	
	@JoinColumn(name = "ownerId", referencedColumnName = "id")
	@ManyToOne
	private UserEntity ownerId;
	
	@JoinColumn(name = "type", referencedColumnName = "type")
	@ManyToOne
	private TypeEntity type;
	
	@JoinColumn(name = "breed", referencedColumnName = "breed")
	@ManyToOne
	private BreedEntity breed;

	public PetEntity(String name, Integer age, String about, UserEntity ownerId, TypeEntity type, BreedEntity breed) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.ownerId = ownerId;
		this.type = type;
		this.breed = breed;
	}

	public Integer getPetCode() {
		return petCode;
	}

	public void setPetCode(Integer petCode) {
		this.petCode = petCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public UserEntity getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(UserEntity ownerId) {
		this.ownerId = ownerId;
	}

	public TypeEntity getType() {
		return type;
	}

	public void setType(TypeEntity type) {
		this.type = type;
	}

	public BreedEntity getBreed() {
		return breed;
	}

	public void setBreed(BreedEntity breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "PetEntity [petCode=" + petCode + ", name=" + name + ", age=" + age + ", about=" + about + ", ownerId="
				+ ownerId + ", type=" + type + ", breed=" + breed + "]";
	}

}
