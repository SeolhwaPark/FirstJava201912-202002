import java.text.DecimalFormat;

/* �߿�!!
 * 
 * ��������ȭ

 * DecimalFormat
 * 123,000 --> 345,123.99
 */

public class Exam_06 {
	public static void main(String[] args) {
		int money = 758600;
		double mon = 458254.7777;
		//�� (�� ������ -> ����Ű ������ ����. �����ڵ�)
		DecimalFormat df1 = new DecimalFormat("�� #,###,###,###");//#�� �����Ͱ� ������ �����̵�.�ڵ�����
		DecimalFormat df2 = new DecimalFormat("#,###.##");
		String str1 = df1.format(money);
		String str2 = df1.format(mon);
		
		System.out.println(money + ":" + str1);
		System.out.println(mon + ":" + str2);
		
		
	}

}
