import java.util.Scanner;

/*	Ŭ���� �迭ó��
 * Ű���� �Է� �ִ� 10�� 
 * �Է� : ��ȣ �̸� ���� ���� ���� 
 * . . . . . . . . . . . .
 * 
 * ��� (������ �������� ��������)
 * ��ȣ �̸� ���� ���� ���� ���� ���
 * 
 * ��ȣ�� -99�̸� �Է�����
 * 1.�л� ���� Student
 * 2.�л� ���� ó�� StudentData
 * 3.�ڷ� �Է� main()
 */

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		Student[] std = new Student[10];
		
		while (cnt<10) { //��ü10��� �Է�
			Student s = new Student();
			System.out.print((cnt+1) + "�Է��ϼ��� :");
		
			s.number = scn.nextInt();
			if(s.number == -99)break;
			s.name = scn.next();
			s.kor = scn.nextInt();
			s.eng = scn.nextInt();
			s.mat = scn.nextInt();
			std[cnt] = s;
			cnt++;
			if(cnt == 10)break;
		}
		StudentData data = new StudentData(std,cnt);
		data.dataPrint();
		
	}

}
