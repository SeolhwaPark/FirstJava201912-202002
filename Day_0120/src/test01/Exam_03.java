package test01;


//�������� ����ȣ��
//������ ��ü�� ��ӵǴ� �� �ƴϰ� �ɹ��� �޼ҵ� ��

class FF{

	FF(){
		System.out.println("FF() ������ ȣ��");
	}
}

class GG extends FF{
	GG(){
		System.out.println("GG() ������ ȣ��");
	}
}
class HH extends GG{
	HH(){
		System.out.println("HH() ������ ȣ��");

	}
}
public class Exam_03 {
	public static void main(String[] args) {
		FF f = new FF();
		GG g = new GG();
		HH h = new HH();
		
	}

}
