package iostream;
/*
 * ����� ��Ʈ��
 * 
 * ����Ʈ��� (InputStream, OutputStream) ->�ѱ۱���
 * 
 * ����(�׽�Ʈ)��� (Reader,Writer)
 */
import java.io.*;

public class Exam_01 {
	public static void main(String[] args) {
		File f = new File("c:\\data\\work");
		if(f.exists())//�����Ѵٸ�
			f.delete(); // �ڹٷ� ���� �����ϱ�
		try {
			Thread.sleep(3000); //3�� ��ٸ��ٰ�
		} catch (Exception e) {}
		
		System.out.println("����");
		try {
			Thread.sleep(3000); //3�� ��ٸ��ٰ�
		} catch (Exception e) {}
		
		if(!f.exists())//�������� �ʴ´ٸ�
			f.mkdir(); // ���� �����
		System.out.println("��");
		
	}

}
