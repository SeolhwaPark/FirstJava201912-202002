/*
 * ���
 * switch ~ case ����
 * 90�̻� , 80�̻� , 70�̻� , 60�̻� , 60�̸�
 * = 100~90, 89~80, 79~70, 69~60, 59~0
 * switch (key) {
		case value:
			
			break;

		default:
			break;
		}
 */

public class Exam_02 {
	public static void main(String[] args) {
		int var = 30;
		String str = ""; // String str = null ; 0�� ���� �ذ�(�ϰ͵ξ���)
		switch (var/10) { // 90�̻� 100���� 
		//switch (����(����� ������ ���ü� �ִ� ��)
		//�Ǵ� ����(����int,����char,���ڿ�string)�� ����,���� ���� �ȴ�
		case 10:	//value: ==��(����,����,���ڿ�) case ������ ���� ��!!
		case 9:
			//str = "A";
			System.out.println("A");
			break; //���̻� �۾��� �ʿ���ٴ� �ǹ�
		case 8: //������ �� �� ����
			//str = "B";
			System.out.println("B");
			break;
		case 7:
			//str = "C";
			System.out.println("C");
			break;
		case 6:
			//str = "D";
			System.out.println("D");
			break;
		//case 60:
			//str = "E";
			//System.out.println("E");
			//break;
		default: // Else�� ���� ������
			//str = "F";
			System.out.println("F");
			break;
			
		}
		System.out.print(str);
		
	}

}
