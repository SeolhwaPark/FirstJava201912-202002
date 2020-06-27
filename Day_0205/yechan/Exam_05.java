import java.util.Scanner;
import java.util.regex.Pattern;

/* uncompress 함수는 숫자와 알파벳으로 구성된 문자열을 입력받아서
 * 숫자만큼 알파벳을 반복시켜 변환하는 함수이다.
 * 예)
 * uncompress ('2a5b1c' ) -> aabbbbbc
 * uncompress ('3x5y2z' ) -> xxxyyyyyzz
 * 이 때 숫자는 1~9 사이에 있는 숫자이다.
 * 숫자와 문자열이 반복되어 나온다. 즉 1~9사이의 숫자 뒤에 알파벳이 하나 나오는 패턴이 반복된다.
 * #main
 * S=['2a5b1c' , '3x5y2z' , '2m4n' , '9o']
 * new_string=uncompress(string)
 * print(string, ':', new_string)
 */
public class Exam_05 {
	
	static String uncompress(String str) {
		String rt="";
		int cnt=0;
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				//cnt = Integer.parseInt(Character.toString(str.charAt(i)));
				cnt=str.charAt(i)-48;
			}
			else for(int j=0;j<cnt;j++){
				rt+=str.charAt(i);
			}
		}
		
		return rt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("문자열입력 : ");
			String a =sc.nextLine();
			if(!(Pattern.matches("([1-9]{1}[a-zA-Z]{1})+", a))){
				continue;
			}
			String new_String=uncompress(a);
			System.out.println(new_String);

		
		}
	}		
}
