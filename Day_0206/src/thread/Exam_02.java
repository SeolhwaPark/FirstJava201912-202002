package thread;

import java.awt.Toolkit;
/*
 * ��ӹ��� ����
 * 
 * ��ӹ����� �����带 ����� �� ����
 */
class Beep extends Thread{
	@Override
	public void run() { //run �۾��� ����
		Toolkit tool = Toolkit.getDefaultToolkit(); 
		for(int x = 0; x<10; x++) {
			tool.beep();//����Ŀ �Ҹ����� �ϴ°�
			System.out.println("�Ҹ�"); //�۷� �Ҹ��� ǥ��
			try {
				Thread.sleep(500); // 0.5�� ���� //sleep == cpu�� ������Ű�°�
			}catch(Exception o) {} //1000 == 1��
		}
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		
		Beep beep = new Beep();
		
		//beep.run(); ���Ͻ�����
		beep.start(); //�����带 ���۽�Ŵ ..��Ƽ������������ ��µ�
		
		for(int x = 0; x<10; x++) { 
			System.out.println("��");
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
		
		
		
		
	}
}
