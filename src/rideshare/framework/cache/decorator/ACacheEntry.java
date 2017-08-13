package rideshare.framework.cache.decorator;

import java.util.ArrayList;
import java.util.List;

public abstract class ACacheEntry<V> {
	public List<V> data = new ArrayList<>();;

	public List<V> getData() {
		return data;
	}

	public void setData(List<V> data) {
		this.data = data;
	}
}
