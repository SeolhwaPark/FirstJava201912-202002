import java.util.Calendar;
public class Exam_0 {
	public static void main(String[] ar) {
		Calendar today = Calendar.getInstance();
		System.out.println("�� ���� �⵵:"+today.get(Calendar.YEAR));
		System.out.println("��(0~11,0:1��):"+today.get(Calendar.MONTH)+1);
		System.out.println("�� ���� �� ° ��:"+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("�� ���� �� ° ��"+today.get(Calendar.WEEK_OF_MONTH));
		
		//DATE �� DAY_OF_MONTH�� ����.
		System.out.println("�� ���� �� ��:"+today.get(Calendar.DATE));
		System.out.println("�� ���� �� ��:"+today.get(Calendar.DAY_OF_MONTH));
		System.out.println("�� ���� �� ��:"+today.get(Calendar.DAY_OF_YEAR));
		System.out.println("����(1~7,1:�Ͽ���):"+today.get(Calendar.DAY_OF_WEEK)+1);
		System.out.println("�� ���� �� ° ����:"+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("����_����(0:����,1:����):"+today.get(Calendar.AM_PM)+1);
		System.out.println("�ð�(0~11):"+today.get(Calendar.HOUR)+1);
		System.out.println("�ð�(0~23):"+today.get(Calendar.HOUR_OF_DAY)+1);
		System.out.println("��(0~59):"+today.get(Calendar.MINUTE)+1);
		System.out.println("��(0~59):"+today.get(Calendar.SECOND)+1);
		System.out.println("1000���� 1��(0~999):"+today.get(Calendar.MILLISECOND)+1);
		
		//õ���� 1�ʸ� �ð����� ǥ���ϱ� ���� 3600000���� ��������.(1�ð� = 60*60��)
		System.out.println("TimeZone(-12~+12):"+(today.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
		System.out.println("�� ���� ������ ��:"+today.get(Calendar.DATE));
		
	}
}
