/*
 * ���ڿ� �и�
 * substring(���� , ������)
 * substring(����)
 */

public class Exam_05 {
	public static void main(String[] args) {
		String str = "Hello world Java";
		//��ü ���ڿ� ���� ���
		int length = str.length(); //���ڿ��� ����
		//Hello�� ����
		String a = str.substring(0,5);
		//Java ���ڸ�
		String b = str.substring(12);
		System.out.println(a+" "+b);
		
		for(int x = 0 ; x<str.length(); x++) {
			char ch = str.charAt(x);//x�� ��ġ�� �ִ� ���ڸ� �̾ƿ��� ���
			System.out.println(ch);
		}
		
	}

}
