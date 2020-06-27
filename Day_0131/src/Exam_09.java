import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 문자열을 날짜형으로 변환
 * SimpleDateFormat -> parse(str);
 * 2.날짜형을 문자열로 변환도 가능
 *  
 * 
 */
public class Exam_09 {
	public static void main(String[] args) {
		String today = "20200131";
		DateFormat sdf1 = 
				new SimpleDateFormat("yyyymmdd");
		DateFormat sdf2 = 
				new SimpleDateFormat("yyyy-mm-dd");
		try {
			Date now = sdf1.parse(today);
			String now1 = sdf2.format(now); 
			System.out.println(now1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
