
class Mouse3 { // �����ڰ� ������ ����Ʈ�����ڰ� �;���

	int btnNo; // = 2 ;//��ư
	boolean cable; // = true; //���� ��false ��true
	String color; // = "����"; //����

	Mouse3() {
	}

	Mouse3(int btnNo, boolean cable, String color) {
		this.btnNo = btnNo;
		this.cable = cable;
		this.color = color;
	}

	void mousePrint() {
		System.out.print("��ư�� :" + btnNo + "\t");
		System.out.print("���� ���� :" + cable + "\t");
		System.out.print("���� :" + color + "\n");

	}

	// ���࿡ ��ư�� Ŭ������ ���� �޼ҵ带 ����
	// ��ư 2���� �� (1 - ����, 2 - ������)
	// ��ư 3���� ��� (1 - ����, 2 - ������,3 - ��)
	void buttonClick(int btnNo) {
		if(this.btnNo < 1) {
			System.out.println("����");
			return;
		}
		
		if(btnNo == 1) {
			System.out.println("���ʹ�ư");
			return;
		}
		if(this.btnNo < 2 && btnNo == 2) {
			System.out.println("�����ʹ�ư ����");
			return;
		}
		if(this.btnNo > 1 && btnNo == 3) {
			System.out.println("�����ʹ�ư");
			return;
		}
		if(this.btnNo <3  && btnNo == 3) {
			System.out.println("��");
			return;
		}
		if(this.btnNo >2  && btnNo == 3) {
			System.out.println("��");
			return;
		}
		if(this.btnNo >3) {
			System.out.println("����");
			return;
		
		}	
	}
}

public class Exam_02_sam {
	public static void main(String[] args) {
		Mouse3 m1 = new Mouse3(1, true, "����");
		m1.mousePrint();

		m1.buttonClick(5);

		
		
		
	}

}