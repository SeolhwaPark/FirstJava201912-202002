/*
 * 증감연산자
 * ++:1씩 증가
 * --:1씩 감소
 * 
 */
public class Exam_01 {
	public static void main(String[] args) {
		int a=5,b;
		int aa=5,bb;
		
		b=a++;//후위형 a=a+1 a=6 b=5 전위형은 ++a 은 a=6 b=6
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		b=++aa;//후위형 a=a+1 a=6 b=5 전위형은 ++a 은 a=6 b=6
		System.out.println("aa="+ aa);
		
	}

}
