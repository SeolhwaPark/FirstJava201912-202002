package thread;
/*
 * ��Ƽ������ 
 * �� �۾��� ���డ��. �����ư��鼭 �۾��� ����, ����ý��ۿ��� ����
 * (CPU�� 1����..)
 * 
 * Thread��� Ŭ������ ��ӹ޾Ƽ�
 * Runnable�������̽� ����
 * 
 * ������ -> �����ڵ� (�۾��ϱ� ���� ����Ǵ� �ڵ�) ==�۾�
 * 
 * ���Ͻ����� - > �ϳ��� �۾��� ������ ���� �״��� �۾��� �����ϰ�...
 */
//class A implements ... ����
//class AA extends Thread{ //extends Thread �����

import java.awt.Toolkit;

	

public class Exam_01 {
	public static void main(String[] args) {
	//��Ƽ�������� �������. �ú��ҽý��� TSS	
	Toolkit tool = Toolkit.getDefaultToolkit(); 
	for(int x = 0; x<10; x++) {
		tool.beep();//����Ŀ �Ҹ����� �ϴ°�
		try {
			Thread.sleep(500); // 0.5�� ���� //sleep == cpu�� ������Ű�°�
		}catch(Exception o) {} //1000 == 1��
	}
	for(int x = 0; x<10; x++) {
		System.out.println("��");
		try {
			Thread.sleep(500);
		}catch(Exception e) {}
	}
	}
}
