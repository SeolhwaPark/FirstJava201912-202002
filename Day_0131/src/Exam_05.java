import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
/*
 *�޷¸����
 *����Է�:2020,2
			[2020��2��]
��	��	ȭ	��	��	��	��
						1	
2	3	4	5	6	7	8	
9	10	11	12	13	14	15	
16	17	18	19	20	21	22	
23	24	25	26	27	28	29	
 */
public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("����Է�:");
		String[] day = scn.nextLine().split(",");
		int year = Integer.parseInt(day[0]);
		int month = Integer.parseInt(day[1]);
		System.out.println("\t\t\t["+ year + "��" +month+ "��]");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		//��,���� �̿��� calendar ��ü����
		GregorianCalendar calendar =
				new GregorianCalendar(year,(month-1),1);
		
		//�ش� ���� �������� ���ϱ�
		int maxday = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
		//System.out.println(maxday);
		//���ϱ��ϱ�(1�Ͽ� 2���� 3ȭ�� 4���� 5��� 6�ݿ� 7���)
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		//���ۿ��������� ���� ���
		for(int x=0; x<(week-1);x++) {
			System.out.print("\t");
		}
		//�������
		for(int x =1; x<=maxday; x++) {
			if(week <= 7) {
				System.out.print(x + "\t");
			}else {
				System.out.print("\n");
				//week�� 7���� Ŀ���� �ٽ� �Ͽ�� 
				System.out.print(x+"\t");
				week = 1; 
			}			
			week++;
		}
		System.out.println();
	}
	
}
