import java.util.Scanner;

/*
 * ����
 * Ű�����Է�(�ִ� 10��)
 * �������� �����ϴ� Ŭ���� ����
 * �Է� : 2 6 9 7 5 2 6
 *
 *�޼ҵ�
 * ���
 * �� : 2 6 9 7 5 2 6 
 * �� : 2 2 5 6 6 7 9
 * 

 */

class HH{
	//���
	void hhPrint(int a[],int cnt) {
		System.out.print("��� :");
		for(int x = 0; x < cnt; x++) {
			System.out.print( a[x] + "\t" );
		}
		System.out.println();
	}
	//����
	void sort(int a[],int cnt) {
		for(int x=0; x<cnt-1; x++) {//���� //���ذ� ���� ����� ���� -1
			for(int y=x+1; y < cnt; y++) {//���ؼ�
				if(a[x] > a[y]) { //�������������� ����
					int temp = a[x]; //�־�� ��
					a[x] = a[y];//�����ͱ�ȯ���
					a[y] = temp;			
				}
			}
		}
	}
}

public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a[] = new int[10];
		int cnt = 0; //����
		System.out.print("�Է� : ");
		//�Է��۾�
		for(int x = 0; x < a.length; x++) {
			a[x] = scn .nextInt();
			if(a[x] == -99) break;
			cnt++;
		}
		//��ü����
		HH hh = new HH();
		
		// �� (��� �޼ҵ�) ȣ��
		hh.hhPrint(a, cnt);
		
		// ���� �޼ҵ�) ȣ��
 		hh.sort(a, cnt);
		
		// �� (��� �޼ҵ�) ȣ��
		hh.hhPrint(a, cnt);
	}
}
