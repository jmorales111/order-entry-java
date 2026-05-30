package org.contoso.logica;

// public class Customer extends Object
// Now is an abstract class
// A class cannot be abstract and final at the same time
public abstract class Customer {
	private static int counter = 5000;
	
	private int id;
	private String name;
	private String address;
	private String phone;
	
	private Customer() {
		id = counter++;
	}
	
	public Customer(String name,String address,String phone) {
		this();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	
	
}
