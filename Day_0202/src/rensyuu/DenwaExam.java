package rensyuu;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

/*
 * ��ȭ��ȣ�� �Է�
 * 010-1234-1234
 * end (��ҹ��� �������) ���� 
 * 
 * �˻����� ��  1�ڸ� �̻� �Է½� �� ���ù�ȣ�� ��µǾ� �Ѵ�
 * ���ڸ��� �Է��ص� ��µǾ� ��.
 * 
 * 010- / 
 * ����,�ڵ���
 * 
 * 010- 
 * �Ȱ�Ʈ�� ��
 * 
 * �ڿ� ��ȣ
 */

public class DenwaExam {
	public static void main(String[] args) {
		Denwa[] den = new Denwa[10];
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		boolean check = false;
		String pat = "\\d+-\\d+-\\d+"; //��ȭ��ȣ ����
		String patt = "(01\\d?)-\\d{1,4}-\\d{4}";  //��ȭ��ȣ �˻�
		System.out.println("***��ȭ��ȣ �˻�***\n���ڸ� �̻��� ��ȭ��ȣ�� �Է��ϼ���.");

		while (true) {
			System.out.print("�Է�:");
			String bangou = scn.nextLine();
			if (bangou.equalsIgnoreCase("end"))
				break;
			if (ketaCheck(bangou)) {
				continue;
			}
			if(patCheck(pat,bangou)) {
				continue;
			}
			
			String[] num = bangou.split("-",2);	
			for(int x=0; x<2; x++) {
				
			}
			den[cnt] = new Denwa(bangou);
			cnt++;
		}
	}

	static boolean ketaCheck(String bangou) {
		if (bangou.length() < 1) {
			System.out.println("��ȣ�� �ѱ����̻� �Է����̼�");
			return true;
		} else
			return false;
	}

	static boolean patCheck(String a,String u) {
		boolean bool = Pattern.matches(a, u);
		if(bool) {
			System.out.println( "�����ӵ�");
			return true;
		}else {
			System.out.println( "������ �ƴԵ�");
			return false;
		}	
	}
	
	static boolean pattCheck(String a,String u) {
		boolean bool = Pattern.matches(a, u);
		if(bool) {
			System.out.println("okkkkay");
			return true;
		}else {
			System.out.println("no");
			return false;
		}
	}
}
