package random;

import java.util.Random;

public class random {
	
	public static void main(String[] args){
		
		int[] array= new int [10];
		
		Random szam= new Random();
		System.out.println("Random szamsorozat: ");
		for(int i=0;i<array.length;i++) {
			
			array[i]= szam.nextInt(50)+1;
		System.out.println(array[i]);
		}
		
		
	/*	for(int e : array){
			System.out.println(e);
		}*/
		
		System.out.println("\n"+"Forditva kiiratva: ");
		for(int i=array.length-1;i>=0;i--){
			System.out.println(array[i]);
			
		}
		
		int max= array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i] > max)
				max=i;
			
		}
		System.out.println("A legnagyobb elem : "+array[max]);
		
		int max2= array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>max2 && array[i]%2==0)
				max2=i;
			
		}
		System.out.println("A legnagyobb páros elem : "+array[max2]);
	}

}
