package oracle.exam;

import java.util.Scanner;

/*
 * 키보드로 부서코드를 입력받아서
 * 부서코드에 해당하는 부서출력
 */
public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("부서코드:");
		int dno = scn.nextInt();
		
		OracleSQL oracle = new OracleSQL();
		try {
			oracle.makeConn();
			oracle.deptSearch(dno);
			//oracle.deptName(dname);
			oracle.takeDown();
		} catch (Exception e) {
			
		}
		
		
	}

}
