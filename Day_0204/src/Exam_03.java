import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam_03 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		
		System.out.println(set); //�����϶��� ������� ��°����ϳ� ���ڿ��� �ȵ�

		set.add(new Integer(1));
		set.add(new Integer(2));
		set.add(new Integer(3));
		set.add(new Integer(4));
		set.add(new Integer(5));
		set.add(new Integer(6));
		
//		System.out.println(set); //�����϶��� ������� ��°����ϳ� ���ڿ��� �ȵ�
		//�ݺ��ڷ� ������ �޾� ������ �������� Iterator
		Iterator iter = set.iterator();
		while(iter.hasNext()) {//�����Ѵٸ�
			System.out.println(iter.next());
		}
	}
}
