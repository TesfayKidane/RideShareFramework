package rideshare.framework.cache.decorator;

public interface ICacheFactory<K,V> {
	public ACache<K, V> creatCache(CacheType cacheType);
}
