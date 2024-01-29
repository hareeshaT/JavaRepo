package com.main;

import java.util.Set;

import com.dao.DAOPassenger;
import com.dao.DAOPassengerImpl;
import com.exception.IRCTCexception;
import com.model.Passenger;

public class IRCTCApp {

	public static void main(String[] args) {
		Passenger passenger = new Passenger(10,"Chandu",24);
		Passenger passenger2 = new Passenger(20,"Haree",23);
		Passenger dupPassenger = new Passenger(30,"Chandu",24);
		DAOPassenger daoPassenger=new DAOPassengerImpl();
		
		try {
			daoPassenger.createPassenger(passenger);
			daoPassenger.createPassenger(passenger2);
			daoPassenger.createPassenger(dupPassenger);
		}catch(IRCTCexception e){
			System.out.println(e.getMessage());
		}
		System.out.println("create passengers");
		Set<Passenger> chartPassengerSet=daoPassenger.passengerChart();
		System.out.println("Total Passengers count with duplicates is "+chartPassengerSet.size());
		for (Passenger passengerITR : chartPassengerSet) {
			System.out.print("PNR No: "+passengerITR.getPnrNo()+", ");
			System.out.print("PNR Name: "+passengerITR.getPnrName()+", ");
			System.out.println("PNR Age: "+passengerITR.getPnrAge());
		}
		System.out.println("Read by PNR");
		try {
			Passenger passengerDao=daoPassenger.readPassenger(20);
			if(passengerDao!=null) {
				System.out.print("Pnr No: "+passengerDao.getPnrNo()+", ");
				System.out.println("Pnr Name: "+passengerDao.getPnrName());
			}
		}catch(IRCTCexception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("update existing passenger");
		try {
			Passenger newPassenger = new Passenger(20,"Hareesha",24);
			Passenger passengerDao=daoPassenger.updatePassenger(newPassenger);
			System.out.print("pnr No: "+passengerDao.getPnrNo()+", ");
			System.out.print("pnr Name: "+passengerDao.getPnrName()+", ");
			System.out.println("pnr Age: "+passengerDao.getPnrAge());
		}
		catch(IRCTCexception e){
			System.out.println(e.getMessage());
		}
		System.out.println("delete duplicate passenger");
		try {
			Passenger removePassenger=daoPassenger.deletePassenger(30);
			System.out.print("pnr No: "+removePassenger.getPnrNo()+", ");
			System.out.print("pnr Name: "+removePassenger.getPnrName()+", ");
			System.out.println("pnr Age: "+removePassenger.getPnrAge());
		}
		catch(IRCTCexception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Total Passengers count without duplicates is "+chartPassengerSet.size());
		for (Passenger passengerITR : chartPassengerSet) {
			System.out.print("PNR No: "+passengerITR.getPnrNo()+", ");
			System.out.print("PNR Name: "+passengerITR.getPnrName()+", ");
			System.out.println("PNR Age: "+passengerITR.getPnrAge());
		}
	}

}