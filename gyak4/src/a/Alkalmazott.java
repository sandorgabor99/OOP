package a;

public class Alkalmazott {

	private String name;
	private int payment;

	public void fizNov(int fizBe) {
		payment += fizBe;

	}

	public String getSzoveg() {
		return "Nev:" + name + " Fizetes: " + payment;

	}

	public String getName() {
		return name;

	}

	public void setName(String nameIn) {
		name = nameIn;

	}

	public int getpayment() {
		return payment;
	}

	public void setpayment(int paymentIn) {
		payment = paymentIn;
	}

	public boolean fizHatar(int lower, int upper) {
		if (payment >= lower && payment <= upper)
			return true;
		return false;
	}

	public double getAdo() {
		return payment * ((double)16 / (double)100);

	}

	public boolean nagyobbE(Alkalmazott a) {
		if(payment > a.payment)
			return true;
		
		return false;

	}
}
