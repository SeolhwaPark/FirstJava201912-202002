import java.util.Scanner;

/*
 * Ű����� ������ ���� data 10�� �Է�
 *  ��, data�� 50�̻� 100���� �� �Է�  
 *  1,60,50,70,-99,69,60
 */
public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
			int[] score = new int [10];  // �Ԥ��¹ް�
			int cnt = 0;  //data ���� ī��Ʈ�ϱ�
			
			while(true) {  //���� �ݺ� 
				System.out.print("���� �Է� : ");
				int jumsu = scn.nextInt();
				if (jumsu>=50 && jumsu<=100) {
					score[cnt] = jumsu ;  // 0��°�� �迭���� ���� ���� ��
					cnt++;  //ī��Ʈ�� ���� ����
					if(cnt==10) { //�Է¼�
						break;  //Ż�� 
					}
				}
			}
			//���
			for(int i=0; i<10; i++ ) {  //������ Ƚ�� �ݺ�
				System.out.println(score[i]+"	");
			}
	}

}
