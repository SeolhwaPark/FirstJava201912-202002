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

class HH1{
	
	AA a = new AA();
	//���
	void hhPrint(int []a, int cnt, String str){
		System.out.print(str + " :");
		for(int x = 0; x<cnt; x++) {
			System.out.print(a[x] + "\t");
		}
		System.out.println();
	}
	
	//����
	void dataSort(int a[],int cnt) {
		for(int x = 0; x<cnt-1; x++) {
			for(int y= x+1; y<cnt; y++) {
				if(a[x]<a[y]) {
					int imsi = a[x];
					a[x] = a[y];
					a[y] = imsi;
				}
			}
		}
	}
	
}

public class Exam_08_sam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a[] = new int[10];
		int cnt = 0;
		//�Է�
		System.out.print("�Է� : ");
		for(int x = 0 ; x<10; x++) {
			a[x] = scn.nextInt();
			if(a[x] == -99) break;
			cnt++;
		}
		System.out.println("�Է°Ǽ� : " + cnt);
		//��ü����
		HH1 h = new HH1();
		
		//�� ���
		h.hhPrint(a,cnt, "��");
		//����
		h.dataSort(a, cnt);
		
		//�� ���
		h.hhPrint(a,cnt, "��");

	}
}
