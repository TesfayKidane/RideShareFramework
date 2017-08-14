package edu.mum.serviceimpl.proxy;




import java.util.List;

public interface RealSubject<E> {

	public List<E> request(SearchInput input);

}
