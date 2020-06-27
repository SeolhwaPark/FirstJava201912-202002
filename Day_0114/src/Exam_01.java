/* 
 * ����� ����

 * �������� - C, �ں�, ��Ʈ��, �Ľ�Į��  ->�Լ�,���
 * ��ü����  - c++, c#, �ڹ�, ���̽�...  
 * ��ü���� ���α׷��� *********************** ��û�߿� *******************
 * 1.Ŭ���� �Ӽ� ���(�޼ҵ�) ,�߻�ȭ����(�Ӽ� : �������, ����(���): �޼ҵ�)
 * 
 * 2.�ν��Ͻ�(��ü) : Ŭ�����κ��� ������� ��ü
 * 
 * 3.�޽���(�޼ҵ�) : ��ü�� ���� ��ȣ�ۿ뿡 ���Ǵ� ����
 * 
 * ��ü���� 3��� *********
 * ĸ��ȭ: �ϳ��� Ŭ�����ȿ� ����� ���ܳ��� �޼ҵ�� �����ؾ��ϴ� �� 
 * ��Ӽ�: �θ� �־�� �ڽ��� ����, �ʿ��� ����� �����޴� ��, �������̵�***
 * ������: ������ �̸����� �������� ����� ����, �����ε� ***
 * 
 */

//���콺 �𵨸�
/*	�Ӽ�
 * 	��ư��, ��������, ����
 
 * 	���
 * 	���� ��ư Ŭ��, ���� ��ư ����Ŭ��(����Ÿ�� �ʿ�), ������ ��ư Ŭ��
 * 
 */
class Mouse{ //�����ڰ� ������ ����Ʈ�����ڰ� �;���
	//�Ӽ�����(�������)
	//��������� ���� �ִ� �� -> ������� �ʱ�ȭ
	//Private ������ ĸ��ȭ, ����

	private int btnNo; //= 2 ;//��ư
	private boolean cable; //= true; //���� ��false ��true
	private String color; //= "����"; //����
	//������� (�޼ҵ�) ����Ÿ���� �ٰų� ���ٰų�.. 
	
	//������ = �޼ҵ�. Ŭ�����̸��� ���� �޼ҵ忪��.  ������ �����ε��� ����
	//��ü�� �����ϴ� ����� �����ϰ� �ʱ�ȭ��Ŵ 
	//�����ڸ� �ϳ��̻� ����� ���� ����Ʈ�����ڰ� ������ϱ� �ݵ�� �ǹ������� �ٽ� ��������
	Mouse(){
		
	}
	Mouse(int btnNo){
		this.btnNo = btnNo;
	}
	Mouse(int btnNo, boolean wifi){
		this.btnNo = btnNo;
		this.cable = cable;
	}
	Mouse(int btnNo, boolean wifi, String color){
		this.btnNo = btnNo;
		this.cable = cable;
	}
	
	void leftClick() {
		System.out.println("���� ��ư�� Ŭ���Ǿ����ϴ�.");
	}
	void rightClick() {
		System.out.println("������ ��ư�� Ŭ���Ǿ����ϴ�.");
	}
	int doubleClick() {
		System.out.println("���� ��ư�� ����Ŭ�� �Ǿ����ϴ�.");
		return 1;
	}
	//�ڱ��ڽ��� ���
	void mPrint() {

		System.out.print("Mouses�� " + btnNo + "��ư");
		if(cable) {
			System.out.print(" ������� ");
		}else {
			System.out.print(" ������� ");

		}
		System.out.print(color + "�����Դϴ�\n");	
	}
	public void setBtnNo(int btnNo) {
		this.btnNo = btnNo;
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		//1. ��ü���� ���۷�������
		Mouse mou1; //�ν��Ͻ� ���� ����
		mou1 = new Mouse(); //��ü���� �ּҰ���Ŵ
		//�ٲٰ� ���� �� ���⼭ �ٲ�
		mou1.setBtnNo(5);			
		mou1.mPrint(); 
		System.out.println("----------------------"); // ���ֱ������콺
		/*mou1.leftClick();
		mou1.rightClick();
		mou1.doubleClick();
		*/
		System.out.println("----------------------"); // ���ֱ������콺
		Mouse m2 = new Mouse(3);
		m2.mPrint();
		System.out.println("----------------------"); // ���ֱ������콺
		Mouse m3 = new Mouse(3, true);
		m3.mPrint();
		System.out.println("----------------------"); // ���ֱ������콺
		Mouse m4 = new Mouse(3, true , "����");
		m4.mPrint();	
	}
}