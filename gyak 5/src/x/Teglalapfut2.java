package x;

public class Teglalapfut2 {

	public static void main(String[] args) {
		
		Teglalap rectangles[] = new Teglalap[10];
		
		
		for(int i=0;i<rectangles.length;i++){
			
			rectangles[i] = new Teglalap((int)(Math.random()*8)+2,(int)(Math.random()*8)+2);
			System.out.println(rectangles[i].getAdatok());
		}
		
		int mini=0;
		for(int i=0;i<rectangles.length;i++) {
			if(rectangles[i].getTerulet() < rectangles[mini].getTerulet())
				mini = i;
			
		}
		System.out.println("A legkisebb teruletu teglalap adatai: " + rectangles[mini].getAdatok());
		
		
	}

}
