package com.pettify.beta.businessbean;

public class TypeBean {

	private String type;

	public TypeBean() {
		super();
	}

	public TypeBean(String type) {
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
		return "TypeBean [type=" + type + "]";
	}
	
	
}
