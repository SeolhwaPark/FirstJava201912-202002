package oracle.exam;

import java.util.Scanner;

/*
 * Ű����� ��¥�Է�(1901-01-02)
 * ����������̺��� �Էµ� ��¥���� �Ի��� ����������
 */
public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�Ի���:");
		String hiredate = scn.next();
		
		OracleSQL oracle = new OracleSQL();
		try {
			oracle.makeConn();
			oracle.deptHiredate(hiredate);
			oracle.takeDown();
		} catch (Exception e) {
			
		}
		
	}

}
