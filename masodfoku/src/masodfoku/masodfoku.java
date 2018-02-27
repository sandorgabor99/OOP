package masodfoku;

import java.util.Scanner;

public class masodfoku {
	public static void main(String[] args){
		
		int a=0;
		int b=0;
		int c=0;
		
		double x1=0;
		double x2=0;
		
		double diszkriminans=0;
		
		System.out.println("Kérem add meg a változókat: ");
		Scanner in = new Scanner(System.in);
		
		
		
		System.out.println("A valtozo: ");
		a=in.nextInt();
		System.out.println("B valtozo: ");
		b=in.nextInt();
		System.out.println("C valtozo: ");
		c=in.nextInt();
		
		System.out.println("Az a valtozo: "+a);
		System.out.println("A b valtozo: "+b);
		System.out.println("A c valtozo: "+c);
		
		
		
		
		diszkriminans = (b*b)-4*a*c;
		System.out.println("Diszkriminans erteke: "+diszkriminans);
		
		
		if ( diszkriminans < 0) {
			System.out.println("Nincs megoldas");
		}
		else { 
		x1= b*(-1) + diszkriminans / 2*a;
		x2=b*(-1) - diszkriminans/2 *a;
		System.out.println("A megoldasok x1: "+x1+"  x2:  "+x2);
		}
		
			
		
		
		
	}

}
