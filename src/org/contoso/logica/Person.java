package org.contoso.logica;

public class Person extends Customer {
	private char maritalStatus;
	
	public Person(String name, String address,String phone, char maritalStatus) {
		super(name,address,phone);
		this.maritalStatus = maritalStatus;
	}

	@Override
	public String toString() {
		return super.toString() + " Person [maritalStatus=" + maritalStatus + "]";
	}
	
	

}
