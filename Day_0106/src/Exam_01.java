import java.util.Scanner;

/*
 * �Ҽ��Ǻ�
 * �Ҽ� = �ڽŰ� ���� ���ڷ� ����������
 * �Ҽ��ƴϸ� �ٸ� ���ڶ� ������ 0�� ����
 * 
 * Ű�����Է�
 * 1) -99�� �Է½� ���α׷� ����
 * 2) �Է¹����� 2 ~ 100
 * 3)�Է��ڷ��� �Ҽ��� ������ ���� ���Ͽ� ���
 * 
 * �Է� : -6
 * �Է� ���� ---> �Է��ڷᰡ �ƴ�
 * �Է� : 3,
 * . . . .
 * 7,15,67,45,38
 * �Է� : -99
 * �Է� �ڷ� �� : xx (�Է¿����� ������ �ȵ�)
 * �Ҽ� ���� : xx
 * �Ҽ��հ� : xx
 * 
 */
public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int tcnt = 0; //�Է��ڷ�� ī��Ʈ
		int pcnt = 0; //�Ҽ� ���� ī��Ʈ
		int psum = 0; //�հ� �Ҽ���
		
		while(true) {
			System.out.print("2 ~ 100 �Է��ϼ��� : ");
			int val = scn.nextInt();
			if(val==-99){ //�Ҽ�
				break;
			}
			if(val >=2 && val <=100) {
				tcnt++;//�Ҽ��Ǻ� 
				
				for(int x=2; x<=val; x++) {
					if(val%x == 0) { // ����������
						if(val == x) { //�ڱ��ڽ��̸� �Ҽ�
							pcnt++;
							psum += val;
							
						}
					//�Ҽ��� �Ҽ��� �ƴ� ���� ����Ǵϱ� break
					break;	
					}//���� else �ʿ���� ����
				}
			}else {
					System.out.println("error �Է¹����� �ƴմϴ�");
				}
			}
		
			System.out.println("�Է� �ڷ� �� : "+ tcnt);
			System.out.println("�Ҽ� �ڷ� �� : "+ pcnt);
			System.out.println("�Ҽ� �հ� : "+ psum);
	}
}
