/*
 * �⺻ �ڷ����� ���۷����� ������
 * 
 * 
 */

class Data{
	int x; //���
	int y;
	
}
public class Exam_04 {
	static void swap(int a, int b) {
	int c = a;
	a = b;
	b = c;
}
	
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("a =" + a + "\tb =" + b);
		swap(a,b); //������ ���� ȣ�� Ŭ����,�������̽�
		System.out.println("a =" + a + "\tb =" + b);
		System.out.println("---------------------");

		Data d = new Data(); //������
		d.x=10;
		d.y=20;
		System.out.println("d.x = "+d.x + "\td.y="+ d.y);
		swapD(d);
		System.out.println("d.x = "+d.x + "\td.y="+ d.y);

		System.out.println("---------------------");
		int s[] = {10,20};

		System.out.println("s[0] =" + s[0] + "\ts[1]="+s[1]);
		swapA(s);
		System.out.println("s[0] =" + s[0] + "\ts[1]="+s[1]);

	}
	
	static void swapD(Data d) { //������ ����
		//int aa = a.x;
		//a.x = a.y;
		//a.y = aa;
	}
	static void swapA(int[] dd) { //������ ����
		int aa = dd[0];
		dd[0] = dd[1];
		dd[1] = aa;
	}
}
