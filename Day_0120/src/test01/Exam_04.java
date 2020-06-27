package test01;

class Tv{
	String model;
	int inch;
	
	Tv(String model, int inch){
		this.model = model;
		this.inch = inch;
	}
	
	void printTv() {
		System.out.println("Tv 모델 :" + model);
		System.out.println("Tv 크기 :" + inch);

	}
}

final class DigitalTv extends Tv{ //클래스에 final을 붙이면 더이상 상속을 허락하지 않음
	DigitalTv(int a){
		super("삼성", 16); //디폴트생성자를 호출할 수 없을 때 강제로 명시적 호출을....
	}
	
}
//class SmartTv extens DigitalTv{
	
//}


public class Exam_04 {
	public static void main(String[] args) {
		DigitalTv tv = new DigitalTv(16);
		
		
		
	}

}
