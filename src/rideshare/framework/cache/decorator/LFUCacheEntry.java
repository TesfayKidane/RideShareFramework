package rideshare.framework.cache.decorator;

public class LFUCacheEntry<V> extends ACacheEntry<V>{
	
	private long useFrequency;
	private long lastUsedInMilliSecond;
	
	public long getUseFrequency() {
		return useFrequency;
	}
	public void setUseFrequency(long useFrequency) {
		this.useFrequency = useFrequency;
	}
	public long getLastUsedInMilliSecond() {
		return lastUsedInMilliSecond;
	}
	public void setLastUsedInMilliSecond(long lastUsedInMilliSecond) {
		this.lastUsedInMilliSecond = lastUsedInMilliSecond;
	}	
}
