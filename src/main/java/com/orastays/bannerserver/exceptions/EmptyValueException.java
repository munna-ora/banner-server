package com.orastays.bannerserver.exceptions;

public class EmptyValueException extends Exception {

	static final long serialVersionUID = -3411512686819860112L;
 
	private String name;

	public EmptyValueException(String name) {
		super(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}