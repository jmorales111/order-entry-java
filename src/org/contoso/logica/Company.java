package org.contoso.logica;

public class Company extends Customer {
	
	private String contact;
	private float discount;
	
	public Company(String name, String address,String phone, String contact,float discount) {
		super(name,address,phone);
		this.contact = contact;
		this.discount = discount;
		
	}
	
	public float getDiscount() {
		return discount;
	}

	@Override
	public String toString() {
		return  super.toString() + " Company [contact=" + contact + ", discount=" + discount + "]";
	}
	
	
	
	

}
