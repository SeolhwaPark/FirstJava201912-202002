package thread;

import java.awt.Toolkit;

/*
 * �������̽� ����
 */
class BeepTask implements Runnable{
	@Override
	public void run() {
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
public class Exam_03 {
	public static void main(String[] args) {
		//Beep beep = new BeepTask();
		Runnable beep = new BeepTask();
		
		Thread thread = new Thread(beep);//������� �Ű������� �Ѱܼ� ����
		thread.start();
		
		for(int x = 0; x<10; x++) { 
			System.out.println("��");
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
		

	}

}
