package edu.mum.serviceimpl.proxy;




public class SearchInput {
	public String getParam1() {
		return param1;
	}

	public String getParam2() {
		return param2;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (param1 + param2).toString();
	}

	String param1;
	String param2;

	public SearchInput(String param1, String param2) {

		this.param1 = param1;
		this.param2 = param2;
	}

}
