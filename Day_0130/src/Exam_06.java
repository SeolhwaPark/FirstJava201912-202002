

/*������ �迭 ����!!
 * �迭�� ���� �ʿ��� ��ŭ�� ������ �� ��������
 * System.arraycopy(�����迭,������ġ,���迭,�׸��);
 * 
 �����迭 ���
arr1 : ��	��	��	��	
arr2 : a	b	c	d	e	f	
arr2 : a	b	��	��	��	��	
 */
public class Exam_06 {
	public static void main(String[] args) {
		char arr1[] = {'��','��','��','��'};
		char arr2[] = {'a','b','c','d','e','f'};
		System.out.println("�����迭 ���");
		System.out.print("arr1 : ");
		for(char ch : arr1) {
			System.out.print(ch + "\t");
		}
		System.out.println();
		System.out.print("arr2 : ");
		for(char ch : arr2) {
			System.out.print(ch + "\t");
		}
		
		//�迭����
		System.arraycopy(arr1, 0, arr2, 2, 4);
		System.out.println();
		System.out.print("arr2 : ");
		for(char ch : arr2) {
			System.out.print(ch + "\t");
		}
	}

}
