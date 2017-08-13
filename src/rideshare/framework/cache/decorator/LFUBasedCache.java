package rideshare.framework.cache.decorator;

import java.util.List;
import java.util.Map;

public class LFUBasedCache<K, V> extends ACache<K, V> {

	@Override
	public List<V> get(K key) {
		if (cacheMap.containsKey(key)) {
			LFUCacheEntry<V> cacheEntry = new LFUCacheEntry<>();
			cacheEntry.setUseFrequency(cacheEntry.getUseFrequency() + 1);
			cacheEntry.setLastUsedInMilliSecond(getNormalizedUsageTime());
			cacheMap.put(key, cacheEntry);
			return cacheEntry.getData();
		}
		return null;
	}

	@Override
	public void set(K key, List<V> value) {
		if(getCacheCapacity() <= 0)
			return;
		if(!isCacheFull()){
			LFUCacheEntry<V> cacheEntry = new LFUCacheEntry<>();
			cacheEntry.setLastUsedInMilliSecond(getNormalizedUsageTime());
			cacheEntry.setData(value);
			if(cacheMap.containsKey(key)){
				LFUCacheEntry<V> eF = (LFUCacheEntry<V>) cacheMap.get(key);
				cacheEntry.setUseFrequency(eF.getUseFrequency()+1);
			}
			else{
				cacheEntry.setUseFrequency(0);
			}
			cacheMap.put(key, cacheEntry);
		}
		else{
			LFUCacheEntry<V> cacheEntry;
			if(cacheMap.containsKey(key)){
				cacheEntry = (LFUCacheEntry<V>) cacheMap.get(key);
				cacheEntry.setUseFrequency(cacheEntry.getUseFrequency()+1);
				cacheEntry.setLastUsedInMilliSecond(getNormalizedUsageTime());
				cacheEntry.setData(value);
			}
			else{
				K keyToBeRomved = getLFUEntry();
				cacheMap.remove(keyToBeRomved);
				cacheEntry = new LFUCacheEntry<V>();
				cacheEntry.setLastUsedInMilliSecond(getNormalizedUsageTime());
				cacheEntry.setData(value);
				cacheEntry.setUseFrequency(0);
			}
			cacheMap.put(key, cacheEntry);
		}
	}
	
	 private K getLFUEntry() {
         
	        K key = null;
	        long min = Long.MAX_VALUE;
	        
	        for(Map.Entry<K, ACacheEntry<V>> entry : cacheMap.entrySet())
	        {
	        	LFUCacheEntry<V> e = (LFUCacheEntry<V>) entry.getValue();
	        	long eFrequency = e.getUseFrequency();
	            if(min > eFrequency){
	                min = eFrequency;
	                key = entry.getKey();
	            }
	            else if(min == eFrequency)
	            {
	            	LFUCacheEntry<V> mapE = (LFUCacheEntry<V>)cacheMap.get(key);
	                if(mapE.getLastUsedInMilliSecond() > e.getLastUsedInMilliSecond())
	                {
	                    min = eFrequency;
	                    key = entry.getKey();
	                }
	            }
	        }
	        return key;
	    }  

}
