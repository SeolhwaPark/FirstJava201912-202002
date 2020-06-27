import java.util.HashSet;
import java.util.Set;

/*
 * 사용자 정의 클래스
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
	//사용자정의클래스는 오버라이딩으로 중복을 막을 수 있음
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
		//중복데이터가 안들어가게 하려믄??
		set.add(new Person(1,"AAA"));
		set.add(new Person(2,"BBB"));
		set.add(new Person(1,"AAA"));
		
		System.out.println(set);
		
		
	}

}
