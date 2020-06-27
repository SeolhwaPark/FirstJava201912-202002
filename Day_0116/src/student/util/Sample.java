package student.util;


/* 접근제어자
 * pivate - 해당클래스만, 외부에서의 접근제어를 막음
 * defalt - 같은 패키지에서 얼마든지 쓸 수 있음
 * protected - 같거나 다른 패키지에서 쓸 경우 상속관계에서 사용가능
 * public - 
 * 
 */

public class Sample {
	int a = 10;//접근제어자가 없으면 디폴트생성자
	void test() {
			int s = a+20;
		}
}
		
/*class BB{
	Sample s = new Sample();
	void test() {
		s.a = 30;
		s.test();
	}
}
*/