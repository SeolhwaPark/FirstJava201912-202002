package rensyuu;

import java.io.File;
import java.util.Scanner;

/*
 * ó������
 * ������ Ű���带 ���ؼ� �Է¹޴´�
 * ���� : 2,3,1,4,3,.. . . . 
 * 
 * 1 �л������ data.txt���Ϸ� ����Ǿ� ������ 20���̳�
 * 
 * 2 �� ���״� 5������ ���
 * 
 * 3 ���������� �� ���׺� ��������� ���
 */
public class GakuseiExam {
	public static void main(String[] args) throws Exception{
		
		Gakusei[] gakusei = new Gakusei[20];
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� :");
		String[] kaitou = sc.nextLine().split(",");
		
		Scanner sf = new Scanner(new File("scn\\Gakusei\\seiseki1.txt"));
		System.out.println("                     ** ������ ä�� ���ǥ **");
		System.out.print("��ȣ\t�̸�");
		for(int x=0; x<20; x++) {
			System.out.print((x+1) + "\t");
		}
		System.out.println("����");
		
		while(sf.hasNext()) {
			String[] s = sf.nextLine().split(",");
			Gakusei seiseki = new Gakusei(s);
			gakusei[cnt] = seiseki;
			cnt++;
		}
		
	}

}
