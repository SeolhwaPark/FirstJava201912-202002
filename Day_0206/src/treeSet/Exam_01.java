package treeSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 *�˻������ ��ȭ�� �÷��� treeSet
 *��Ʈ�� ���ؼ� ���� ũ�� ���������� �������� ������ �������� ������. �ڵ������� ����
 *�ߺ����� �ڵ��Ҹ�(?)
 *Ʈ���� ��Ʈ �ٷξƷ��� ������(�ּ�)�� ����(��ġ)�� ��������
 *List�� �迭�� ���. �迭�� ���� ����ǰ� list�� ��ü�� �ּҰ� �����
 *
 *Set�� �ߺ��� ������� �ʰ� ������ ����
 *���Ǵ�� �����ϰ� ���Ǵ�� ������
 *
 *first�޼ҵ�
 *
 *����Ʈ��
 *������Ʈ��
 *������Ʈ�� ������ �ΰ���
 *
 */
public class Exam_01 {
	public static void main(String[] args) {
		//�׳� �� Set set = new HashSet();
		//set.add(10); //10�̶�� ������ ��ü�� �����
		//set.add(new Integer(10)); //��ü�� �ּҰ� ����
	System.out.println("___________�ζǹ�ȣ �̱�_____________");
		 
		Set set = new TreeSet();
		for(int x =0;set.size()<6; x++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set); //Ʈ�������� �ڵ����İ���
		System.out.println("_____________________________");
		Set set2 = new HashSet();
		for(int x =0;set2.size()<6; x++) {
			int num = (int)(Math.random()*45)+1;
			set2.add(num);
		}
		System.out.println(set2);
	}
}
