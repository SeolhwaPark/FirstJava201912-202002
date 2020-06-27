package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * Comparable �������̽�����.. ����Ʈ�� ��������!
 * 
 * Comparator �������̽�.. ��������..
 * 
 */
class Person implements Comparable<Person>{
	//�ڵ������� �ȵǼ� ��Ÿ�ӿ����� ����
	//implements Comparable<T>
	
	String name;
	int age;
	
	Person(){}
	Person(String n, int a){
		name = n;
		age = a;
	}
	//�ڵ������� �ȵǼ� ��Ÿ�ӿ����� ����
	//implements Comparable<T>�� �������̵��ؼ� �����ϱ�
	@Override
	public int compareTo(Person o) {
		if(age < o.age) {
			return -1; //���ϴ� ���� ũ��
			
		}else if(age == o.age){
			return 0;
			
		}else {
			return 1; //���ϴ� ���� ������
			
		}
	}
}
public class Exam_04 {
	public static void main(String[] args) {
		TreeSet<Person> set = new TreeSet<Person>();
		set.add(new Person("ȫ����",28));
		set.add(new Person("���ڹ�",30));
		set.add(new Person("ȫ�뵿",25));
		set.add(new Person("�����",31));
		
		//System.out.println(set);
		
		//�ϳ��� ��������
		Iterator<Person> iter = set.iterator();
		while(iter.hasNext()) {//�����ϸ�
			Person p = iter.next();
			System.out.println(p.name + ":" + p.age); //��Ʈ�Ǽ� ���
		}
	}
}
