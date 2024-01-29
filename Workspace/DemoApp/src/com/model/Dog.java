package com.model;

public class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}
	
	public String speak(String name) {
		return name+ " barks";
	}
}
