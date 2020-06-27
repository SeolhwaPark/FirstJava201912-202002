package lambda;

/*
 * 함수적 인터페이스
 * @FunctionalInterface 메소드가 딱 하나만 존재
 */

@FunctionalInterface //에너테이션은 자동으로 인식하기 위함
interface AAA{ //추상메소드는 몸채가 없음
	void method();
}
/*
class BB implements AAA{
	@Override
	public void method() {
		System.out.println("AAAAAA");
	}
}
*/
public class Exam_02 {
	public static void main(String[] args) {
//		BB bb = new BB();
//		bb.method();
		
		AAA aa;
		aa =()->{System.out.println("AAAAAA");}; //람다식
		aa.method();
		aa =()->{System.out.println("BBBBBB");};
		aa.method();
	}

}
