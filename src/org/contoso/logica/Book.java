package org.contoso.logica;


public class Book extends Product {
	
	private String author;
	private String editorial;
	
	public Book(String name,String description,float price,
		       String category,String subcategory,int weightClassification,
		       String author,String editorial) {
		
		super(name,description,price,category,subcategory,weightClassification);
		this.author = author;
		this.editorial = editorial;
		
	}
	
	
	@Override
	public float getDiscount() {
		return 0.16f;
	}
	
	
	
	

	// El metodo de la subclase tiene mas importancia que el metodo en el padre
	@Override
	public String toString() {
		return super.toString() + " Book [author=" + author + ", editorial=" + editorial + "]";
	}
	
	
}
