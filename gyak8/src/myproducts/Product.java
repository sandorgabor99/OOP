package myproducts;

public class Product {

	private String name;
	private int netprice;
	private int percentage;
	
	public Product(String name, int netprice,int percentage) {
		this.name = name;
		this.netprice = netprice;
		this.percentage = percentage;
	}
	
	
	public int getGrossPrice() {
		return this.netprice + (netprice * (int)(percentage/100));
	}
	
	public String toString() {
		return "Név: " + this.name + "Brutto ar: " + getGrossPrice();
	}
	
	
	public void netpriceIncrease(int percentageIn) {
		 this.netprice = this.netprice + (this.netprice * (percentageIn/100));
	}
	
	public int productCompare(Product other) {
		if(this.getGrossPrice() > other.getGrossPrice())
			return 1;
		else if(this.getGrossPrice() < other.getGrossPrice())
			return -1;
		else {
			return 0;
			
		}
	}


	public double getBreadPrice() {
		return 0;
	}
	
	
}
