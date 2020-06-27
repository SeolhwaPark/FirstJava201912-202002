class Point{
	int x = 10; //명시적인 초기화
	int y = 20;

	//생성자 오버로딩...  메소드이름이 무조건 같고 매개변수의 갯수나 종류가 다름********
	Point(){ //제어자는 딱히 필요없고 절대로 리턴타입이 필요없다.
		System.out.println("AAAA\t");

	}// 매개변수가 없으면 디폴트생성자 , 클래스이름과 똑같은 메소드, 원래는 존재하는데 안보이는 애
	
	Point(int a, int b){
		x = a;
		y = b;
		System.out.println("AAAA\t");

	}
	
	Point(int a){
		x = a;
		System.out.println("AAAA\t");

	}
	
	void print() {
		
	}
}

public class Exam_06 {
	public static void main(String[] args) {
		Point p1 = new Point(); 
		//생상자가 없으면 디폴트 생성자를 사용할 수 있고 동시에 초기화됨. 객체를 만들 수 잇는 메소드
		Point p2 = new Point(100);
		//초기화하는 방법도 각각 틀림, 생성자 오버로딩
		Point p3 = new Point(100,200);

		p1.print();
		System.out.println("p1.x =" + p1.x);
		//p1.x = 10; // 초기화
		System.out.println("p2.x =" + p2.x);
		
		
		
		
	}
}
