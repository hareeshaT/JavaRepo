package com.dao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.exception.GroceryException;
import com.model.Biscuit;
import com.model.Grocery;
import com.model.Shampoo;
import com.model.Toy;

public class DAOGroceryImpl implements DAOGrocery{
	
	static Set<Object> GroceryItems = new HashSet();
	static Set<Shampoo> shampooSet = new HashSet();
	
	@Override
	public Set<Object> createCart(Shampoo shampoo, Toy toy, Biscuit biscuit) {
		GroceryItems.add(shampoo);
		GroceryItems.add(toy);
		GroceryItems.add(biscuit);
		return GroceryItems;
	}

	@Override
	public Shampoo createShampoo(Shampoo shampoo) throws GroceryException {
		shampooSet.add(shampoo);
		return shampoo;
	}
	
	@Override
	public Set<Shampoo> shampoos() {
		return shampooSet;
	}

	@Override
	public Shampoo readShampoo(String color) {
		Shampoo realShampoo = null;
		for (Shampoo shampoo : shampooSet) {
			if(shampoo.getColor()==color) {
				realShampoo=shampoo;
			}
		}
		return realShampoo;
	}

	@Override
	public Shampoo updateShampoo(float price) {
		Shampoo realShampoo=null;
		for (Shampoo shampoo : shampooSet) {
			if(shampoo.getQuantity()==500) {
				shampoo.setPrice(price);
				realShampoo=shampoo;
			}
		}
		return realShampoo;
	}

	@Override
	public Shampoo delShampoo(String brand) {
		Shampoo duplicateShampoo=null;
		for (Shampoo shampoo : shampooSet) {
			if(shampoo.getBrand().equals(brand) && shampoo.getColor().equals("pink")) {
				shampooSet.remove(shampoo);
				duplicateShampoo=shampoo;
			}
		}
		return duplicateShampoo;
	}
	

	@Override
	public Toy createToy(Toy toy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Toy readToy(Toy toy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Toy updateToy(Toy toy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Toy delToy(Toy toy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Biscuit createBiscuit(Biscuit buscuit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Biscuit readBiscuit(Biscuit buscuit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Biscuit updateBiscuit(Biscuit buscuit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Biscuit delBiscuit(Biscuit buscuit) {
		// TODO Auto-generated method stub
		return null;
	}

}
