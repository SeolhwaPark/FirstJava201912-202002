package exam;
import java.util.Scanner;

import view.UI;
/*
 * dno �⺻Ű
 */
public class ExamMain {
	public static void main(String[] args) {
		UI ui = new UI();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1:���(List)");
			System.out.println("2:���(Insert)");
			System.out.println("3:�˻�(Search)");
			System.out.println("4:����(Update)");
			System.out.println("5:����(Delete)");
			System.out.println("6:����(Exit)");
			System.out.print("�޴�����:");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				//��ü��� ȭ�� �޼ҵ� ȣ��
				ui.deptView();
				break;
			case 2:
				//��������
				ui.deptInsert(sc);
				break;
			case 3:
				//�μ���ȣ�� �Է½� �ش� �μ������� �˻�
				ui.deptSearch(sc);
				break;
			case 4:
				//�μ���ȣ, �μ���, ������ ����
				ui.deptUpdate(sc);
				break;
			case 5:
				//�μ���ȣ�� �̿��� ����
				ui.deptDelete(sc);
				break;
			case 6:
				//������
			
				break;
			}
			
			
		}
		
		
	}//main
	
	

}
