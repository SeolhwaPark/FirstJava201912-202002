import java.text.DecimalFormat;

/* 중요!!
 * 
 * 숫자형식화

 * DecimalFormat
 * 123,000 --> 345,123.99
 */

public class Exam_06 {
	public static void main(String[] args) {
		int money = 758600;
		double mon = 458254.7777;
		//￦ (ㄹ 누르고 -> 한자키 누르면 나옴. 유니코드)
		DecimalFormat df1 = new DecimalFormat("￦ #,###,###,###");//#는 데이터가 없으면 공백이됨.자동생략
		DecimalFormat df2 = new DecimalFormat("#,###.##");
		String str1 = df1.format(money);
		String str2 = df1.format(mon);
		
		System.out.println(money + ":" + str1);
		System.out.println(mon + ":" + str2);
		
		
	}

}
