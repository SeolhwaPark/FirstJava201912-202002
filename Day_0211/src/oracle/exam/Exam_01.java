package oracle.exam;

public class Exam_01 {
	public static void main(String[] args) {
		OracleSQL oracle = new OracleSQL();
		try {
			oracle.makeConn(); // Ŀ�ؼǿ���
			oracle.deptListPrint();//ȣ��
			oracle.takeDown();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
