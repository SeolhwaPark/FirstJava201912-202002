/*
 * 문자열의 형식화
 */
public class Exam_07 {
	public static void main(String[] args) {
		String date = "20200131"; 
		//2020-01-31
		String y = date.substring(0,4);//쪼개기
		String x = date.substring(4,6);//쪼개기
		String z = date.substring(6);//쪼개기
		String str = y+"-" + x + "-" + z;
		System.out.println(str);
		
		//2020년 01월 31일
		
		
	}
}
