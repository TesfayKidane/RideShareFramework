package eventorganizerframework.proxy;

public class SearchInput {
public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (name+country).toString();
	}
String name;
String country;
public SearchInput(String name, String country) {
	
	this.name = name;
	this.country = country;
}

}
