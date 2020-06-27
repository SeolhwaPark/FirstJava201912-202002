import java.util.Arrays;
/*기준
 * implements Comparable<Member> //멤버클래스만 지정
 * 
 * @Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
		
자료구조... 필수...
implements Comparable<Object> 최상클래스 //컬렉션 
 */
class Member implements Comparable<Member>{
	String name;
	Member(){}
	Member(String name){
		this.name = name;
	}
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}
}

public class Exam_10 {
	public static void main(String[] args) {
		Member m1 = new Member("홍길동");
		Member m2 = new Member("김자바");
		Member m3 = new Member("이순신");
		Member[] mem = {m1,m2,m3};
		//전
		System.out.print("전:");
		for(int x =0; x<mem.length; x++) {
			System.out.print(mem[x].name + "\t");
		}
		System.out.println();
		//후
		System.out.print("후:");
		Arrays.parallelSort(mem);
		for(int x =0; x<mem.length; x++) {
			System.out.print(mem[x].name + "\t");
		}
	}

}
