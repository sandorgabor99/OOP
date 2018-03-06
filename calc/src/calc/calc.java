package calc;

import java.util.Scanner;

public class calc {
	
	public static void main(String[] args){
		
		int number=0;
		int number2=0;
		String op = "";
		int res=0;
		String tomb[]= new String[10];
		
		
		Scanner in = new Scanner (System.in);
	/*	System.out.println("Kérem az első számot: ");
		

	/*	number=in.nextInt();
	
		System.out.println("Kérem az operandust: ");
		
		op=in.next();
		
		System.out.println("Kérem a 2. szamot: ");
		
		number2=in.nextInt();
		
		in.close();*/
		System.out.println("Kerem a muveletet: ");
		tomb= in.nextLine().split(" ");
		
		number=Integer.parseInt(tomb[0]);
		op=tomb[1];
		number2=Integer.parseInt(tomb[2]);
		
		
		
		
		//System.out.println(number+ " "+op+" " + number2);
		
		switch (op) {
		case "+":
			res = number + number2;
			break;
			
		case "-":
			res = number - number2;
		break;
		
		case "*":
			res = number * number2;
		break;
		
		case "/":
			if(number2 == 0)
				System.out.println("Nem oszthatsz 0-val");
			else res=number / number2;
			break;
		
		}
			
		System.out.println("Az eredmeny: " + res);
		
		
		
		
		
		
		
		
	
	
	}
}
