package rideshare.framework.cache.profile.decorator;

import java.util.List;

import rideshare.framework.cache.decorator.ACache;

public class LFUBasedCacheProfileDecorator<K, V> extends CacheProfileDecorator<K, V>{
    
	private long cacheUsageCount = 0;
	
	public LFUBasedCacheProfileDecorator(ACache<K, V> cache) {
		super(cache);
	}
	
	@Override
	public List<V> get(K key) {
		List<V> cachedValue = cache.get(key);
		if(cachedValue!=null){
			cacheUsageCount++;
		}
		return cache.get(key);
	}

	@Override
	public void set(K key, List<V> value) {
		cache.set(key, value);
	}
	
	public long getCacheUsageCount() {
		return cacheUsageCount;
	}
}
