package org.contoso.logica;

// public class Product extends Object
// Now is an abstract class
public abstract class Product {

	// Variable de clase
	private static int contador = 1000;
	
	// Variables de instancia - Guardan el estado del objeto y se crear al instanciar
	private int id;
	private String name;
	private String description;
	private float price;
	private String category;
	private String subcategory;
	private int weightClassification;
	
	// Metodo constructor, su nombre es igual a la clase y no se 
	// especifica el tipo de dato a regresar
	
	// Metodo constructor en overloading o sobrecargado
	private Product() {
		// this.id = contador;
		// contador = contador + 1;
		// contador++;
		this.id = contador++;
	}
	
	public Product(String name,String description,float price,
			       String category,String subcategory,int weightClassification) {
		this(); // Invocar constructor sin argumentos
		this.name = name;
		this.description = description;
		this.price = price;
		this.category = category;
		this.subcategory = subcategory;
		this.weightClassification = weightClassification;
		
	}
	
	// Metodo instancia para acceder a variable de clase
	public int getContador() {
		return contador;
	}
	
	// Metodo de clase para acceder a variable de clase
	public static int getStaticContador() {
		return contador;
	}
	
	public int getId() {
		return id;
	}
	
	
	/*
	// non-abstract method
	public final float getDiscount() {
		return 0.0f;
	}
	*/
	
	
	// An abstract method can only belong to an abstract class
	public abstract float getDiscount();
	
	// Make and abstract method final also
	// In Java a method can not be abstract and final
	// public abstract final  float getDiscount();
	
	public float getPrice() {
		return price;
	}

	// Metodo que convierte un objeto a una cadena
	// Metodo de instancia
	// Override del metodo (sobreescritura)
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", category=" + category + ", subcategory=" + subcategory + ", weightClassification="
				+ weightClassification + "]";
	}
	
	
	
	
	
	
	
}
