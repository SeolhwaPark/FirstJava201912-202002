package javaInterface;

public class ActionExamTest {

	public static void main(String[] args) {
		Action1 act = new Action1() {
			public void work() { //�͸�ü ����
				System.out.println("���縦 �����մϴ�!!!");
			}
			
		};
		act.work();
	}

}
