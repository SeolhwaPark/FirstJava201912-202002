package student;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Ű�����Է�
 * �Է� : ��ȣ, �̸�, ����, ���� , ���� ,����, ����
 * 
 * ó������ 
 * �Է½� ��ȣ�� '0'�̸� �Է�����
 * ��ȣ�� �ߺ��� �Է� �Ұ� �ϵ��� ó��
 * ������ �������� ���� �ο�
 * 1�� ����� �Է��ڷ������ ����ϰ�
 * 2�� ����� ������ �������� ���
 * 
 * ���
 * ��ȣ �̸� ����. . .  ���� ���� ��� ����
 */
public class StudentExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		System.out.println("��ȣ�� �̸�, �� ������ ������ �Է��ϼ���");
		
		while (true) {
			System.out.print("�Է�:");
			String[] arr = sc.nextLine().split(",");
			if (arr[0].equalsIgnoreCase("0"))
				break;
			Student s = new Student(arr);

		   //��ȣ�ߺ�
			boolean bool = list.contains(s); 
			if (bool) {
				System.out.println("��ȣ �ߺ��ӵ�");
			} else {
				list.add(s);
			}
		}
			new StudentData(list);
			
	}

}
