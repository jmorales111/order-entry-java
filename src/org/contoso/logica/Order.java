package org.contoso.logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	
	   private int id;
	   private Customer customer;
	   private char deliveryType;
	   private int status;
	   private Date orderDate;
	   private Date deliveryDate;
	   private String addressDestination;
	   private List<LineItem> items;
	   
	   private static int count = 9000;
	   // final - es constante
	   private static final float IVA = 0.16f;
	   
	   
	   private Order() {
		   id = count++;
	   }
	   
	   public Order(Customer customer,char deliveryType,int status,String addressDestination) {
		   this();
		   this.customer = customer;
		   this.deliveryType = deliveryType;
		   this.status = status;
		   this.addressDestination = addressDestination;
		   this.orderDate = new Date();
		   this.deliveryDate = new Date();
		   items = new ArrayList<>();
	   }
	   
	   public void addOrderItem(LineItem item) {
		   items.add(item);
		   item.setId(items.size());
	   }
	   
	   
	   private float calculateTotal() {
		   float total=0.0f;
		   float discount = 0.0f;
		   for(LineItem l:items) {
			   discount=l.getProduct().getDiscount();
			   total+= (l.getProduct().getPrice() * l.getQuantity())*(1-discount);
		   }
		   if(customer instanceof Company) {
			   float discountCompany = ((Company) customer).getDiscount();
			   total = total * (1.0f-(discountCompany/100.0f));
		   }
		   
		   return total;
	   }
	   
	   
	   
	   @Override
		public String toString() {
			String msg="";
			float total = 0.0f;
			msg+=String.format("Order Date: %s\n", orderDate);
			msg+=String.format("Order Id:%d\n", id);
			msg+=String.format("Delivery Date:%s\n", deliveryDate);
			msg+=String.format("Delivery Type:%c\n", deliveryType);
			msg+=String.format("Address Destination:%s\n",addressDestination);
			msg+=String.format("Status:%d\n", status);
			msg+=String.format("Customer: %s\n",customer);
			msg+=String.format("Order Items:\n");
			for(LineItem i:items) {
				msg+=String.format("     %s\n", i);
			} 
			total = calculateTotal();
			msg+=String.format("SubTotal: %f\n",total);
			msg+=String.format("IVA: %f\n", total * IVA);
			msg+=String.format("Total: %f\n ", total*(1+IVA));
			return msg;
		}
	   
	   // Inner class - member class
	   
	   public class LineItem {
			
			private int id;
			private Product product;
			private int quantity;
			
			public LineItem(Product product,int quantity) {
				this.product = product;
				this.quantity = quantity;
			}
			
			public Product getProduct() {
				return product;
			}
			
			public int getQuantity() {
				return quantity;
			}
			
			public void setId(int id) {
				this.id = id;
			}
			
			@Override
			public String toString() {
				return String.format("[Line Item] Id=%d, Product: %s, Quantity: %d",id,product,quantity);
			}
	   
	   

      } // LineItem inner class - member class
	   
}
