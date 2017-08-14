package edu.mum.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.RideDao;
import edu.mum.dao.impl.RideDaoCachingProxy;
import edu.mum.domain.Ride;
import edu.mum.domain.User;
import edu.mum.service.RideService;
import edu.mum.serviceimpl.proxy.CachingProxy;
import edu.mum.serviceimpl.proxy.Person;
import edu.mum.serviceimpl.proxy.RideDaoRealSubject;
import edu.mum.serviceimpl.proxy.SearchInput;

@Service
@Transactional 
public class RideServiceImpl implements RideService {
	
	
 	@Autowired
	private RideDao rideDao;

    public void save( Ride ride) {  		
		rideDao.save(ride);
	}
	
	
    public Ride update( Ride ride) {  		
		return rideDao.update(ride);
	}
	
	
	public List<Ride> findAll() {
		return (List<Ride>)rideDao.findAll();
	}

 	public Ride findOne(Long id) {
		return rideDao.findOne(id);
	}


	@Override
	public List<Ride> search(String source, String destination) {
		
//		return rideDao.search(source, destination);
//		return new RideDaoCachingProxy(source,destination).search(source, destination);
		CachingProxy<Ride> proxy = new CachingProxy<Ride>(new RideDaoRealSubject<Ride>(rideDao));
		SearchInput input = new SearchInput(source, destination);

		return proxy.request(input);
	}


	@Override
	public List<Ride> ridesCreatedByUser(Long userId) {
		return rideDao.ridesCreatedByUser(userId);
	}


	@Override
	public List<Ride> ridesJoinedByUser(Long userId) {
		return rideDao.ridesJoinedByUser(userId);
	}	
}
