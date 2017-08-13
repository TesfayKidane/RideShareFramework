package rideshare.framework.cache.decorator;

import java.util.LinkedHashMap;
import java.util.List;

public abstract class ACache<K, V> {
	private long currentTime = 0;
	private long cacheCapacity = 1000;
	protected LinkedHashMap<K, ACacheEntry<V>> cacheMap = new LinkedHashMap<>();
	
	public abstract List<V> get(K key);

	public abstract void set(K key, List<V> value);

	public long getNormalizedUsageTime() {		
		return ++currentTime;
	}

	public boolean isCacheFull() {
		if(cacheMap.size() == cacheCapacity)
			return true;
		return false;
	}

	public void setCacheCapacity(long cacheCapacity) {
		this.cacheCapacity = cacheCapacity;		
	}
	
	public long getCacheCapacity() {
		return cacheCapacity;
	}
}
