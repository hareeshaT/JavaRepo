package com.model;

public class cat extends Animal{
	public cat(String Name){
		super(Name);
	}
	
	public String speak(String name) {
		//return super.speak(name);
		return name+" Meow Meow";
	}
}
