import javax.print.DocFlavor.STRING;

/*
 *String Ŭ���� �޼ҵ�
 *
 * valueOf(); ������ ���� ���ڿ��� ��ȯ
 */
public class Exam_01 {
	public static void main(String[] args) {
		int a = 100;
		String aa = a + ""; // == "100"
		String ab = String.valueOf(a);
		String ac = String.valueOf(true); //=="true"
		
		//����Ŭ����(Wrapper) �⺻�ڷ����� Ŭ����ȭ �Ǿ����� ��
		//int -> Integer, byte -> Byte
		//char e-> Character
		
		int b = Integer.parseInt(ab); //���ڸ� ������ �ٲ�
		
		//int bb = Integer.parseInt("123"); //���ڸ� ������ �ٲ�, ����� ������ ����
		
		int bbb = Integer.valueOf(ab);//������ ���� ���ڿ��� ��ȯ
		
		int var = 100;
		double dou = 3.141582;
		//���� var = 100 �Ǽ� dou = 3.14 
		System.out.println("���� var =" + var + " �Ǽ� dou =" + dou);
		String ss = String.format("���� var = %5d �Ǽ� dou =%5.2f" , var, dou);//format ���� �����
		System.out.println(ss);
		String sss = String.format("���� var = %10d �Ǽ� dou =%10.3f" , var, dou);//format ���� �����
		System.out.println(sss);
		
	}

}
