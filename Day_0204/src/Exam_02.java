import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Set�������̽� :������ �ߺ��� ������ ����.. �Ұ���
 * ������ Ŭ���� HashSet�� ����ؾ���
 */
public class Exam_02 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("Java");
		set.add("C");
		set.add("C++");
		set.add("Tomcat");
		set.add("Java");
		set.add("C#");
		
		System.out.println(set);
		//���������� ��ȯ�۾��� �ʿ���
		
		List list = new ArrayList();
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("Tomcat");
		list.add("Java");
		list.add("C#");
		System.out.println(list);
		
		Object obj = list.get(0);
		

	}
}
