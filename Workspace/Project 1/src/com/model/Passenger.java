package com.model;

public class Passenger {
	private int pnrNo;
	private String pnrName;
	private int pnrAge;
	public Passenger(int pnrNo, String pnrName, int pnrAge) {
		super();
		this.pnrNo = pnrNo;
		this.pnrName = pnrName;
		this.pnrAge = pnrAge;
	}
	public Passenger() {
		super();
	}
	public int getPnrNo() {
		return pnrNo;
	}
	public void setPnrNo(int pnrNo) {
		this.pnrNo = pnrNo;
	}
	public String getPnrName() {
		return pnrName;
	}
	public void setPnrName(String pnrName) {
		this.pnrName = pnrName;
	}
	public int getPnrAge() {
		return pnrAge;
	}
	public void setPnrAge(int pnrAge) {
		this.pnrAge = pnrAge;
	}
	
}
