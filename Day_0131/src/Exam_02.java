import java.util.Calendar;

/*
 * Calendar ****중요
 * 인터페이스
 * 
 * YEAR 년, MONTH 월, DATE 일
 * HOUR 시, MINUTE 분 , SECOND 초, AM_PM 
 * DAY_OF_WEEK 주간.. (일 ~ 토)

필드=상수
 */
public class Exam_02 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();//객체생성
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;//1월이 0월부터 시작이라 1을 더해야함
		int day = cal.get(Calendar.DATE);
		System.out.println(year+"-" + month + "-" + day);
		//요일은 1~7까지임. 일욜 1 월욜 2 화욜3 수욜4 목욜5 금욜6 토욜7
		
		
		
	}
}
