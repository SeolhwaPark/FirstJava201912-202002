/*���� 1�ڸ� �Է�
 *  '1' -> + ,'2' -> - ,'3' -> * ,'4' -> / 
 *  ��Ÿ�Է��� 'error' ó��
 */
public class Exam_03{
	public static void main(String[] args) {
		char ch = '3';
		switch (ch) {
		case '1':
			System.out.println("+");
			break;
		case '2':
			System.out.println("-");
			break;
		case '3':
			System.out.println("*");
			break;
		case '4':
			System.out.println("/");
			break;

		default:
			System.out.println("error");
			break;
		}

	}

}
