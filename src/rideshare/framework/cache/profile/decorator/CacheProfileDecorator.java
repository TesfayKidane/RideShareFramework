package rideshare.framework.cache.profile.decorator;

import java.util.List;

import rideshare.framework.cache.decorator.ACache;

public abstract class CacheProfileDecorator<K, V>  extends ACache<K, V>{
	ACache<K, V> cache;
	public CacheProfileDecorator(ACache<K, V> cache) {
		this.cache = cache;
	}
	@Override
	public List<V> get(K key) {
		return cache.get(key);
	}

	@Override
	public void set(K key, List<V> value) {
		cache.set(key, value);
	}
}
