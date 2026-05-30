package org.contoso.datos;

import org.contoso.logica.Book;
import org.contoso.logica.Company;
import org.contoso.logica.Customer;
import org.contoso.logica.Hardware;
import org.contoso.logica.Person;
import org.contoso.logica.Product;
import org.contoso.logica.Software;

public class Catalog {
	
	  private static Product[] products;
	  private static Customer[] customers;
	  
	  private static void initializeProducts() {
		  if(products == null) {
			  products = new Product[5];
			  products[0]=  new Hardware("IPhone 11","Black, 256MB",17_500.5f,"Hardware","Smartphone",2,300);
			  products[1] = new Book("Java Programming","JDK 11",650f,"Book","Programming",2,"Juan Perez","McGraw Hill");
			  products[2] = new Software("RedHat Enterprise Linux 7","Support 1yr",0,"Software","Open Source",1,
						"FGTY-Z567-WSDF");
			  products[3] = new Book("Essentials Scrum","A guide for agile process",150f,"Book","Scrum",1,"Kenneth Rubin","Scrum Library");
			  products[4] = new Hardware("Acer Aspire Slim","Full HD, white",8900f,"Hardware","Laptop",3,300);
		  }
	  }
	  
	  private static void initializeCustomers() {
		  if(customers == null) {
			  customers = new Customer[5];
			  customers[0] = new Person("Erika Zuniga","Av. Revolucion 234","56178911",'S');
			  customers[1] = new Company("Mentori SA","Jose Ma. Velasco 123","56223411","Luz Gonzalez",15);
			  customers[2] = new Person("Sandra Sanchez","Pino 345","90341211",'C');
			  customers[3] = new Company("Grupo Bimbo SA","Mimosas 345","89123411","Elizabeth Aguilar",30);
			  customers[4] = new Person("Gisela Hernandez","Popotla 234","89127834",'S');
	 	  }
	  }
	  
	    public static Product findProductById(int id) {
	    	 Product tmp = null;
	    	 for (Product p:products ) {
	    		if(p.getId() == id) {
	    			tmp = p;
	    			break;
	    		}
	    	 }
	    	 return tmp;
	    }
	    
	    public static Customer findCustomerById(int id) {
	   	 Customer tmp = null;
	   	 for (Customer c:customers ) {
	   		if(c.getId() == id) {
	   			tmp = c;
	   			break;
	   		}
	   	 }
	   	 return tmp;
	   }
	    
		  
	   static {
		      initializeProducts();
		      initializeCustomers();
	   }
}
