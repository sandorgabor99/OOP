package x;

public class Teglalap {
	private int a;
	private int b;

	public Teglalap(int aIN, int bIN) {
		a = aIN;
		b = bIN;
	}

	public Teglalap(int sideIN) {
		a = sideIN;
		b = sideIN;
	}

	public int getTerulet() {
		return a * b;
	}

	public String getAdatok() {
		return "Az a oldal: " + a + " B oldal: " + b + " Terulet: " + getTerulet();
	}

	public void setOldalak(int aIN, int bIN) {
		a = aIN;
		b = bIN;

	}

	public void setOldal(int sideIN) {
		a = sideIN;
		b = sideIN;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public boolean getTeruletmasik(Teglalap other) {
		if (getTerulet() > other.getTerulet())
			return true;
		return false;
	}

	public boolean getEgyeznek(Teglalap other) {
		if (a == other.a && b == other.b)
			return true;
		return false;
	}
	
}
