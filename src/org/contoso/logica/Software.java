package org.contoso.logica;

public class Software extends Product{
	
	private String key;
	
	public Software(String name,String description,float price,
		       String category,String subcategory,int weightClassification,
		       String key) {
		
		super(name,description,price,category,subcategory,weightClassification);
		this.key = key;
		
	}
	
	@Override
    public float getDiscount() {
    	return 0.2f;
    }
	

	@Override
	public String toString() {
		return super.toString() + " Software [key=" + key + "]";
	}
	
	

}
