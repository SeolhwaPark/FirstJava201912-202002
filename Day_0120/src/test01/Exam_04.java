package test01;

class Tv{
	String model;
	int inch;
	
	Tv(String model, int inch){
		this.model = model;
		this.inch = inch;
	}
	
	void printTv() {
		System.out.println("Tv �� :" + model);
		System.out.println("Tv ũ�� :" + inch);

	}
}

final class DigitalTv extends Tv{ //Ŭ������ final�� ���̸� ���̻� ����� ������� ����
	DigitalTv(int a){
		super("�Ｚ", 16); //����Ʈ�����ڸ� ȣ���� �� ���� �� ������ ����� ȣ����....
	}
	
}
//class SmartTv extens DigitalTv{
	
//}


public class Exam_04 {
	public static void main(String[] args) {
		DigitalTv tv = new DigitalTv(16);
		
		
		
	}

}
