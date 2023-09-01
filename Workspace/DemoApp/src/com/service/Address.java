package com.service;

public class Address {
	private int streetNum;
	private String City;
	private String State;
	private String Country;
	
	public Address(int streetNum, String city, String state, String country) {
		super();
		this.streetNum = streetNum;
		City = city;
		State = state;
		Country = country;
	}

	public int getStreetNum() {
		return streetNum;
	}

	public void setStreetNum(int streetNum) {
		this.streetNum = streetNum;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}
}
