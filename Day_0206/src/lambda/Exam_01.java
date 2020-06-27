package lambda;
/*
 * 1.8부터 사용중
 * 람다식 : 메소드를 하나의 수식처럼 표기 == 익명함수라고도 함..
 * 
 */
class AA{
	int test(int a,int b) {
		System.out.print("AAA");
		return 0;
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		AA aa = new AA();
//		aa.test();
//()->{System.out.print("AAA")}; //개체를 생성해서 출력. 메소드이름이 필요없음		
		//(int a,int b)->{return 11;}
		
		
	}

}
