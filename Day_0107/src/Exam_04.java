import java.util.Scanner;

/*
 * Ű���� �Է�(2~ 100)
 * �Է°��� -99�̸� ���� 
 * �Է��ڷ� �� �Ҽ��� ���Ͽ� ���(�ִ� 5���� ã�Ƴ��� ����)
 * �Է� : 5
 * . . .
 * �Է� : -99
 * �Ҽ� : x x x x x
 * 
 */

public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sosu[] = new int [5];
		int cnt = 0; //�Ҽ��� �� ����
		int a = 0; //�Ҽ� �Է¹��� ����
		while(true) {
			System.out.print("�Է��ϼ��� : ");
			a = scn.nextInt();
			if(a == -99) break; //-99�̸� ��
        for (int i = 2; i < 100; i++) // �������� ���� �ݺ������� Ž�� 2����99����
        {
                if(a%i ==0) {   //�������� 0�̸� ����̹Ƿ� count�� 1���� ��Ų��.{
                	if(i==a) {
                		sosu[cnt]=a;
                    	
                		cnt++;
                	}
                }
        	}
        }
/*
		int prime[] = new int[5];
		int cnt = 0;
		while(ture){
			System.out.print("�Է� : ");
			int a = scn.nextInt();
			if(a == -99 || cnt == 5){
				break; //-99�Է��� �����ų� Ȥ�� count�� 5���� �Ǹ� ����
			}
			if(a>=2 && a<=100){ //2�̻� 100������ ��
				for(int x=2; x<=a; x++){ //2�̻���
					if(a%x == 0){ //�Ҽ� �ƴ� ��
						if(a == x){ //�Ҽ��� ��
							prime[cnt] = a; //�Է¹��� ���� �Ҽ��̰� 
							cnt++;//�Ҽ������� ����
							break; //�Է¹��� ������ŭ �Ҽ��� ������ ��
						}
						break;
					}
				}
			}else {
				System.out.print("�Է¿���"); //2���� 100�̻��̸� ����
			}
		}
			System.out.print("�Ҽ� : ");
			for(int x=0; x<cnt; x++){ //�Ҽ��� ������ŭ 
				System.out.print("prime[x] + "\t"); // ���鼭 ���
 */
		
		
	}
}
