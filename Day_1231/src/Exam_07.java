import java.util.Scanner;

/*
 * Ű����� 10���� ���� data �Է�
 * �հ踦 ���
 * 
 * GC �������ݷ��� = �޸𸮰������
 */
public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int s =0; //�հ踦 ���� ���� �ʱ�ȭ
		int i = 0;//������ ����. �������̶� �ʱ�ȭ ���ʿ�
		//int a; ������ ����
		while(true) {
			System.out.println("�Է����ּ��� : ");
			int a = scn.nextInt();//�ݺ��ؾ��� ���
			s+=a; // s = s + a
			i++; // i = i + 1;
			if(i==10) break;
		}
		System.out.println(s);//sum
	}

}
