package test02;
/*
 * �߻�Ŭ���� - �̿ϼ��� ���赵(��ü�� �������� ����) -> ��ü�� ������ �� ����
 * 
 * abstract Ű���� ���
 */

abstract class AA { //�߻�Ŭ����

	int x = 100;

	void test() {
		System.out.println("x =" + x);
	}

	abstract int sum(int x, int y);// ������� �߻�޼ҵ�.. �ַ� ����� ���.���� ��ӵ�
	// ������ ������ �������̵��� �ؾ� ��ü������ ������. �ϳ��� �߻�޼ҵ尡 �����ϸ� �� Ŭ������ �߻�޼ҵ尡 ��

}

class BB extends AA { // �������̵�.
	int sum(int x, int y) {
		return 0;
	}

}

public class Exam_10 {
	public static void main(String[] args) {
		//AA a = new AA();
		AA  a = new BB();
		a.sum(1, 500);
		
		
	}

}
