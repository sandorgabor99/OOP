package tombok;

public class tombok {
	public static void main(String[] args)
	{
		int[] tomb= new int[10];
		
		for(int i=0;i<tomb.length;i++)
		{
			tomb[i]=i+1;
			System.out.println("Az "+i+"-edik elem : "+tomb[i]);
			
		}
		int max=tomb[0];
		for(int i=0;i<tomb.length;i++){
			if(tomb[i]>max)
				max=i;
			
		}
	System.out.println("Legnagyobb elem : "+ tomb[max]);
	
	
		
	
	int keresett=10
			;
	for(int i=0;i<tomb.length;i++){
		if(tomb[i]== keresett){
			System.out.println("Van benne");
			break;
		}else
			if(tomb[i]==tomb.length){
			System.out.println("Nincs benne");
		
		

	}
	}
	}
}
