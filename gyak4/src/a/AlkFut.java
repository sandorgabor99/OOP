package a;

public class AlkFut {

	public static void main(String[] args) {
		Alkalmazott alkalmazott1 = new Alkalmazott();
		
		Alkalmazott[] alkok = new Alkalmazott[5];
		
		alkok[0]=new Alkalmazott();
		alkok[0].setName("Tomi1");
		alkok[0].setpayment(10);
		

		alkok[1]=new Alkalmazott();
		alkok[1].setName("Tomi2");
		alkok[1].setpayment(10);
		

		alkok[2]=new Alkalmazott();
		alkok[2].setName("Tomi3");
		alkok[2].setpayment(10);
		

		alkok[3]=new Alkalmazott();
		alkok[3].setName("Tomi4");
		alkok[3].setpayment(150);
		

		alkok[4]=new Alkalmazott();
		alkok[4].setName("Tomi5");
		alkok[4].setpayment(78);
		
		
		for (Alkalmazott a : alkok)
			System.out.println(a.getSzoveg());
		int max = alkok[0].getpayment();
		for (int i = 0; i < alkok.length; i++) {
			if (alkok[i].getpayment() > max)
				max = alkok[i].getpayment();
			
		}
		System.out.println(" A legnagyobb fizetesu : "+ max);
		
		for(int i=0;i<alkok.length;i++){
			
			if(alkok[i].getpayment() == max)
				System.out.println("Adatai:\n "+ alkok[i].getSzoveg());
		}
		
		
		
		
		
		
		
	/*	alkalmazott1.setName("Tomi");		
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
	*/		
	}
}
