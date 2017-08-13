package rideshare.framework.cache.decorator;

import java.util.List;

public class OldestEntryBasedCache<K, V> extends ACache<K, V>{

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
		  if(getCacheCapacity() <= 0)
	            return;
		  if(!isCacheFull()){
			  ACacheEntry<V> cacheEntry = new OldEntryCacheEntry<>();
			  cacheEntry.setData(value);
			  cacheMap.put(key, cacheEntry);
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
			  cacheMap.put(key, cacheEntry);
		  }
	}
}
