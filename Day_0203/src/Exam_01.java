import java.util.ArrayList;

/*
 * Collection Framework
 * �ڹ��� �ڷᱸ��
 * Collection �������̽��� ��ӹ��� �������̽��� List, set, Map(k�� v�� �ݵ�� ������� Map�������̽�)
 * List�� ������ �ְ� �ߺ��� ����.. �Ȱ����� 1��°�� �� �� ����.. (Arraylist,Vector, LinkedList)
 * Set�� ������ ���� �ߺ��� �Ұ��� .. ���� ������ ������� ���� ����.. ()
 * Map�� Ű(������ȣ������)�� ���� ������ �����.. ������ ������ Ű�� �ߺ��� �Ұ�
 * 
 * ������ =������
 * 
 * ������� =������
 */
public class Exam_01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		ArrayList list2 = new ArrayList(10);
		
		System.out.println("list Empty :" +list.isEmpty());
		System.out.println("list size :" +list.size());
		
		list.add("123"); // ���� ���尡��.
		list.add(123);
		list.add(3.14);
		list.add('A');
		
		System.out.println("list Empty :" +list.isEmpty());
		System.out.println("list size :" +list.size());
		String s= (String)list.get(0); //��ȯ�ؼ� �����;��ؼ� ������
		int a = (int)list.get(1);
		System.out.println("list size :" +list.get(0));
		System.out.println("list size :" +list.get(1));
		
	}

}
