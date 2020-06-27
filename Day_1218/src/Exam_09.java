/*
 * 증가,감소
 * 단항연산자 ++,-- 
 */
public class Exam_09 {
	public static void main(String[] args) {
		int a=5,b=0;
		a=a+1;//1씩 증가 a+1 = a++ 같음
		//a++ 후위형 ++a 전위형
		b=a++; //b=5, a=6
		b=++a; //b=6, a=6
		b=b+a;
		

	}

}
