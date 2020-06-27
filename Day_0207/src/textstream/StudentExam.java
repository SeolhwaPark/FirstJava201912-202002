package textstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
 * ���Ϸ� ���� �Է� (data.txt)
 * 
 * ���¿���
 * ��ȣ    �̸�   ���� ���� ���� ���� ���� ���
 *  1  ȫ�浿  ���� 
 *  
 *  ȭ��(�ܼ�) ��°� ���Ϸ� ���(dataout.txt)�� ���ÿ�
 */


public class StudentExam {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("c:\\data\\data.txt"));
		List<Student> list = new ArrayList<Student>();

		while (true) {
			String data = br.readLine();
			if (data == null)
				break;
			String[] arr = data.split(",");
			Student s = new Student(arr);
			list.add(s);
		}

		PrintWriter pwf = new PrintWriter(new BufferedWriter(new FileWriter("c:\\data\\dataout.txt")));
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t����\t���");
		for (Student s : list) {
			System.out.println(s);
			pwf.println(s);
		}
		pwf.close();
		
	

	}
}
