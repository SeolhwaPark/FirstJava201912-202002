package jslhrd4;

/*
 * �͸���ø
 * - ���� Ŭ������ Ư�� �޼ҵ带 �������̵��Ͽ� ����ϴ� ���
 * �������̽�ó�� ��.
 */

class Inner4{
	void aaa() {
		System.out.println("aaaaaa");
	}
	void bbb() {
		System.out.println("bbbbbb");
	}
}
public class Exam_04 {
	public static void main(String[] args) {
		Inner4 in4 = new Inner4();
		in4.aaa();
		in4.bbb();
		
		System.out.println("--------�͸���ø-------");
		
		Inner4 in = new Inner4() {
			void aaa() { //�������̵�
				System.out.println("DDDDDD");
			} //�� �ȿ��� �ϳ� �̻��� ���ο� �޼ҵ带 ������ �� ����
		};  //�͸���ø��ü����
		in.aaa();
		in.bbb();
	}

}
