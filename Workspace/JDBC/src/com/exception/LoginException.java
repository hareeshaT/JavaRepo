package com.exception;

public class LoginException extends Exception {
	private String errMessage;

	public LoginException(String errMessage) {
		super();
		this.errMessage = errMessage;
	}

	@Override
	public String getMessage() {
		return this.errMessage;
	}
	
}
