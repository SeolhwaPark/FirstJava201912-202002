class Point{
	int x = 10; //������� �ʱ�ȭ
	int y = 20;

	//������ �����ε�...  �޼ҵ��̸��� ������ ���� �Ű������� ������ ������ �ٸ�********
	Point(){ //�����ڴ� ���� �ʿ���� ����� ����Ÿ���� �ʿ����.
		System.out.println("AAAA\t");

	}// �Ű������� ������ ����Ʈ������ , Ŭ�����̸��� �Ȱ��� �޼ҵ�, ������ �����ϴµ� �Ⱥ��̴� ��
	
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
		//�����ڰ� ������ ����Ʈ �����ڸ� ����� �� �ְ� ���ÿ� �ʱ�ȭ��. ��ü�� ���� �� �մ� �޼ҵ�
		Point p2 = new Point(100);
		//�ʱ�ȭ�ϴ� ����� ���� Ʋ��, ������ �����ε�
		Point p3 = new Point(100,200);

		p1.print();
		System.out.println("p1.x =" + p1.x);
		//p1.x = 10; // �ʱ�ȭ
		System.out.println("p2.x =" + p2.x);
		
		
		
		
	}
}
