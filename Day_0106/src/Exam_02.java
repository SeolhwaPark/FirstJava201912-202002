import java.util.Scanner;

/*
 * Ű����� ���� (2 ~ 1000) �Է�
 * 1) 2~�Է°� ������ �Ҽ����� ���
 * 2) �� �ٿ��� 5���� ���
 * 3) �������� �Ҽ��� ���� ���
 * 4) ����
 *  �Է� : 50
 *  
 *  2 3 5 7 11 
 * 13 .......
 * 
 * �Ҽ� ���� :xx
 */
public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
/*		
		int cnt = 0; //����
		int num; //�Է°�
		
		while(true) { //���ȿ� ��� �ݺ� 
			System.out.print("2~1000 ������ ���� 1�� �Է� �ϼ���(0�� �Է� �ϸ� ����) >> ");
			num = sc.nextInt();
			
			if(num == 0) break;// �Է��� 0�� ���� �� ����
			
			if(num>=2 && num<=1000) { // ���� 2�̻� 1000���ϸ�
				for(int j = 2; j <= num; j++) {//Ű�����Է� ���� �� ���� ��ŭ �տ� �ִ� �Ҽ��� ã�� ���� ���� //������ Ƚ���� �ݺ�
					for(int i = 2; i <= j; i++) { //
						if(j%i==0) {
							if(j==i) {//�Ҽ�
								System.out.print(j+"\t"); //�Ҽ� 2 3 4
								cnt++; //��������
								if(cnt % 5==0) { //���� 5���� �Ǹ�
									System.out.println(); // �ٹٲ�
								}
								break; // for�� Ż��
							}
							else break; // for�� Ż��
							
						}
					}
					
				}
				System.out.println(num+"�� �Ҽ� ���� : "+cnt);
			}else System.out.println("�Է� ����!");
		}
		
*/		
		int pcnt = 0; //�Ҽ� ���� ī��Ʈ
		int num;
		while(true) {
			System.out.print("2 ~ 1000 �Ҽ��� �Է��ϼ��� : ");
			num = scn.nextInt();
			if(num >=2 && num <=1000) {
				break;
			}else {
				System.out.println("error �Է¹����� �ƴմϴ�");
			}
		}
			for(int i=2; i<=num; i++) {
				for(int x=2; x<=num; x++) {
					if(i%x == 0) {
						if(i == x) {
							System.out.print(i + "\t");
							pcnt++;
							if(pcnt%5 ==0) {
								System.out.println();
						}
							break;
					}
					else break;
					}	
				}
			}
			System.out.println("�Ҽ� ���� : "+pcnt);
		
	}
}
