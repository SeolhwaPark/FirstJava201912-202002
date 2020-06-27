//속성만 있음
class AA{
	int x; //멤버 또는 인스턴스
	int y;
	
}

//기능만 있음
class BB{
	int sum() {
		int x = 100; //지역변수, 메소드의 작업이 끝나면 소멸됨
		return x;
	}
	void test (int n) { //n 매개변수,인자
		System.out.println("n =" + n);
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		int a; //그냥 변수
		
		AA aa = new AA();//객체가 생성될 때 메모리에 저장됨
		BB bb = new BB();
		aa = new AA() ; //사용하지 않는 객체를 스스로 지우는게 가비지 콜랙션 
		aa.x=10;
		int s = bb.sum();//호출될 때 변수의 공간이 만들어짐
		
		
	}

}
