package lambda;

/*
 * �Լ��� �������̽�
 * @FunctionalInterface �޼ҵ尡 �� �ϳ��� ����
 */

@FunctionalInterface //�������̼��� �ڵ����� �ν��ϱ� ����
interface AAA{ //�߻�޼ҵ�� ��ä�� ����
	void method();
}
/*
class BB implements AAA{
	@Override
	public void method() {
		System.out.println("AAAAAA");
	}
}
*/
public class Exam_02 {
	public static void main(String[] args) {
//		BB bb = new BB();
//		bb.method();
		
		AAA aa;
		aa =()->{System.out.println("AAAAAA");}; //���ٽ�
		aa.method();
		aa =()->{System.out.println("BBBBBB");};
		aa.method();
	}

}
