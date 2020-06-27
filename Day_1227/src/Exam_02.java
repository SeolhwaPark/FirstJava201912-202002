/*
a = 6
b = 5
aa = 6
bb = 6
c = 6
d = 10
cc = 5
dd = 12
 */
public class Exam_02 {
	public static void main(String[] args) {
		int a = 5, b = 0;
		int aa = 5, bb = 0;
		int c = 5, d = 0;
		int cc = 5, dd = 0;
		
		b = a++; // 대입후 연산
		bb = ++aa; // 연산 후 대입
		d = c++ + 5; 
		dd = ++c + 5;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		System.out.println("aa = " + aa);
		System.out.println("bb = " + bb);

		System.out.println("c = " + c);
		System.out.println("d = " + d);

		System.out.println("cc = " + cc);
		System.out.println("dd = " + dd);
	}
}
