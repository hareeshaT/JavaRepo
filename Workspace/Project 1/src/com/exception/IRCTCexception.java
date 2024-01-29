package com.exception;

public class IRCTCexception extends Exception{
	private String message;

	public IRCTCexception(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
}
