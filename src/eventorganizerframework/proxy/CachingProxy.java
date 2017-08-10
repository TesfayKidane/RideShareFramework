package eventorganizerframework.proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;



public class CachingProxy<E> implements RealSubject<E> {
	public void setChecker(ConditionChecker checker) {
		this.checker = checker;
	}

	private RealSubject<E> realSubject;
	private ConditionChecker checker;

	private HashMap<Object, List<E>> cache = new HashMap<>();
	List<E> cachedEntities = new ArrayList<E>();

	public CachingProxy(Object key) {
		// find in the hashmap and set isAllowedToConnectToDB
		cachedEntities = (List<E>) cache.get(key.toString());

		realSubject = new RealSubjectImpl<E>();

	}

	public List<E> request(Object input) {
		if (checker.check()) {
			List<E> entities = realSubject.request(input);
			if (cache.size() > 1000) {

				Random random = new Random();
				List<Object> keys = new ArrayList<Object>(cache.keySet());
				Object randomKey = keys.get(random.nextInt(keys.size()));
				cache.remove(randomKey);

			}
			cache.put(input.toString(), entities);
			return entities;
		}

		return cachedEntities;
		// loop through hashmap and return the object

	}

}
