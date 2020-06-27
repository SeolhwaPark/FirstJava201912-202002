import java.util.regex.Pattern;

/*
 * 전화번호 유효성 검사
 * 010-1111-1111
 * () 그룹화
 * (010|011)-\d{3,4}- \d{4}
 * 010 또는 011 둘중 하나 3자에서 4자
 * 
 * 
 */
public class Exam_02 {
	public static void main(String[] args) {
		String tell = "010-1234-1234";
		String patt = "(01\\d?)-\\d{1,4}-\\d{4}"; //패턴이 길때..
		
		boolean bool = Pattern.matches(patt, tell);
		if(bool) {
			System.out.println(tell + "= okkkkay");
		}else {
			System.out.println(tell + "= no");
			
		}
	}

}
