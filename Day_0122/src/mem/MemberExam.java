package mem;

import java.util.Scanner;


/*
* nextLine ������ �־ ���͸� ĥ �� ����..
* 
* 
* �Է�
* �ڷ��Է� : ȫ�浿, 900206-1, 010-2242-3810

*��� 1 spilt 2.substring
* Integer.parseInt ���ڸ� ������
*
* ó������
* �Է��� 1���ξ� �Է�
* 
* ����üũ
* 1900~1999 1��2�� 2000~2099 3��4��
* �ܱ��� 5,6 / 7,8

*/
public class MemberExam {
	public static void main(String[] args) {
		// �Է�
		Member menbaa[] = new Member[10];
		int cnt = 0;
		Scanner scn = new Scanner(System.in);
		
		while(cnt<10) {
			System.out.print("�ڷ��Է�" + (cnt+1) + " :");
			String[] s = scn.nextLine().split(","); //�Է¹��� �� �ϳ��� �迭�� �����
			if (s[0].equalsIgnoreCase("end"))break;		
			menbaa[cnt] = new Member(s[0],s[1],s[2]);
			cnt++;
		}
		MemberData data = new MemberData(menbaa,cnt);
		data.memPrint();
	}// 2

}// 1
