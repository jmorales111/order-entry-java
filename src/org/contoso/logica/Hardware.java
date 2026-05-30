package org.contoso.logica;

public class Hardware extends Product{
	
	private int warrantyPeriod;
	
	public Hardware(String name,String description,float price,
		       String category,String subcategory,int weightClassification,
		       int warrantyPeriod) {
		
		super(name,description,price,category,subcategory,weightClassification);
		this.warrantyPeriod = warrantyPeriod;
		
	}
	
	@Override
	public float getDiscount() {
		return 0.05f;
	}
	

	@Override
	public String toString() {
		return super.toString() + " Hardware [warrantyPeriod=" + warrantyPeriod + "]";
	}
	
	
	
	

}
