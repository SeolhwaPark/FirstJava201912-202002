
class Mouse2 { // �����ڰ� ������ ����Ʈ�����ڰ� �;���

	int btnNo; // = 2 ;//��ư
	boolean cable; // = true; //���� ��false ��true
	String color; // = "����"; //����

	Mouse2() {
	}

	Mouse2(int btnNo, boolean cable, String color) {
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
	void buttonClick(int btn) {
		if (btnNo == 2) {// ��ư�� 2���� ��
			if (btn == 1) {
				System.out.println("������ Ŭ���Ǿ����ϴ�.");// 1�� ����
			} else if (btn == 2) {
				System.out.println("�������� Ŭ���Ǿ����ϴ�.");// 2�� ������
			} else {
				System.out.println("�����Դϴ�.");
			}
		}
		if (btnNo == 3) {
			if (btn == 1) {
				System.out.println("������ Ŭ���Ǿ����ϴ�.");// 1�� ����

			} else if (btn == 2) {
				System.out.println("�������� Ŭ���Ǿ����ϴ�.");// 2�� ������

			} else if (btn == 3) {
				System.out.println("���� ���Ǿ����ϴ�..");

			} else {
				System.out.println("�����Դϴ�.");

			}
		}else {
			System.out.println("���ֱ������콺�Դϴ�.");

		}	
	
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		Mouse2 m1 = new Mouse2(1, true, "����");
		m1.mousePrint();

		m1.buttonClick(5);

		
		
		
	}

}