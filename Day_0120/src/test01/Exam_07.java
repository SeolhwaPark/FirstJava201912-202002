package test01;


class A{
	
	
}
class B extends A{
	
	
}


public class Exam_07 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		
		// B b1 = new A(); 오류남
		// B b1 = (B)a1; 오류남
		
		B b3 = new B();
		A a3 = b3;
		B b4 = (B)a3; //형변환 강제캐스팅...
		

	}

}
