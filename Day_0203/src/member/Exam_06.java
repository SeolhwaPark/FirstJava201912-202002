package member;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exam_06 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("���ڹ�");
		list.add("ȫ�浿");
		list.add("Java");
		list.add("1234");
		list.add("Korea");
		
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("===============");
		Collections.sort(list); //���������Ŭ������ �ȵ�. �⺻�ڷ����� ���ڿ��� ��Ʈ����
		for(String s : list) {
			System.out.println(s);
		}
	}

}
