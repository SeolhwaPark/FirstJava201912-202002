package iostream;

import java.io.File;

public class Exam_03 {
	public static void main(String[] args) {
		File f = new File("c:\\data\\work\\test.txt");
		if (f.exists()) {
			f.deleteOnExit(); //�������α׷� ����� ����
			System.out.println("���ϸ�:" + f.getName());
			System.out.println("���ϰ��:" + f.getPath());//�����̸��� ����
			System.out.println("���ϰ��:" + f.getParent()); //�� ��θ� ����
			System.out.println("����ũ��:" + f.length()+"kb");
			System.out.println("�����ְ������:" + f.lastModified());
		}else {
			System.out.println(f.getName() + "�� ����");
		}
		
		
		
	}

}
