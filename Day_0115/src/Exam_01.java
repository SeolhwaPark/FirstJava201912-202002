import java.util.Scanner;

/*Ű����� ��ȣ,�̸�,����,����,���� �Է�
 * ������ ���� ����ϴ� Ŭ���� ����
 * 
 * �Է¿���
 * �Է� : 1 aaaa 90 70 80 
 * 
 * ��¿���
 * ��ȣ:xx
 * �̸�:xx
 * ����:xx
 * ���:xx
 */

class Student {
	//�Ӽ�
	
	int b,k,e,m;
	String na;
	
	//���
	Student(){ //�⺻����
		
	}
	Student(int b,String na, int k, int e, int m){ // �Ӽ����� ��������
		this.b = b;
		this.na = na;
		this.k = k;
		this.e = e;
		this.m = m;
	}
	
	void print() { //���		
		System.out.println("��ȣ :" + b);
		System.out.println("�̸� :" + na);
		System.out.println("���� :" + (k+e+m));
		System.out.println("��� :" + (int)((k+e+m)/3.*100+0.5)/100.);
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int b, k, e, m;
		String na;
		System.out.print("�Է� :");
		b = scn.nextInt();
		na = scn.next();
		k = scn.nextInt();
		e = scn.nextInt();
		m = scn.nextInt();
		Student st = new Student(b,na,k,e,m);
		st.print();
	}
}
