/*
 * String(byte[] bytes)
 * 
 * String(byte[] bytes, int offset ���°������, int length ���� ��)
 */
public class Exam_02 {
	public static void main(String[] args) {
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97}; //1byte 127~-128
		String s = new String(bytes); // string���� ��ȯ
		System.out.println(s);
		
		String ss = new String(bytes, 6,4);
		System.out.println(ss);
		
	}
}
