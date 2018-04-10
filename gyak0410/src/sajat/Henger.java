package sajat;

public class Henger extends Hasab {
	private double radius;
	
	public Henger(int radius, int height){
		super(height);
		this.radius = radius;
	}
	
	public double baseArea(){
		return this.radius*this.radius *Math.PI;
	}
	public String toString(){
		return "A henger adatai: [sugar: " + this.radius + " magassag: " + super.getHeight()+"]";
	}
	
}
