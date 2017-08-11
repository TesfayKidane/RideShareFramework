package framework.proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class CachingProxy<E> implements RealSubject<E> {

	private RealSubject<E> realSubject;
	private boolean isAccessAllowed;

	private HashMap<Object, List<E>> cache = new HashMap<>();
	List<E> cachedEntities = new ArrayList<E>();

	public CachingProxy() {
		// find in the hashmap and set isAllowedToConnectToDB
		

		realSubject = new RealSubjectImpl<E>();

	}

	public List<E> request(SearchInput input) {
		cachedEntities = (List<E>) cache.get(input.toString());
		if (cachedEntities == null) {
			isAccessAllowed = true;
		} else {
			isAccessAllowed = false;
			System.out.println("retrieved from cach..");
		}
		if (isAccessAllowed) {
			
			List<E> entities = realSubject.request(input);
			if (cache.size() > 1000) {
				
				Random random = new Random();
				List<Object> keys = new ArrayList<Object>(cache.keySet());
				Object randomKey = keys.get(random.nextInt(keys.size()));
				cache.remove(randomKey);

			}
			cache.put(input.toString(), entities);
			System.out.println("retrieved from Dao..");
			return entities;
		}

		return cachedEntities;
		// loop through hashmap and return the object

	}

}
