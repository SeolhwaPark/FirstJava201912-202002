/*
 * String(byte[] bytes)
 * 
 * String(byte[] bytes, int offset 몇번째꺼부터, int length 글자 수)
 */
public class Exam_02 {
	public static void main(String[] args) {
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97}; //1byte 127~-128
		String s = new String(bytes); // string으로 변환
		System.out.println(s);
		
		String ss = new String(bytes, 6,4);
		System.out.println(ss);
		
	}
}
