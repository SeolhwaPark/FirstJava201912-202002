import java.util.Scanner;

/*
 * if (���ǽ�){ //��
 *  ����1;
 * }else{ //����
 *  ����2;
 * }
 *  ����3;
 *  
 *  ���� : Ű����(Scanner)�� ������ �Է� �޾Ƽ� 85�̻��̸� "�հ�"
 *		    �ƴϸ� "���а�"
 */
public class Exam_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����Է�:");
		int var = scanner.nextInt();//�����Է¿� �ʿ��ϱ�
		
		String str="";//�����¿� �ʿ��ϱ�
		if(var>=85) {
			str="�հ�";
		}else {
			str="���հ�";
		}
		System.out.println("��� :" +str);
		
		}

	}

