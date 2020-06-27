package jslhrd3;
/*
 * ¹øÈ£ 	ÀÌ¸§ 		Á¡¼ö		ÇÕ°è 		Æò±Õ
 * 1 	È«±æµ¿ 	90		90		90
 * 
 * ¹øÈ£ 	ÀÌ¸§ 		Á¡¼ö					 ÇÕ°è 	Æò±Õ
 * 1	È«±æµ¿	90 	80	 70	 60	 90  xxx	xx
 */
public class HakExam {
	public static void main(String[] args) {
		Hak data = new HakData(1, "È«±æµ¼" , 90);
		data.print();
		Hak d = new HakData(1, "È«±æµ¼" , new int[] {90 , 80 , 70 , 60 , 90});
		d.print();
	}
}

