package com.model;

public class Grocery {
	private int ItemCount;
	private Shampoo shampoo;
	private Toy toy;
	private Biscuit biscuit;
	
	public Grocery() {
		super();
	}
	
	public Grocery(int itemCount, Shampoo shampoo, Toy toy, Biscuit biscuit) {
		super();
		ItemCount = itemCount;
		this.shampoo = shampoo;
		this.toy = toy;
		this.biscuit = biscuit;
	}

	public int getItemCount() {
		return ItemCount;
	}
	public void setItemCount(int itemCount) {
		ItemCount = itemCount;
	}
	public Shampoo getShampoo() {
		return shampoo;
	}
	public void setShampoo(Shampoo shampoo) {
		this.shampoo = shampoo;
	}
	public Toy getToy() {
		return toy;
	}
	public void setToy(Toy toy) {
		this.toy = toy;
	}
	public Biscuit getBiscuit() {
		return biscuit;
	}
	public void setBiscuit(Biscuit biscuit) {
		this.biscuit = biscuit;
	}
}
