import java.util.Arrays;

/*
 * �˻�
 * 
 * binarySearch�����˻���. ������ �Ǿ� ���� ���� �˻�����
 */
public class Exam_11 {
	public static void main(String[] args) {
		int var[] = {80,90,77,88,56,95};
		String name[] = {"ȫ�浿","���ڹ�","�̼���"};
		
		Arrays.parallelSort(var);
		int index = Arrays.binarySearch(var, 90);
		System.out.println("90 ��ġ�� :" + index);
		System.out.println();
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("���ڹ�");
		Member m3 = new Member("�̼���");
		Member[] mem = {m1,m2,m3};
		
		Arrays.parallelSort(mem);
		int no = Arrays.binarySearch(mem, m3);
		System.out.println(m3.name +"�� " + no + "�� ����");
		int noo = Arrays.binarySearch(mem, m2);
		System.out.println(m2.name +"�� " + noo + "�� ����");
		int nooo = Arrays.binarySearch(mem, m1);
		System.out.println(m1.name +"�� " + nooo + "�� ����");
	}

}
