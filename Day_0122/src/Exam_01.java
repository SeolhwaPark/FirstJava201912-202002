/*
 * StringŬ����
 * ����: "���ڿ�"�� �ش��ϴ� ����� ����ӽ� ��ü�� ����******************
 * 		���ڿ��� �Һ�
 * 
 * 
 * jvm
 * �޼ҵ念�� Ŭ������ �о�帮�� ���� ����/������ ��ü ���� /���ÿ��� �� �ؿ��� ���� ������ ���� ����
 * 
 
 * gc(); �ִ��� ���� �޸𸮸� �����ϰ� ��Ź
 */

class AA{
	
}
public class Exam_01 {
	public static void main(String[] args) {
		String str1 = "1234"; // Ŭ������ �ּҷ� ����Ŵ, ��Ʈ���� �������̵��� �Ǿ� �־ ���� ����
		String str2 = "1234"; // Ŭ������ �����ϱ� ������ ��Ʈ�� ������ �ּҰ� ����
		String str3 = new String("1234"); //new�� ������ ���� ��ü�� ����
		String str4 = null; //== "" �ʱ�ȭ�� �� ���� ��
		String str5 = new String();
		//�� (==) : �⺻�� / equals()
		System.out.println("str1 == str2 :" + (str1 == str2));//�ּҰ� ���Ƽ� true
		System.out.println("str1 == str3 :" + (str1 == str3));
		System.out.println("str2 == str3 :" + (str2 == str3));
		System.out.println("str1.equals(str3) :" + str1.equals(str3)); //������ ��ü�ΰ�
		
		//str += "0000"; 
		//AA a = new AA();
		//System.out.println("a =" + a); // �������̵��� �ȵǸ� �ּҸ� ����
		//System.out.println("str =" + str);	
		//System.out.println("str4 =" + str4);	
		//System.out.println("str5 =" + str5);	
		
	}
}
