import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 날짜관련 클래스
 * Date클래스(잘 안씀), Calendar인터페이스
 * GregorianCalendar
 * 
 * 형식화 simpleDataFormat
 */
public class Exam_01 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		System.out.println("년도:"+now.getYear());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년Nmm월dd일 hh시mm분ss초");
		String nowStr = sdf.format(now);
		System.out.println(nowStr);
	}
}
