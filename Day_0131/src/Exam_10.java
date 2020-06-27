import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
 * 현재 날짜
 * Date now = new Date();
 * 
 * 1.8이전엔 없던 클래스
 */
public class Exam_10 {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now(); //객체생성불필요 직접호출
		LocalTime time = LocalTime.now();
		LocalDateTime today = LocalDateTime.now();
		
		System.out.println("날짜:"+ now);
		System.out.println("시간:"+ time);
		System.out.println("날짜 시간:"+ today);
		
	}
}
