/* int�� 4����Ʈ int b=7%5;
 * ������ �Ǽ��� �������� �Ǽ�
 * Double�� 8����Ʈ double a=7/5.;
 * a=(int)(7/5.);//��������ȯ�� ����� ������ ���ɼ��� ŭ�Ф�
 * �ڵ�����ȯ(��������Ʈ�� ū����Ʈ�� ���� ��) ->������ �Ǽ���,�Ǽ��� ������~~
 */
public class Exam_02 {

	public static void main(String[] args) {
		int a=(int)(7/5.);//��������ȯ
		int b=7%5;
		System.out.println("7/5="+a);
		System.out.println("7%5="+b);
		System.out.println("7/5="+7/5.);
		System.out.println("7%5="+7%5);
		
		int var=(int)3.14;
		double d1 =3.14;
		double d2 =90;//�ڵ�����ȯ
		System.out.println("d2="+d2);
		System.out.println("var="+ var);
	}

}
