import java.util.Calendar;

/*
 * Calendar ****�߿�
 * �������̽�
 * 
 * YEAR ��, MONTH ��, DATE ��
 * HOUR ��, MINUTE �� , SECOND ��, AM_PM 
 * DAY_OF_WEEK �ְ�.. (�� ~ ��)

�ʵ�=���
 */
public class Exam_02 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();//��ü����
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;//1���� 0������ �����̶� 1�� ���ؾ���
		int day = cal.get(Calendar.DATE);
		System.out.println(year+"-" + month + "-" + day);
		//������ 1~7������. �Ͽ� 1 ���� 2 ȭ��3 ����4 ���5 �ݿ�6 ���7
		
		
		
	}
}
