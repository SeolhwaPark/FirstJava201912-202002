import java.util.Scanner;

/*
 * Ű���� 10����, ��ȯ�� ���� �Է� ������ ���� ����ϴ� Ŭ������ �ۼ��Ͻÿ�
 * ��ȯ�ϴ� �κ��� 2,8,10,16 �̿��� ������ �ٽ� �Է¹޾���
 * 
 * 1.[��]
 *	10���� : 25
 *  ��ȯ : 2
 * 
 * 2.[��]
 * 10���� : 25
 * 2���� : 11001
 */


class ConvNumber{
	//�Ӽ�
	//���α׷��ۼ�
	int dec, conv, cnt;
	int arr[] = new int [16];//2�������� �ڸ����� �� �� �ְ�...
	char str[] = {'0','1','2','3','4','5','6','7','8','A','B','C','D','E','F'};
	//16���� ����
	
	char bi [] = new char[16];//��ȯ�� ���� ����
	String string = "";//��ȯ�� ���� ����ϱ� ���� ���ڿ�
	
	
	//���
	ConvNumber(){
	}
	
	ConvNumber(int dec, int conv){
		this.dec = dec;
		this.conv = conv;
	}
	
	String conversion() {
		for(int i = 0; i<arr.length; i++) {
			bi[i] = str[dec%conv];
			if((dec/conv)>0) cnt++;
			dec = dec/conv;
		}
		for(int i = cnt; i>=0; i--) {
			string+=bi[i];
		}
		return string;
	}
	
}
public class Exam_03 {
	public static void main(String[] args) {
		//�Է�
		Scanner scn = new Scanner(System.in);
		System.out.print("10���� :");
		int dec = scn.nextInt();
		int conv;
		while(true) {
			System.out.print("��ȯ :");
			conv = scn.nextInt();
		
		if(conv == 2 || conv == 8 || conv == 16) break;
		else System.out.println("�߸��� ��ȯ ��");
		}
		
		//���
		ConvNumber con = new ConvNumber(dec,conv);
		System.out.println("10���� : " + dec);
		System.out.println(conv + "���� : " + con.conversion());
	}
}