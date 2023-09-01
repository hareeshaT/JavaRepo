package com.model;

public class Animal {
	protected String name;

	public Animal(String name) {
		super();
		this.name=name;
	}
	
	public String speak(String name) {
		return name+" speaks";
	}
}
