package rideshare.framework.cache.proxy;

import java.util.List;

public interface ICache<K, V> {
	public List<V> get(K key);

	public void set(K key, List<V> value);

	public long getCurrentTime();

	public boolean isCacheFull();

	public void setCacheCapacity(long capacity);
}
