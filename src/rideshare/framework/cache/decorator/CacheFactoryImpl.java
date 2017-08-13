package rideshare.framework.cache.decorator;

import java.util.HashMap;
import java.util.Map;

public class CacheFactoryImpl<K, V> implements ICacheFactory<K, V>{
	
	private Map<CacheType, ACache<K, V>> caches = new HashMap<>();
	
	public CacheFactoryImpl(){
		caches.put(CacheType.OLDESTENTRY, new OldestEntryBasedCache<>());
		caches.put(CacheType.LFU, new LFUBasedCache<>());
		caches.put(CacheType.LRU, new LRUBasedCache<>());
	}
	
	@Override
	public ACache<K, V> creatCache(CacheType cacheType) {
		if(caches.containsKey(cacheType))
			return caches.get(cacheType);
		return null;
	}

}
