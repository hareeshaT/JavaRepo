package com.model;

public class Toy {
	private String color;
	private char size;
	private int price;
	private String name;
	private float weight;
	public Toy(String color, char size, int price, String name, float weight) {
		super();
		this.color = color;
		this.size = size;
		this.price = price;
		this.name = name;
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public char getSize() {
		return size;
	}
	public void setSize(char size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
}
