import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam_04 {
	public static void main(String[] ar) {
		Set<String> set = new HashSet<String>();
		set.add("Java");
		set.add("C");
		set.add("C++");
		set.add("Tomcat");
		set.add("Java");
		set.add("C#");
		
		for(String str : set) {//�ϳ��� ��������
			System.out.println(str);			
		}
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {//�����Ѵٸ�
			String s = iter.next();
			if(s.equals("Java"));
			iter.remove();
		}

		for(String str : set) {//�ϳ��� ��������
			System.out.println(str);			
		}
	}

}
