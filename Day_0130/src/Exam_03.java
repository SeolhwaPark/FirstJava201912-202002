import java.util.regex.Pattern;

/*
 * 이메일유효성검사ㅏ
 * abc@abc.com => abc@abc.co.kr
 * \w 1글자 이상 +@ \W 1글자이상 +.\w+(\.\w+)?
 * 그룹이 있어도 되고 없어도 될 때 ()?를 씀...
 * \\w+
 */
public class Exam_03 {
	public static void main(String[] args) {
		String email = "abc@aaa.com";
		String pat = "\\w+@\\W+.\\w+";
		String pat2 = "\\w+@\\W+.\\w+(\\.\\w+)?";
		
		boolean bool = Pattern.matches(pat, email);
		if(bool) {
			System.out.println(email +"정상임돠");
		}else {
			System.out.println(email +"정상이 아님돠");
			
		}
		
	}

}
