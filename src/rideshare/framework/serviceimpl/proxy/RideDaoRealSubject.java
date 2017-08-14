package edu.mum.serviceimpl.proxy;

import java.util.List;

import edu.mum.dao.RideDao;
import edu.mum.domain.Ride;

public class RideDaoRealSubject<Ride> implements RealSubject<Ride> {
	
	private RideDao rideDao;
	public RideDaoRealSubject(RideDao rideDao) {
		
		this.rideDao = rideDao;
	}
	@Override
	public List<Ride> request(SearchInput input) {
		// TODO Auto-generated method stub
		
		return (List<Ride>)rideDao.search(input.getParam1(),input.getParam2());
	}
}
