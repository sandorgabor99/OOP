package masodfoku;

public class masodfoku {
	public static void main(String[] args){
		
		int a=5;
		int b=2;
		int c=2;
		
		double x1=0;
		double x2=0;
		
		double diszkriminans=0;
		
		
		diszkriminans=(Math.sqrt((b*b)-4*a*c));
		System.out.println("Diszkriminans erteke: "+diszkriminans);
		
		
		if (diszkriminans<0) {
			System.out.println("Nincs megoldas");
			
		}else { 
			System.out.println("Van megoldasa");
		x1= b*(-1) + diszkriminans / 2*a;
		x2=b*(-1) - diszkriminans/2 *a;
		System.out.println("A megoldasok x1: "+x1+"  x2:  "+x2);
		}
		
			
		
		
		
	}

}
