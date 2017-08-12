package rideshare.framework.proxy.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import rideshare.framework.proxy.RealSubject;
import rideshare.framework.proxy.SearchInput;



public class CachingProxy<E> implements RealSubject<E>, ResourceObserver<E> {

	// proxy pattern
	private RealSubject<E> realSubject;
	private boolean isAccessAllowed;

	private HashMap<Object, List<E>> cache = new HashMap<>();
	List<E> cachedEntities = new ArrayList<E>();

	public CachingProxy() {

		// find in the hashmap and set isAllowedToConnectToDB

		realSubject = new RealSubjectImpl<E>();

	}

	// observer pattern
	public CachingProxy(ResourceSubject<E> resourceSubject) {
		this();
		resourceSubject.attach(this);
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

	// observer pattern
	@Override
	public void updateCache(E removedEntity) {
		// TODO Auto-generated method stub
		// remove the removedRide from cache
		int keyCounter = -1;
		int foundKey = -1;
		
		Iterator it = cache.entrySet().iterator();
	    while (it.hasNext()) {
	    
	    	keyCounter++;
	    	Map.Entry pair = (Map.Entry)it.next();
//	        System.out.println(pair.getKey() + " = " + pair.getValue());
	    	List<E> Entities = (List<E>) pair.getValue();
	    	Object key = pair.getKey();
	    	boolean isFound=false;
	    			
				// cachedEntities.remove(removedEntity);
				
				for (E entity : Entities) {
					
					if (entity.toString().equals(removedEntity.toString())) {
						cache.remove(key);
						isFound=true;
						break;
					}
				}
				if (isFound) {
					break;
				}
			}
//		it.remove(); // avoids a ConcurrentModificationException
//				cache.remove(foundKey);
//				cachedEntities = (List<E>) cache.get(foundKey);
				System.out.println("Proxy Cache was updated after removing the object from the resource.");
			}
		

	}


