package x;

public class Teglalapfut {
	public static void main(String[] args) {

		Teglalap a = new Teglalap(2, 5);
		Teglalap b = new Teglalap(3, 7);
		Teglalap c = a; // a objektum cimere mutato referencia

		System.out.println(a.getAdatok());
		System.out.println(b.getAdatok());
		System.out.println(c.getAdatok());

		a.setOldalak(4, 10);

		System.out.println("\n" + a.getAdatok());
		System.out.println(b.getAdatok());
		System.out.println(c.getAdatok());

		System.out.println("");
		a.setOldalak(3, 7);
		System.out.println("Az a==b: " + (a == b));
		System.out.println("Az a==c " + (a == c));

		System.out.println("\n");
		System.out.println("Az a==b:metodussal " + (a.getEgyeznek(b)));

	}

}
