import java.util.regex.Pattern;

/*
 * �̸�����ȿ���˻礿
 * abc@abc.com => abc@abc.co.kr
 * \w 1���� �̻� +@ \W 1�����̻� +.\w+(\.\w+)?
 * �׷��� �־ �ǰ� ��� �� �� ()?�� ��...
 * \\w+
 */
public class Exam_03 {
	public static void main(String[] args) {
		String email = "abc@aaa.com";
		String pat = "\\w+@\\W+.\\w+";
		String pat2 = "\\w+@\\W+.\\w+(\\.\\w+)?";
		
		boolean bool = Pattern.matches(pat, email);
		if(bool) {
			System.out.println(email +"�����ӵ�");
		}else {
			System.out.println(email +"������ �ƴԵ�");
			
		}
		
	}

}
