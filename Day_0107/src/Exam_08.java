import java.util.Scanner;
/*Ű�����Է�(1~99)
 * �Է��ڷᰡ -99, �Ǵ� �Է��ڷ� �Ǽ��� 20���� ����
 * �Է� : 77
 * . . . 
 * �Է� : -99(-99�� �Է��ڷᰡ �ƴ�)
 * �Է��ڷ� : xx xx xx xx xx............
 * ��� : xx
 * ����� ���� ����� �� : xx
 */

public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score[] = new int[20]; 	//�迭���� 20��
		int a = score[0]; 	//�Է¹��� �ڷ�����
		int cnt = 0; 	//�ڷ᰹�� ī��Ʈ
		int sum = 0; 	//�հ�� ��հ���ؾ���
		double ave = 0; 	//��� 
		
		while(true){ 	//�ڷ� �Է¹ޱ�
			System.out.print("�Է� : ");
			int data = scn.nextInt(); //�ڷ��Է¹��� ����
			if(data == -99 || cnt == 20){
				break; //-99�Է��� �����ų� Ȥ�� count�� 20���� �Ǹ� ����
			}
			if(data>=1 && data<=99){ //1�̻� 99������ �� //��ձ��ϱ�
				score [cnt] = data; //�迭�ȿ� �����͵���
				cnt++; //���ڵ��� �������� ��
				sum = sum + data;
			}else {
				break;
			}
		}
		System.out.print("�Է��ڷ� : ");
		for(int i=0; i<cnt; i++) { //�迭���� 
			System.out.print( score[i] + "\t "); //���η� ���鼭 �����ϱ�
		}
		
		System.out.println();
		System.out.println("��� : "+ (double)sum/cnt); 
		
		ave = (double)sum/cnt; //��հ� ������ ��Ÿ���� ������ ������ int��
		double cha[] = new double[20]; //�迭���� 20�� //����ڷ������ϱ�//������ �ϰ����� int
		for(int i=0; i<cnt; i++) { //������ ����i���� ū ���ȿ� 
			if(score[i]>ave) { //���� �迭�� ��պ��� ũ��
				cha[i] = score[i]-ave; //�迭�ȿ� ����� �� ����
			}else if(score[i]<ave){ //�ƴϸ� �迭���� ����� �� ũ��
				cha[i] = ave - score[i]; //�迭�ȿ� ���� ����� �� ����
			}
		}
		double min = cha[0]; //��հ��� ����� �� 
		int AAA=0; //����� �� ���� ��������
		for(int c = 1 ; c<cnt; c++) { // ����c�� �������� ���� ���ȿ� ���
			if(min>cha[c]) { //�ּҰ� �迭 �ȿ� ������
				min = cha[c]; //�� ���� ��󳻱�
				AAA=c; //�迭 �ȿ����� �ּҰ��� ����
			}
		}
		System.out.println("��հ� ����� �� : "+ score[AAA]);
		//syso ctrl space 			System.out.println();
	}
}