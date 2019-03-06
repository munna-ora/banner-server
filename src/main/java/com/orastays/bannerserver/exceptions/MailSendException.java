package com.orastays.bannerserver.exceptions;

public class MailSendException extends Exception {

	private static final long serialVersionUID = 5779626946944281683L;
	
	private String name;

	public MailSendException(String name) {
		super(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}