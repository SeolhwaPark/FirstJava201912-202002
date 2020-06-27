package oracle.exam;

public class Exam_01 {
	public static void main(String[] args) {
		OracleSQL oracle = new OracleSQL();
		try {
			oracle.makeConn(); // 커넥션연결
			oracle.deptListPrint();//호출
			oracle.takeDown();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
