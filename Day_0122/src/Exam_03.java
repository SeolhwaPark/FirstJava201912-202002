/*
 * 1문자 입력
 * System.in.read -> 1문자를 받아서정수로 리턴...
 * 
 */
public class Exam_03 {
	public static void main(String[] args) throws Exception{
		System.out.print("입력:");
		byte[] bytes = new byte[100];
		//char ch = (char)System.in.read(); //입력받은 글자 자체를 출력가능
		int cnt = System.in.read(bytes); //입력받은 글자수와 엔터값2개가 합계되서  출력됨

		System.out.println("글자수:" + cnt);
		String s = new String(bytes, 0, cnt-2);
		System.out.println("입력자료의 글자수:" + s);
		
		System.out.println("글자수:" + s.length()); // 문자열의 길이
		System.out.println("글자수:" + s.isEmpty()); //비어잇나 아닌가
		String str = "";
		if(str.isEmpty()) {
			System.out.println("문자열이 비어있음");
		}else {
			System.out.println("글자" + str);
		}
		//System.out.println("글자수:" + str.isEmpty()); //비어잇나 아닌가
	}

}
