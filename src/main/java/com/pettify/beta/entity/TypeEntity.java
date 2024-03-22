package com.pettify.beta.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Types")
public class TypeEntity {
	
	@Id
	private String type;
	
	public TypeEntity(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "TypeEntity [type=" + type + "]";
	}
	
}
