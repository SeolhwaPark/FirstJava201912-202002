package textstream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/*
 * �ؽ�Ʈ �����
 * Reader / Writer
 * InputStreamReader / OutputStreamWriter ȭ�����,�ܼ������
 * FileReader / FileWriter ���������
 * BufferedReader / BufferedWriter ���Ϳ���,�����ڰ�ư��
 * 					PrintWriter
 */

public class Exam_01 {
	public static void main(String[] args)throws Exception  {
		File file = new File("c:\\data\\work\\data2.txt");
		//�ܼ� ���
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		//PrintWriter pws = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		pw.println("ȭ�� ��� �׽�Ʈ�Դϴ�.");
		pw.close(); //�� �ݾƾ���

		//���� ���
		PrintWriter pwf = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		pwf.println("���� ��� �׽�Ʈ");
		pwf.close();
		
		//��ü�� ����� �� ������ ����. ��ü����½�Ʈ������ ������ϸ� �� ����..
		
	}
}