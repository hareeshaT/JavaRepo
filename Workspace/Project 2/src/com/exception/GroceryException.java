package com.exception;

public class GroceryException extends Exception{
	private String message;

	public GroceryException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
	
}
