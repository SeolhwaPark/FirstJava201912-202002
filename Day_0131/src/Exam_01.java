import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��¥���� Ŭ����
 * DateŬ����(�� �Ⱦ�), Calendar�������̽�
 * GregorianCalendar
 * 
 * ����ȭ simpleDataFormat
 */
public class Exam_01 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		System.out.println("�⵵:"+now.getYear());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��Nmm��dd�� hh��mm��ss��");
		String nowStr = sdf.format(now);
		System.out.println(nowStr);
	}
}
