import java.sql.Blob;

/*
 * ���迬����(>,<,>=,<=) -> ���迬���ڿ� �����ڰ� ���� ������ ���迬���ڸ� ����!
 * ������(==,!=), ���Կ�����(=)
 * �������� ����� True or False
 * 
 */
public class Exam_05 {
	public static void main(String[] args) {
		boolean b = 7>8;
		System.out.println("7>8="+(7>8));
		System.out.println("7>8="+b);
		int a=7+8;
		System.out.println("7+8="+(7+8));
		System.out.println("7+8="+a);

	}

}
