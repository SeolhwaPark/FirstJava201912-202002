package jslhrd5;

import java.io.IOException;

/*
 * ����ó��
 * 
 * �ڹٸ� ������ �Ͽ� ������ �߻� ���� �ʾҴٰ� ���ϴ� ����� ���� ���� �ƴϴ�.
 * ���α׷������� ��������, ����ϴ� ���� ����ġ �ʴ� ������ �߻��ϴ� ��찡 �ִ�.
 * �̷��� ���α׷��� ����Ǵ� ���ȿ� �߻��ϴ� ����ġ ���� ������ ���ܶ�� �ϴ�.
 * �� ���ܴ� �Ϲ������� �ʴ� ��Ȳ���� �߻��ϴ� �����̴�.
 * 
 * 
 * �ֻ��� Ŭ���� == Exception
 * 
 * 
 * 
 * try{
 * 
 * }catch(Exception e){ 	<- Exception�� ��� ���ܰ� ���� �� �� ���ܸ� ó������
 * 
 * }finally{ <- finally ������ �߻��� ������� ������
 * 
 * }
 */
public class Exam_05 {
	public static void main(String[] args) {
		try {
			int a = System.in.read();
		}catch (IOException e) {
			System.out.println("���ܰ� �߻�");
			//e.printStackTrace(); // ���ܸ� Ȯ���� ��
		}catch (Exception ee) { //catch�� �þ�� ������ ������ �� �� �Ը� Ŀ��
			ee.printStackTrace();
		}finally { //������..
			
		}
		
		
	}

}
