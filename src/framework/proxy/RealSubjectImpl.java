package framework.proxy;

import java.util.ArrayList;
import java.util.List;

public class RealSubjectImpl<Person> implements RealSubject<Person> {


	
	@Override
	public List<Person> request(SearchInput input) {
		// TODO Auto-generated method stub
		
		return (List<Person>)new PersonDao().getPeople(input);
	}

}
