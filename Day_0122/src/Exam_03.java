/*
 * 1���� �Է�
 * System.in.read -> 1���ڸ� �޾Ƽ������� ����...
 * 
 */
public class Exam_03 {
	public static void main(String[] args) throws Exception{
		System.out.print("�Է�:");
		byte[] bytes = new byte[100];
		//char ch = (char)System.in.read(); //�Է¹��� ���� ��ü�� ��°���
		int cnt = System.in.read(bytes); //�Է¹��� ���ڼ��� ���Ͱ�2���� �հ�Ǽ�  ��µ�

		System.out.println("���ڼ�:" + cnt);
		String s = new String(bytes, 0, cnt-2);
		System.out.println("�Է��ڷ��� ���ڼ�:" + s);
		
		System.out.println("���ڼ�:" + s.length()); // ���ڿ��� ����
		System.out.println("���ڼ�:" + s.isEmpty()); //����ճ� �ƴѰ�
		String str = "";
		if(str.isEmpty()) {
			System.out.println("���ڿ��� �������");
		}else {
			System.out.println("����" + str);
		}
		//System.out.println("���ڼ�:" + str.isEmpty()); //����ճ� �ƴѰ�
	}

}
