/*
 * ǥ���Է�
 * System.in.read(); -> ���� �Ѱ��� �� �� ����!!!! -> ������ ��ȯ��Ŵ
 * ����ó�� �ʼ�
 */
public class Exam_02 {
	public static void main(String[] args) throws Exception{ //throws Exception ����ó��
		System.out.print("1���� �Է��ϼ��� : ");
		System.in.read();
		System.in.read();
		char ch = (char)System.in.read(); // �� ���ڿ� �ش��ϴ� ASCII Code(����)�� �ʿ��� ���� ����
		// (char) ������ ����ȭ 
		System.out.println("ch="+ch);

	}

}
