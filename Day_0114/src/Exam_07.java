/*
 * �޼ҵ� �����ε�
 * 
 * �޼ҵ��̸� ���� (������ ����, ������ Ÿ���� �޶�� ��)
 */

class GG{
	
	
	void add(int a, int b) {
		int s = a+ b;
		System.out.println("s ="+ s);
	}
	void add(int ...a) { //�������� , ��� �Է°���
		int s = 0;
		System.out.println("s ="+ s);
	}
	void add1(int[] a) {
		int s = 0;
		for(int x =0; x<a.length; x++) {
			s+=a[x];
		}
		System.out.println("s ="+ s);
		
	}
		
}
public class Exam_07 {
	public static void main(String[] args) {
		GG g = new GG();
		g.add (10,20);
		g.add(1,2,3,4,5);
		int s[] = {1,2,3,4,5};
		g.add1(s);
		
	}

}
