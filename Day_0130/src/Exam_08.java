import java.util.Arrays;

/*
 * Arrays
 * 
 * �迭 ����,�׸� ��, ����, �˻� ���� �����ϴ� Ŭ����
 */
public class Exam_08 {
	public static void main(String[] args) {
		int[] var = { 1, 2, 3, 4, 5, 6 };
		int[] str = Arrays.copyOf(var, var.length);// ����Ÿ��//�� �����ҷ��� var.length
		for (int x = 0; x < str.length; x++) {
			System.out.print(str[x] + "\t");
		}
		
		System.out.println();
		System.out.println("�迭�� �ּ� �� : "+ var.equals(str));//�迭 ù��° ����� �ּ�
		System.out.println("�迭����� �� : "+ Arrays.equals(var,str));//�׸� ��
		
	}
}
