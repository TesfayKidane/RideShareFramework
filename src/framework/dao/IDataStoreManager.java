package framework.dao;

import java.util.List;

public interface IDataStoreManager<T> {
	
	   void save(T t);

	    void delete(Long id);

	    T findOne(Long id);

	    T update(T t);   
	    
	    List<T> findAll();
}
