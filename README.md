## 1\. Introduction
Order Management System (Contoso).  
This project is a Java console application that implements a Catalog and Order Management System. It utilizes advanced Object-Oriented Programming (OOP) concepts such as inheritance, polymorphism, abstract classes, and inner classes.
## 2\. Structure and functionality
The system is designed to manage products, customers, and the purchase orders that link them. The main flow is divided into three logical layers:
1. **Data Model (Logical Layer):** Defines the business entities (Products and Customers) using a class hierarchy.
2. **Simulated Persistence (Data Layer):** The Catalog class acts as an in-memory database using static arrays and initialization blocks.
3. **Presentation Layer:** The OrderEntry class contains the main method that orchestrates order creation and displays the results in the console. 
## 3\. Key Code Components
1. Product Hierarchy
The base class is Product, which is abstract, meaning you cannot instantiate a "generic product," but only specific types:
    - Book: Applies a fixed discount of 16% ($0.16).
    - Hardware: Applies a discount of 5% ($0.05).
    - Software: Applies a discount of 20% ($0.20).
2. Customer Hierarchy
Similarly, Customer is an abstract class with two implementations:
    - Person: Represents an individual customer with marital status.
    - Company: Represents a company. This class is special because it allows for an additional custom discount that is applied to the total order.
3. The Order Engine (Order)
This is the most complex class in the system. It manages the relationship between the customer and the selected products through an inner class called LineItem.
    - Total Calculation: The calculateTotal() method iterates through the items, applies the individual discount to each product (polymorphism in action), and finally, if the customer is a Company, applies the corporate discount.
    - Taxes: Automatically calculates VAT (16%) on the discounted subtotal.
## 4\. Catalog and Initialization
The Catalog class uses a static block to pre-load data. This ensures that, as soon as the class is accessed, the products and customers already exist in memory, allowing searches by ID using findProductById and findCustomerById.

## 5\. Execution Summary
When you run OrderEntry, the program:
1. Searches for specific products and customers in the Catalog.
2. Creates an Order for a customer.
3. Instantiates LineItem objects (using the special syntax for inner classes: o1.new LineItem(...)).
4. It calculates and prints totals in a clean format thanks to the overridden `toString()` method in `Order`.

This project is an excellent example of how polymorphism allows a product list (`LineItem`) to calculate discounts differently without the `Order` class needing to know whether the product is a book or software.
## 5\. Package Hierarchy
The project is divided into three main packages:
- org.contoso.logica: This is the core of the system. The Domain Model resides here. It contains the business rules, the discount calculation logic, and the definition of the entities (Customers, Products, and Orders).
- org.contoso.datos: This represents the Persistence Layer (although in this case it's an in-memory simulation). It manages access to the information.
- org.contoso.presentacion: This is the Interface Layer. It contains the application's entry point and handles user interaction through the console.
## 6\. Detailed Content by Package
Package: org.contoso.logica
This package uses inheritance and polymorphism to organize real-world objects.  
- Product Entities:
    - Product (Abstract): Defines common attributes such as price and the abstract method getDiscount().
    - Book, Software, Hardware: Specific implementations that define their own discounts.
- Customer Entities:
    - Customer (Abstract): Defines the basics of a customer (id, name).
    - Person and Company: Specializations for individuals and legal entities.
- Transaction Management:
    - Order: Main class that orchestrates the order.
    - Order.LineItem (Inner Class): Represents each line item of products within an order.
<br/>

Package: org.contoso.datos
- Catalog: This class acts as a repository. It centralizes the storage of product and customer arrays. It provides search methods (findProductById) that bridge the gap between logic and raw data.
<br/> 

Package: org.contoso.presentacion  
- OrderEntry: Contains the method public static void main(String[] args). Its function is purely demonstrative: it instantiates objects, creates orders, and prints them to the screen.

## 7\. Dependency flow
It's important to note that there's a unidirectional dependency hierarchy to keep the code clean:  
1. The Presentation Layer depends on Data (to search for products) and Logic (to create orders).
2. The Data Layer depends on Logic (because the catalog stores Product and Customer objects).
3. The Logic Layer is the most independent, as it defines the basic business rules without needing to know how the data is stored or displayed to the user.