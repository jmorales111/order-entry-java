package org.contoso.presentacion;

import org.contoso.datos.Catalog;


import org.contoso.logica.Customer;

// import org.contoso.logica.LineItem;
import org.contoso.logica.Order;
import org.contoso.logica.Product;

/*
  Convert LineItem class into inner class inside Order
  
  1) At the end of Order class, copy and paste the LineItem content
  2) Remove LineItem class
  3) In OrderEntry class
  		a) Create a LineItem object using Order object:
  		    // LineItem i1 = new LineItem(p1,2);
		    // LineItem i2 = new LineItem(p2,3);
  			Order.LineItem i1 = o1.new LineItem(p1,2);
		    Order.LineItem i2 = o1.new LineItem(p2,3);
		b) Repeat the same steps for the next order (o2)
		    // LineItem i3 = new LineItem(p4,1);
		    // LineItem i4 = new LineItem(p3,4);
			Order.LineItem i3 = o2.new LineItem(p4,2);
		    Order.LineItem i4 = o2.new LineItem(p3,3);
		    
   4) Comment the following import
   	// import org.contoso.logica.LineItem;
	   
 *      
 *      
 *      
 */

public class OrderEntry {
	
	public static void main(String[] args) {
	/*
		// Instanciar
		// p1,p2,p3,p4 Son variables locales o de metodo
		Product p1 = new Product("iPhone 13","Black, 256MB",18_000.00f,"Hardware","Smartphone",2);
		System.out.println(p1.toString());
		
		Product p2 = new Product("Java Programming","JDK 17",650f,"Book","Programming",2);
		System.out.println(p2.toString());
		
		// Acceder a la variable de clase
		// NombreClase.variable_clase
		// Esto es valido si contador es public
		//System.out.println(Product.contador);
		// Product.contador = 2000;
		// System.out.println(Product.contador);
		
		// Acceder al metodo getContador
		// Product.getContador();
		System.out.println("Usando un objeto acceso a variable de clase: " + p1.getContador());
		System.out.println("Usando un objeto acceso a variable de clase: " + p2.getContador());
		
		// Acceder a un metodo de clase
		System.out.println("Usando la clase acceso a variable de clase: "+Product.getStaticContador());
		
		// Herencia
	    Book p3 = new Book("Java Programming","JDK 17",650f,"Book","Programming",2,"Arthur Perez","McGraw Hill");
		System.out.println("*** Instanciando subclase Book");
		System.out.println(p3.toString());
		
		// Polimorfismo de clases
		// Usar siempre generalizacion
		System.out.println("*** Polimorfismo de clases y aplicando generalizacion");
		Product  p4 =new Book("Java Programming","JDK 17",650f,"Book","Programming",2,"Arthur Perez","McGraw Hill");
		System.out.println(p4.toString());
		
		Product p5 = new Hardware("iPhone 13","Black, 256MB",18_000.00f,"Hardware","Smartphone",2,360);
		System.out.println(p5.toString());
		
		Product p6 = new Software("RedHat Enterprise Linux 8","Support 1yr",15_0000f,"Software","Open Source",0,"FTGY-Z567-WSDF");
		System.out.println(p6.toString());
	}
	*/
	
		// Now Product and Customer are abstract, we can not create instances
		// Product p1Temp = new Product("iPhone 13","Black, 256MB",18_000.00f,"Hardware","Smartphone",2);
		Product p1 = Catalog.findProductById(1002);
		Product p2 = Catalog.findProductById(1004);
		Product p3 = Catalog.findProductById(1000);
		Product p4 = Catalog.findProductById(1003);
		
		Customer c1 = Catalog.findCustomerById(5000);
		Customer c2 = Catalog.findCustomerById(5003);
		
		
		Order o1 = new Order(c1,'T',0,"Av. Insurgentes Sur 231");
		// LineItem i1 = new LineItem(p1,2);
		// LineItem i2 = new LineItem(p2,3);
		Order.LineItem i1 = o1.new LineItem(p1,2);
		Order.LineItem i2 = o1.new LineItem(p2,3);
		
		o1.addOrderItem(i1);
		o1.addOrderItem(i2);
		
		System.out.println(o1);
		
		Order o2 = new Order(c2,'A',0,"Rio Sena 345");
		// LineItem i3 = new LineItem(p4,1);
		// LineItem i4 = new LineItem(p3,4);
		Order.LineItem i3 = o2.new LineItem(p4,2);
		Order.LineItem i4 = o2.new LineItem(p3,3);
		
		
		o2.addOrderItem(i3);
		o2.addOrderItem(i4);
		
		System.out.println(o2);
		
		
	}

}
