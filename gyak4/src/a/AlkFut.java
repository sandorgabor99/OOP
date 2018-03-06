package a;

public class AlkFut {

	public static void main(String[] args) {
		Alkalmazott alkalmazott1 = new Alkalmazott();
		
		alkalmazott1.setName("Tomi");		
		alkalmazott1.setpayment(10);
		
		


		System.out.println(alkalmazott1.getSzoveg());

		alkalmazott1.fizNov(1);

		System.out.println(alkalmazott1.getSzoveg());
		
		
		boolean isTrue = alkalmazott1.fizHatar(10, 20);
			if(isTrue)
				System.out.println("A megadott hatarok koze esik");
			else
				System.out.println("Nem esik a hatarok koze");
				
			System.out.println("Az ado erteke: " + alkalmazott1.getAdo());
			
		Alkalmazott alkalmazott2 = new Alkalmazott ();
		
			alkalmazott2.setName("Tomi2");
			alkalmazott2.setpayment(80);
			
			if(alkalmazott1.nagyobbE(alkalmazott2)){
				
				System.out.println("Az alk1 fizetese nagyobb");
			}else{
				System.out.println("Az alk2 fizetese nagyobb");
				
			}
			
	}
}
