package oracle.exam;

import java.util.Scanner;
/*
 * Ű����� �μ��ڵ带 �Է¹޾Ƽ�
 * �μ��ڵ忡 �ش��ϴ� ������� ���
 */
public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�μ��ڵ�:");
		int dno = scn.nextInt();
		
		OracleSQL oracle = new OracleSQL();
		try {
			oracle.makeConn();
			oracle.deptEmployee(dno);
			//oracle.deptSearch(dno);
			//oracle.deptName();
			oracle.takeDown();
		} catch (Exception e) {
			
		}
		
		
	}

}
