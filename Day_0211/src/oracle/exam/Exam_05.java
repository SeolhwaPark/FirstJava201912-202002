package oracle.exam;

import java.util.Scanner;

/*
 * ���� ������\
 * '%��' ���۵Ǵ°� ã��
 * '��%' �����°� ã��
 * ������ '��' -> like '%��%' ���� ����ִ� ��Ѱ͵� �����Ѵٴ� ��
 * '��__'3��
 * like ���ԵǾ� �ִ���
 * 
 */
public class Exam_05 {
	public static void main(String[] args) {
		
		OracleSQL oracle = new OracleSQL();
		try {
			oracle.makeConn();
			oracle.deptName("M");
			oracle.takeDown();
		} catch (Exception e) {
			
		}
		
	}

}