package generics;

import java.util.ArrayList;
import java.util.List;

/*
 * ���׸� : �پ��� Ÿ���� ��ü�� �ٷ�� �޼ҵ峪 Ŭ������ ���鶧 ����ϸ�,
 * �����Ͻ��� Ÿ���� üũ���ִ� ���. ����ȯ�� ���ʿ�.
 */
public class Exam_01 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("ȫ�浿");
		list.add(100);
		String name = (String)list.get(0);
		int score = (int)list.get(1);
		
		//��
		
		List<String> list2 = new ArrayList<String>();
		list2.add("ȫ�浿");
		//list2.add(100);
		name = list2.get(0);
		//int score = (int)list.get(1);
	}

}
