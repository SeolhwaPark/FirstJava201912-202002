import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
 * ���� ��¥
 * Date now = new Date();
 * 
 * 1.8������ ���� Ŭ����
 */
public class Exam_10 {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now(); //��ü�������ʿ� ����ȣ��
		LocalTime time = LocalTime.now();
		LocalDateTime today = LocalDateTime.now();
		
		System.out.println("��¥:"+ now);
		System.out.println("�ð�:"+ time);
		System.out.println("��¥ �ð�:"+ today);
		
	}
}
