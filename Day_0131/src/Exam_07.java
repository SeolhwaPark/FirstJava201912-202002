/*
 * ���ڿ��� ����ȭ
 */
public class Exam_07 {
	public static void main(String[] args) {
		String date = "20200131"; 
		//2020-01-31
		String y = date.substring(0,4);//�ɰ���
		String x = date.substring(4,6);//�ɰ���
		String z = date.substring(6);//�ɰ���
		String str = y+"-" + x + "-" + z;
		System.out.println(str);
		
		//2020�� 01�� 31��
		
		
	}
}
