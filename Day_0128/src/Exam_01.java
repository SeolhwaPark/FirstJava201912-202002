import java.util.Scanner;

/*
 * Ű����� �����ܾ �Է�
 * �������� �󵵼��� ���(��ҹ��� ���� ����)
 * 
 * �Է¿���
 * �ܾ� : Apple
 * �ܾ� : Seoul
 * . . . . 
 * 
 * �ܾ� : end (�Ǵ� END) --> ����
 * 
 * ��¿���
 * A B C D . . . Z �迭 26
 * 0 2 1 0 . . . 1
 *  
 */
class AlphaTest1{
	String alpha;
	
	AlphaTest1(){}
	
	AlphaTest1(String alpha){
		this.alpha = alpha;
	}
	
	void alphaPrint(){
		System.out.println();
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		//�Է�
		Scanner scn = new Scanner(System.in);
		AlphaTest1[] al = new AlphaTest1[10];
		int cnt =0;
		
		while(cnt<10) {
			System.out.println("�ܾ� :");
			String alpha = scn.next();
			if(alpha.equalsIgnoreCase("end"))break;			
			al[cnt] = new AlphaTest1(alpha);
			cnt++;
		}
		//���
		
		
		
	}
}
