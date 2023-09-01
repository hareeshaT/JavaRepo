package com.dao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.exception.IRCTCexception;
import com.model.Passenger;

public class DAOPassengerImpl implements DAOPassenger{
	
	static Set<Passenger> passengerSet = new HashSet();

	@Override
	public Passenger createPassenger(Passenger passenger) throws IRCTCexception {
		passengerSet.add(passenger);
		return passenger;
	}
	
	@Override
	public Set<Passenger> passengerChart() {
		return passengerSet;
	}

	@Override
	public Passenger readPassenger(int pnrNo) throws IRCTCexception {
		Passenger realPassenger=null;
		for (Passenger passenger : passengerSet) {
			if(passenger.getPnrNo()==pnrNo) {
				realPassenger=passenger;
			}
		}
		if(realPassenger==null) {
			throw new IRCTCexception("The "+pnrNo+" passenger is not found");
		}
		return realPassenger;
	}

	@Override
	public Passenger updatePassenger(Passenger passenger) throws IRCTCexception {
		Passenger newPassenger=null;
		for (Passenger passenger2 : passengerSet) {
			if(passenger2.getPnrNo()==passenger.getPnrNo()) {
				passenger2=passenger;
				newPassenger=passenger2;
			}
		}
		if(newPassenger==null) {
			throw new IRCTCexception("The "+newPassenger+" Passenger details updated"); 
		}
		return newPassenger;
	}

	@Override
	public Passenger deletePassenger(int pnrNo) throws IRCTCexception {
		Passenger removedPassenger=null;
		for (Passenger passenger : passengerSet) {
			if(passenger.getPnrNo()==pnrNo) {
				passengerSet.remove(passenger);
				removedPassenger=passenger;
			}
		}
		if(removedPassenger==null) {
			throw new IRCTCexception("The "+pnrNo+" Passenger not found to delete"); 
		}
		return removedPassenger;
	}

}
