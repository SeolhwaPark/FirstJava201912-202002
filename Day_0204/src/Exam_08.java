import java.util.HashSet;
import java.util.Set;

/*
 * ����� ���� Ŭ����
 */

class Person{
	int bun;
	String name;
	Person(){}
	Person(int b, String n){
		bun = b;
		name = n;
		
	}
//__________________________________________________________	
	//���������Ŭ������ �������̵����� �ߺ��� ���� �� ����
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			return p.bun == bun;
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return bun;
	}
//__________________________________________________________	
	
	
	@Override
	public String toString() {
		return bun + "\t" + name;
	}
	
}
public class Exam_08 {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>(); 
		//�ߺ������Ͱ� �ȵ��� �Ϸ���??
		set.add(new Person(1,"AAA"));
		set.add(new Person(2,"BBB"));
		set.add(new Person(1,"AAA"));
		
		System.out.println(set);
		
		
	}

}
