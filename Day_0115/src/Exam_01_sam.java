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

class Student1 {
	//�Ӽ�
	int bun, kor ,eng ,mat, tot;
	String name;
	double ave;
	
	//���
	Student1(){ //�⺻����
	}
	Student1(int bun,String na, int k, int e, int m){ // �Ӽ����� �������� ������
		this.bun = bun;
		name = na;
		kor = k;
		eng = e;
		mat = m;
		aaa();
	}
	void aaa() {
		tot = kor+eng+mat;
		ave = (int)((kor+eng+mat)/3.*100+0.5)/100.;
	}
	void print() { //���		
		//aaa();
		System.out.println("��ȣ :" + bun);
		System.out.println("�̸� :" + name);
		System.out.println("���� :" + (kor+eng+mat));
		System.out.println("��� :" + (int)((kor+eng+mat)/3.*100+0.5)/100.);
	}
	
}

public class Exam_01_sam {
	public static void main(String[] args) {
		//�Է�
		Scanner scn = new Scanner(System.in);
		System.out.print("�Է� :");
		int b = scn.nextInt();
		String na = scn.next();
		int k = scn.nextInt();
		int e = scn.nextInt();
		int m = scn.nextInt();
		
		//�����ڿ� �ִ� ����� �ҷ�����
		Student1 st = new Student1(b,na,k,e,m);
		st.print();
	}
}
