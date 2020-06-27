package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * Comparable 인터페이스구현.. 디폴트가 오름차순!
 * 
 * Comparator 인터페이스.. 내림차순..
 * 
 */
class Person implements Comparable<Person>{
	//자동정렬이 안되서 런타임오류가 나옴
	//implements Comparable<T>
	
	String name;
	int age;
	
	Person(){}
	Person(String n, int a){
		name = n;
		age = a;
	}
	//자동정렬이 안되서 런타임오류가 나옴
	//implements Comparable<T>을 오버라이딩해서 정렬하기
	@Override
	public int compareTo(Person o) {
		if(age < o.age) {
			return -1; //비교하는 값이 크면
			
		}else if(age == o.age){
			return 0;
			
		}else {
			return 1; //비교하는 값이 작으면
			
		}
	}
}
public class Exam_04 {
	public static void main(String[] args) {
		TreeSet<Person> set = new TreeSet<Person>();
		set.add(new Person("홍갈동",28));
		set.add(new Person("김자반",30));
		set.add(new Person("홍깅동",25));
		set.add(new Person("김장바",31));
		
		//System.out.println(set);
		
		//하나씩 꺼내오기
		Iterator<Person> iter = set.iterator();
		while(iter.hasNext()) {//존재하면
			Person p = iter.next();
			System.out.println(p.name + ":" + p.age); //소트되서 출력
		}
	}
}
