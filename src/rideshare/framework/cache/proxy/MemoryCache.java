package rideshare.framework.cache.proxy;

import java.util.LinkedHashMap;
import java.util.List;

public class MemoryCache<K, V> implements ICache<K, V>{
	private long currentTime = 0;
	private long capacity = 1000;
	private LinkedHashMap<K, ACacheEntry<V>> cacheMap = new LinkedHashMap<>();

	public MemoryCache(long capacity) {
		super();
		this.capacity = capacity;
	}

	@Override
	public List<V> get(K key) {
		if(cacheMap.containsKey(key)){
			ACacheEntry<V> cacheEntry = cacheMap.get(key);
			return cacheEntry.data;
		}
		return null;
	}

	@Override
	public void set(K key, List<V> value) {
		  if(capacity <= 0)
	            return;
		  if(!isCacheFull()){
			  ACacheEntry<V> cacheEntry = new AgeBasedCacheEntry<>();
			  cacheEntry.setData(value);
		  }
		  else{
			  ACacheEntry<V> cacheEntry;
			  if(cacheMap.containsKey(key)){
				  cacheEntry = cacheMap.get(key);
				  cacheEntry.setData(value);
			  }
			  else{
				  cacheEntry = cacheMap.entrySet().iterator().next().getValue();
				  cacheMap.remove(cacheEntry);
				  cacheEntry.setData(value);
			  }
		  }
	}

	@Override
	public long getCurrentTime() {		
		return ++currentTime;
	}

	@Override
	public boolean isCacheFull() {
		if(cacheMap.size() == capacity)
			return true;
		return false;
	}

	@Override
	public void setCacheCapacity(long capacity) {
		this.capacity = capacity;		
	}
	
	public long getCapacity() {
		return capacity;
	}

	public void setCapacity(long capacity) {
		this.capacity = capacity;
	}

}
