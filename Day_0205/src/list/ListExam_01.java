package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * index()�޼ҵ�� ����Ʈ �ڷ�Ÿ�Կ��� ����� �� �ִ� �޼ҵ��̴�.
 * ����Ʈ�� �ִ� ��ü ����Ʈ�� ������ �� �˻��ϱ� ���ϴ� �����Ͱ� ������ ���� ���
 * ù��° �����͸��� �����ش�. 
 * ����Ʈ�� �ִ� �������� �����Ϳ� ���� �ε����� ��� �˻��ϱ� ���� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ��;
 * list = [89,84,90,77,95,90,65,100,90,84]
 * input = 90
 * 90�� �ε����� 2,5,8�Դϴ�.
 */
public class ListExam_01 {
	static List<Integer> list = new ArrayList<Integer>();
	static int index(int idx,int val) {
		for(int x=idx ; x<list.size(); x++) {
			if(list.get(x) == val) return x;
		}
		return -1;
	}

	public static void main(String[] args) {
		list.add(89);
		list.add(84);
		list.add(90);
		list.add(77);
		list.add(95);
		list.add(78);
		list.add(65);
		list.add(100);
		list.add(54);
		list.add(90);
		
		Scanner scn = new Scanner(System.in);
		System.out.println("input :");
		int val = scn.nextInt();
		int index = 0;
		System.out.println(val + "�� �ε�����");
		while (index < list.size()) {
			index = index(index, val);
			if (index == -1)
				break;
			System.out.print(index + ",");
			index++;
		}
		System.out.println("�Դϴ�.");

	}
}
