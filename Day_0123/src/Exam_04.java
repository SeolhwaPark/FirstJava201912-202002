
public class Exam_04 {
	public static void main(String[] args) {
		/*
		 * 스트링 클래스에서 진수 변환하는 메소드
		 * toBinaryString();
		 * Integer.toOctalString();
		 * Integer.toHexString();
		 * 
		 * parseInt(String s, int radix)
		 */
		int a = 25;
		String bin = Integer.toBinaryString(a);
		String oct = Integer.toOctalString(a);
		String hex = Integer.toHexString(a);
		
		System.out.println("10진수 25-> 2진수:" + bin);
		System.out.println("10진수 25-> 8진수:" + oct);
		System.out.println("10진수 25-> 16진수:" + hex);
		
		//parseInt(String s, int radix)
		//parseInt("바꾸고 싶은 수 ", 진수의 수)
		System.out.println("1010 -> 10진수:" + Integer.parseInt("1010",2));
		
		int a1 = Integer.parseInt(bin, 2);
		int a2 = Integer.parseInt(oct, 8);
		int a3 = Integer.parseInt(hex, 16);
		
		System.out.println("2진수의 "+bin + "-> 10진수 :" + a1);
		System.out.println("8진수의 "+oct + "-> 10진수 :" + a2);
		System.out.println("16진수의 "+hex + "-> 10진수 :" + a3);
		
		/*
		MAX :2147483647
		MIN :-2147483648
		size :32
		*/
		
		//System.out.println("MAX :" + Integer.MAX_VALUE);
		//System.out.println("MIN :" + Integer.MIN_VALUE);
		//System.out.println("size :" + Integer.SIZE);
	}

}
