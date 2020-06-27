import java.util.Arrays;
/*����
 * implements Comparable<Member> //���Ŭ������ ����
 * 
 * @Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
		
�ڷᱸ��... �ʼ�...
implements Comparable<Object> �ֻ�Ŭ���� //�÷��� 
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
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("���ڹ�");
		Member m3 = new Member("�̼���");
		Member[] mem = {m1,m2,m3};
		//��
		System.out.print("��:");
		for(int x =0; x<mem.length; x++) {
			System.out.print(mem[x].name + "\t");
		}
		System.out.println();
		//��
		System.out.print("��:");
		Arrays.parallelSort(mem);
		for(int x =0; x<mem.length; x++) {
			System.out.print(mem[x].name + "\t");
		}
	}

}
