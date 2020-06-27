
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * ���� ǥ���� - Ư���� ���ڿ��� �˻��ϴ� ��(������ ��ȿ�� �˻�)
 * PatternŬ���� 
 * 
 * \\d ���ڰ˻� �� ��(������ �����̳�...) , \\w �����ڿ� ���� �Ѵ� ok�� ��(�̸��̳� �迭�� �˻�) 
 * \\d? ���ڷ� �ѱ���, \\d* ���ڸ� �ѱ��� �̻�
 * \\w? , \\w* ����
 * \\d{3} ���� 0���� �����ڱ����� , \\d{1,3} ���� 1���� �̻� 
 * 
 */
public class Exam_01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� :");
		String[] var = scn.nextLine().split(",");
		
		for(int x= 0; x<var.length; x++) { //string�迭�� ���̸�ŭ..
			boolean bool = Pattern.matches("\\d*", var[x]);
			//�ѱ��� �̻��� ���ڰ� ���ԵǾ� ������ true, ������ ��������� false
			if(bool) {
				System.out.println(var[x] + "= ����");
			}else {
				System.out.println(var[x] + "= ����");
				
			}
		}
		
	}

}