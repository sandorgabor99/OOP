package sajat;

public class Teglatest extends Hasab {
	private double a;
	private double b;

	public Teglatest(double a, double b,int height) {
		super(height);
		this.a = a;
		this.b = b;
	}

	public double baseArea() {
		return a * b;
	}

	public String toString() {
		return "A teglatest adatai: [a oldal: " + this.a + "A b oldal " + this.b
				+ "magassag: " + super.getHeight() + "]";
	}

}
