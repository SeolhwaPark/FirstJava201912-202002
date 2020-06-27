package lambda;

//하나뿐인 메소드를 쉽게 구현하기 위해서....인터페이스의 일회성 함수구현 == 람다

interface BBB{
	void test(int x);
	
}
public class Exam_03 {
	public static void main(String[] args) {
		BBB b; //인터페이스 접속
		b =(x)->{ //오버라이딩같은...함수, 수식의 개념으로 씀
			int result = 100;
			System.out.println(x*result);
		};
		
		b.test(5); //함수를 호출. 5가 x에 대입됨
		
		
	}

}
