package student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * ó������
 * ������ Ű���带 ���ؼ� �Է¹޴´�
 * ���� : 2,3,1,4,3,.. . . . 
 * 
 * 1 �л������ data.txt���Ϸ� ����Ǿ� ������ 20���̳�
 * 
 * 2 �� ���״� 5������ ���
 * 3 ���������� �� ���׺� ��������� ���
 */
public class StudentExam {
	public static void main(String[] args) throws FileNotFoundException {
		Student[] student = new Student[20];
		int cnt =0;
		//Ű�����Է�
		Scanner scn = new Scanner(System.in);
		System.out.print("�����Է� :");
		String[] kotae = scn.nextLine().split(",");
		
		//���ϵ鿩����
		Scanner scf = new Scanner(new File("src\\student\\data.txt"));
		System.out.println("                     ** ������ ä�� ���ǥ **");
		System.out.print("��ȣ\t�̸�\t");
		
		for(int x = 0; x<20; x++) {
			System.out.print((x+1) + "\t");
		}
		System.out.println("����");
		
		while(scf.hasNext()) { //������ �о�ö�
			String[] str = scf.nextLine().split(",");
			Student jj = new Student(str);
			student[cnt] = jj;
			cnt++;
		}
		
		StudentData data = new StudentData(student,kotae,cnt);
	}

}
