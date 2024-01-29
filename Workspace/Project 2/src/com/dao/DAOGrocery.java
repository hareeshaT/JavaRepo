package com.dao;

import java.util.Set;

import com.exception.GroceryException;
import com.model.Biscuit;
import com.model.Grocery;
import com.model.Shampoo;
import com.model.Toy;

public interface DAOGrocery {
	public abstract Set<Object> createCart(Shampoo shampoo,Toy toy,Biscuit biscuit);
	
	public abstract Shampoo createShampoo(Shampoo shampoo) throws GroceryException;
	public abstract Set<Shampoo> shampoos();
	public abstract Shampoo readShampoo(String color);
	public abstract Shampoo updateShampoo(float price);
	public abstract Shampoo delShampoo(String brand);
	
	public abstract Toy createToy(Toy toy);
	public abstract Toy readToy(Toy toy);
	public abstract Toy updateToy(Toy toy);
	public abstract Toy delToy(Toy toy);
	
	public abstract Biscuit createBiscuit(Biscuit buscuit);
	public abstract Biscuit readBiscuit(Biscuit buscuit);
	public abstract Biscuit updateBiscuit(Biscuit buscuit);
	public abstract Biscuit delBiscuit(Biscuit buscuit);
}
