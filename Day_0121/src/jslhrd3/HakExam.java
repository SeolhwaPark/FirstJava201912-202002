package jslhrd3;
/*
 * ��ȣ 	�̸� 		����		�հ� 		���
 * 1 	ȫ�浿 	90		90		90
 * 
 * ��ȣ 	�̸� 		����					 �հ� 	���
 * 1	ȫ�浿	90 	80	 70	 60	 90  xxx	xx
 */
public class HakExam {
	public static void main(String[] args) {
		Hak data = new HakData(1, "ȫ�浼" , 90);
		data.print();
		Hak d = new HakData(1, "ȫ�浼" , new int[] {90 , 80 , 70 , 60 , 90});
		d.print();
	}
}

