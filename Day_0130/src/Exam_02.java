import java.util.regex.Pattern;

/*
 * ��ȭ��ȣ ��ȿ�� �˻�
 * 010-1111-1111
 * () �׷�ȭ
 * (010|011)-\d{3,4}- \d{4}
 * 010 �Ǵ� 011 ���� �ϳ� 3�ڿ��� 4��
 * 
 * 
 */
public class Exam_02 {
	public static void main(String[] args) {
		String tell = "010-1234-1234";
		String patt = "(01\\d?)-\\d{1,4}-\\d{4}"; //������ �涧..
		
		boolean bool = Pattern.matches(patt, tell);
		if(bool) {
			System.out.println(tell + "= okkkkay");
		}else {
			System.out.println(tell + "= no");
			
		}
	}

}
