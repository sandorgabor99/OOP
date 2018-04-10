package myproductsRan;

import myproducts.Bread;
import myproducts.Product;

public class ProductRun {

	public static void main(String[] args) {
		
		Product p1 = new Product("Product1", 100, 27);
		Bread b1 = new Bread("Bread1", 200, 27, 2);
	
	System.out.println("A p1 adatai: " + p1.toString());
	System.out.println("A b1 adatai: " + b1.toString());
	
	int priceCompare = p1.productCompare(b1);
	if(priceCompare == 1)
		System.out.println("A p1 ara nagyobb");
	else if(priceCompare == -1)
		System.out.println("A b1 ára a nagyobb ");
	else 
		System.out.println(" A b1 és p1 ara megegyezik");
	
	
	
	Bread b2 = new Bread("Bread2", 200, 27, 3);
	Product product2 = b2;
	System.out.println("A b2 adatai"+ b2.toString());
	
	
	Bread bread2 = new Bread("Bread2.5", 2950, 50, 3);
	System.out.println("A bread2 adatai"+ b2.toString());
	
	boolean  res = Bread.BradpriceCompare(product2, bread2);
	if(res)
		System.out.println("A product2 a nagyobb");
	else
		System.out.println("A bread2 a nagyobb");
	

	}
}

