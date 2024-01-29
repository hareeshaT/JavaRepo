package com.dao;

import java.util.Set;

import com.exception.IRCTCexception;
import com.model.Passenger;

public interface DAOPassenger {
	public abstract Passenger createPassenger(Passenger passenger) throws IRCTCexception;
	public abstract Set<Passenger> passengerChart();
	public abstract Passenger readPassenger(int pnrNo) throws IRCTCexception;
	public abstract Passenger updatePassenger(Passenger passenger) throws IRCTCexception;
	public abstract Passenger deletePassenger(int pnrNo) throws IRCTCexception;
}
