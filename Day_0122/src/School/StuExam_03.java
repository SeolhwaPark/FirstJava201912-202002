package School;

import java.util.Scanner;

//�Է��׸�� ����, ��ȣ üũ
// �� ���� ��ȿ�� �˻�
public class StuExam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student[] st = new Student[10];
		int cnt = 0;
		while (cnt < 10) {
			System.out.print("�Է� :"); // 1,aaa,55,66,77
			// �⺻�׸� 5���� ���°��� �˻�
			String[] str = scn.nextLine().split(",");
			if(str[0].equalsIgnoreCase("end"))break;
			
			if (str.length != 5) {
				System.out.println("�Է¿���");
				continue; // ������ �ȳ������� while���ǽ����� �ٽ� ��
			}
			// ��ȣ ����üũ str[0]
			String bun = "";
			for (int x = 0; x < str[0].length(); x++) {
				char ch = str[0].trim().charAt(x);// ������ �����ϰ� �ѱ��ڸ� ����
				if (ch >= '0' && ch <= '9') { // 0�� 9���̿� �����Ѵٸ�
					bun += ch; // 0�� ""== �������� ó��
				} else {
					bun = "";
					break; // �ѱ��ڶ� Ʋ���� ��������
				}
			}
			if (bun.equals("")) { // ��ȣ�� �߸������� ��
				System.out.println("�Է¿���");
				continue; // ��
			}
			int b = Integer.parseInt(bun); // ���ڸ� ���ڷ� �ٲ���
			if (b > 10) { // 1~10�������� �ƴ���
				System.out.println("�Է¿���");
				continue; // ��
			}
			
			System.out.println("bun =" + bun);
			
			//�� ���� ��ȿ�� �˻�
			//����
			boolean flag = scoreCheck(str[2]); //Ʈ�簡 ���� ����// �����ڵ����� ����
			if(!flag) {
				System.out.println("�Է¿���");
				continue; // ��
			}
			int kk = Integer.parseInt(str[2]); // ���ڸ� ���ڷ� �ٲ���

			//����
			boolean flag1 = scoreCheck(str[3]); //Ʈ�簡 ���� ����// �����ڵ����� ����
			if(!flag1) {
				System.out.println("�Է¿���");
				continue; // ��
			}
			int ee = Integer.parseInt(str[3]); 
			//����
			boolean flag2 = scoreCheck(str[4]); //Ʈ�簡 ���� ����// �����ڵ����� ����
			if(!flag2) {
				System.out.println("�Է¿���");
				continue; // ��
			}
			int mm = Integer.parseInt(str[4]); 
			
			//��ü����*************************************88
			 st[cnt] = new Student(b,str[1],kk,ee,mm);

			cnt++;
		}//while��
		
		System.out.println("�Է�����");
	
		School sc = new School(st, cnt);
		sc.SchoolPrint();
	}
	
	
	
	
	static boolean scoreCheck(String str) { //����Ÿ��
		String temp = "";
		for (int x = 0; x < str.length(); x++) {
			char ch = str.trim().charAt(x);// ������ �����ϰ� �ѱ��ڸ� ����
			if (ch >= '0' && ch <= '9') { // 0�� 9���̿� �����Ѵٸ�
				temp += ch; // 0�� ""== �������� ó��
			} else {
				temp = "";
				break; // �ѱ��ڶ� Ʋ���� ��������
			}
		}
		if (temp.equals("")) { // ��ȣ�� �߸������� ��
			return false; //������ �������
		}
		int var = Integer.parseInt(temp); // ���ڸ� ���ڷ� �ٲ���
		if (var <0 || var > 100) { // 0~100�������� �ƴ���
			return false;
		}
		
		return true;
	}
	
}
