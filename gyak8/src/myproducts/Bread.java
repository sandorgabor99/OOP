package myproducts;

public class Bread extends Product {
	private double amount;
	
	public Bread(String name, int netprice, int percentage,double amount) {
		super(name, percentage,netprice);
		this.amount = amount;
	}
	
	public double getBreadPrice(){
		return this.getGrossPrice() / this.amount;
	}
	
	public String toString() {
		return super.toString() + "Egysegar:"+ (this.getBreadPrice());
	}
	
	public double getamount() {
		return this.amount;
	}
	
	public static  boolean BradpriceCompare(Product product2, Bread b2) {
		if(product2.getBreadPrice() > b2.getBreadPrice())
			return true;
		return false;
	}
}