package treeSet;

import java.util.TreeSet;
/*
 * TreeSet 
 * set.lower �Ʒ�
 * set.higher ��
 * set.first ���� ���� ��
 * set.headSet ~���� ������ 
 * set.tailSet ~���� ū��
 * set.floor ���ų� �ٷ� �Ʒ�
 * set.ceiling ���ų� �ٷ���
 * set.pollFirst ���� ���ڼ����� �ҷ����鼭 ����
 * set.pollLast ū ���ڼ����� �ҷ����鼭 ����
 */
public class Exam_02 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {80,95,70,44,56,10,100,59};
		
		for(int x=0; x<score.length; x++) {
			set.add(score[x]);
		}
		
		System.out.println("50���� ���� �� :" + set.headSet(50));
		System.out.println("50���� ū �� :" + set.tailSet(50));
		System.out.println("���� ���� �� :" + set.first());
		System.out.println("���� ū �� :" + set.last());
		System.out.println("90�� �Ʒ� :" +set.lower(90));
		System.out.println("90�� �� :"+set.higher(90));
		System.out.println("90���̰ų� �ٷ� �Ʒ� :"+set.floor(90));
		System.out.println("90���̰ų� �ٷ� �� :"+set.ceiling(90));
		
		//�÷��ǿ��� �ҷ����鼭 ������ ��
		while(!set.isEmpty()) { //�����Ͱ� ������� ������
			int sc = (int)set.pollFirst();//�⺻Ÿ���� ��ü�� int�� ����ȯ
			System.out.println(sc);
			System.out.println("���� ��ü�� :" + set.size());
		}
		/*
10
���� ��ü�� :7
44
���� ��ü�� :6
56
���� ��ü�� :5
59
���� ��ü�� :4
70
���� ��ü�� :3
80
���� ��ü�� :2
95
���� ��ü�� :1
100
���� ��ü�� :0

		 */
		
	}
}
