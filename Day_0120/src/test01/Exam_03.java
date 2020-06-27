package test01;


//생성자의 연속호출
//생성자 자체가 상속되는 게 아니고 맴버와 메소드 뿐

class FF{

	FF(){
		System.out.println("FF() 생성자 호출");
	}
}

class GG extends FF{
	GG(){
		System.out.println("GG() 생성자 호출");
	}
}
class HH extends GG{
	HH(){
		System.out.println("HH() 생성자 호출");

	}
}
public class Exam_03 {
	public static void main(String[] args) {
		FF f = new FF();
		GG g = new GG();
		HH h = new HH();
		
	}

}
