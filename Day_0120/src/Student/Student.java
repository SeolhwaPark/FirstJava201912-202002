package Student;

public abstract class Student { //�߻�Ŭ����
	int bun;
	String name;
	int[] jum;
	int tot;
	double ave;
	
	public Student(int bun, String name, int[] jum) {
		this.bun = bun;
		this.name = name;
		this.jum = jum;
	}
	
	public void title() {
		System.out.print("��ȣ\t�̸�\t����\t���");
	}
	
	abstract void account(); //���� ��� �Ҽ��� ��°�ڸ� �� ����� ����ϴ� �޼ҵ�
	abstract void scoreMax();	//���� �ִ� �ּҸ� ���Ͽ� ���
	abstract void scoreSelection(); // ���������� �̿��Ͽ� ���� ��������
	abstract void scoreBubble(); // ���������� �̿��Ͽ� ���� ��������

}
