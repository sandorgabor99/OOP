package sikidomtarol;

import sajat.*;

public class hasabtarol {
	private Hasab[] hasabArray;

	public hasabtarol(int size) {
		this.hasabArray = new Hasab[size];
	}

	public void setHasabRef(int index, Hasab h) {
		this.hasabArray[index] = h;
	}

	public int getArraysize() {
		return this.hasabArray.length;
	}

	public Hasab getIndexofHasab(int index) {
		return this.hasabArray[index];
	}

	public int getNotNullElements() {
		int db = 0;
		for (Hasab h : this.hasabArray) {
			if (h != null)
				db++;
		}
		return db;
	}

	public double getHasabAvareageVolume() {
		int sum = 0;
		for (Hasab h : this.hasabArray)
			if(h != null)
			sum = (int) (sum + h.getVolume());
	
		return sum / this.hasabArray.length;
		

	}

	public int getHengerHasab() {
		int db = 0;
		for (Hasab h : this.hasabArray) {
			if (h instanceof Henger)
				db++;

		}

		return db;
	}
	
	
}
