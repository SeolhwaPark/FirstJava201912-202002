package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List list = new ArrayList();
		
		while(true) {
			System.out.print("�Է�:");
			int hak = sc.nextInt();
			
			int ban= sc.nextInt(); //��
			int bun; //��ȣ
			String name; //�̸�
			int score; //����
			
		}
		
		
	}
}

/*
 * �÷����� �̿��ؼ� ����ǥ �����....
 * 
 * �Է� �г�:1 ��:1 ��ȣ:1 �̸�:ȫ�浿 ����:95
 * 
 * �Է����� *�г� '0'�� ���� *��ȿ��üũ �г�-> 1~3��, �� 1~6��, ��ȣ 1~45��, ���� 0~100�� �г��� ���ڰ� Ʋ����
 * �г⸸ �ٽ� �ް�, ���� ���ڰ� Ʋ���� �ݸ� �ٽùް�... *���� 90�̻� A 80�̻� B 70�̻� C 60�̻� D 60�̸� F
 * 
 * ��� �й� �̸� ���� ����(����� ����) 1-1-1 ȫ�浿 95 A �й��� �ߺ�üũ�� �����ϸ�..!
 * 
 * class ���� �й� �̸� ���� ���� ���� ���� 3�ڸ� 10�ڸ� 3�ڸ�
 * 
 */