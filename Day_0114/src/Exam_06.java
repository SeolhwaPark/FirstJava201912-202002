/*������ 
 * 1.������ �����ε�
 * 2.������ ȣ�� : this() �ڱ��ڽ��� �޼ҵ�, this. �ڱ��ڽ�
 * 
 */

class EE{
	int x;
	int y;
	EE(){
		this(100); //�Ű������� 2���� 2�� ����մ� �� ȣ��. �� �ѹ��� ����� �� ����
		System.out.println("����Ʈ ������ ȣ��");
	}
	EE(int x){
		this(x,200); //������ �����ε��� �� ����
		System.out.println("�Ű����� 1�� ����Ʈ ������ ȣ��");
		this.x = x;
	}
	EE(int x, int y){
		System.out.println("�Ű����� 2�� ����Ʈ ������ ȣ��");
		this.x = y;
		this.y = y;
	}
}
public class Exam_06 {
	public static void main(String[] args) {
		EE e1 = new EE();
		System.out.println("x ="+ e1.x);	
		System.out.println("x ="+ e1.y);	
	}

}
