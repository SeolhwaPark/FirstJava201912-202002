import java.util.Scanner;

/*
 * Ű����� ����� ���۰� ���� �Է� ������ ���� ����Ϲ� Ŭ������ �ۼ��Ͻÿ�
 
 * �Է�
 * �����: ȫ�浿
 * ���� : 5
 * ��: 20
 * 
 * ���
 * ����� :ȫ�浿
 * ������: 5+6+7+8+9+10+. . . .+20 = xxx 
 */


class SeqNumber{
	String name;
	int start, end, sum;
	
	SeqNumber(){}
	
	SeqNumber(String name, int start, int end){
		this.name = name;
		this.start = start;
		this.end = end;
	}	
	
	void print(){
		//5+6+7+8+9+10+. . . .+20 = xxx 
		
		System.out.println("����� :" + name);
		System.out.print("������ :" + start);
		
		sum = start;
		for(int i = start+1; i <= end ; i++) {
			System.out.print("+" + i);
			sum+=i;
		}
		System.out.println(" =" + sum);
		
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("����� :");
		String name = scn.next();
		System.out.print("���� :");
		int start = scn.nextInt();
		System.out.print("�� :");
		int end = scn.nextInt();

		SeqNumber seq = new SeqNumber(name, start, end);
		seq.print();
	}
}
