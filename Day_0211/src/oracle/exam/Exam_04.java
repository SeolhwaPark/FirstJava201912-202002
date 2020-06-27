package oracle.exam;

import java.util.Scanner;

/*
 * 키보드로 날짜입력(1901-01-02)
 * 사원정보테이블에서 입력된 날짜이후 입사한 사원정보출력
 */
public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입사일:");
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
