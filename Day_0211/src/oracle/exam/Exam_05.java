package oracle.exam;

import java.util.Scanner;

/*
 * 포함 연산자\
 * '%김' 시작되는거 찾기
 * '김%' 끝나는거 찾기
 * 성씨가 '김' -> like '%김%' 김이 들어있는 어떠한것도 포함한다는 것
 * '김__'3자
 * like 포함되어 있는지
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