package com.model;

public class Shampoo {
	private int Quantity;
	private String brand;
	private String color;
	private float price;
	
	public Shampoo(int quantity, String brand, String color, float price) {
		super();
		Quantity = quantity;
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}
