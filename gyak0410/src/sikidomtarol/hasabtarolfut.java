package sikidomtarol;

import sajat.Henger;
import sajat.Teglatest;

public class hasabtarolfut {
	public static void main(String[] args) {
		hasabtarol ht = new hasabtarol(5);

		ht.setHasabRef(0, new Henger(4, 10));
		ht.setHasabRef(1, new Henger(2, 3));
		ht.setHasabRef(2, new Teglatest(5, 5, 2));
		ht.setHasabRef(3, null);
		ht.setHasabRef(4, null);

		for (int i = 0; i < 5; i++) {
			if (ht.getIndexofHasab(i) != null)
				System.out.println(ht.getIndexofHasab(i).toString());
		}

		System.out.println("");
		System.out.println("A hasabok atlagos terfogata: "
				+ ht.getHasabAvareageVolume());
		System.out.println("A hengerek szama : " + ht.getHengerHasab());
		System.out.println("A null elemek szama: " + ht.getNotNullElements());

	}
}
