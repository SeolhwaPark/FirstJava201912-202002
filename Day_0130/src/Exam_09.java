import java.util.Arrays;

/*
 * �������迭�� ����
 * 
 * �⺻�ڷ����� �迭�� �����̰���
 * ����� ���� Ŭ������ �������̵尡 �ȵǾ� �־ ������ ������� ����
 */
public class Exam_09 {
	public static void main(String[] args) {
		int arr[] = {90,87,95,80,85,60};
		int var[][] = {{1,90,80,70,},{4,88,78,68},{2,70,90,80}};
		
		for(int x=0; x<arr.length; x++) {
			System.out.print(arr[x] +"\t");
		}
		System.out.println();
		
		Arrays.parallelSort(arr);
		
		for(int x=0; x<arr.length; x++) {
			System.out.print(arr[x] +"\t");
		}
		System.out.println();
		
		
		String name[] = {"ȫ�浿,���ڹ�,�̼���"};		
		Arrays.parallelSort(name);
		for(int x=0; x<name.length; x++) {
			System.out.print(name[x] +"\t");
		}
		System.out.println();
	}
}