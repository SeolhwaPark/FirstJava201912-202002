package lotto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
 * Ű�����Է�(���̵�, �̸�, ����) �̸��� end�� ���� �ߺ��� ���̵� �Է½� ����. "���̵� �ߺ� �ٽ� �Է��ϼ���" ���Է��� ����
 * 
 * ��°�� ���̵� �̸� ����
 * 
 */
class Member1 {
	String id;
	String name;
	int age;

	Member1() {
	}

	Member1(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member1) {
			Member1 m = (Member1) obj;
			return m.id.equals(id);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

}

public class Exam_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Member1> set = new HashSet<Member1>();
		System.out.println("���̵�,�̸�,���̸� �Է��ϼ���");

		while (true) {

			System.out.print("�Է�:");
			String[] arr = sc.nextLine().split(",");
			if (arr[0].equalsIgnoreCase("end"))
				break;

			Member1 mem = new Member1(arr[0], arr[1], Integer.parseInt(arr[2]));

			boolean bool = set.add(mem);
			if (!bool)
				System.out.println("���̵� �ߺ��ӵ�");

		}
		System.out.println("���̵�\t�̸�\t����");
		Iterator<Member1> it = set.iterator();
		while (it.hasNext()) {
			Member1 m = it.next();
			System.out.println(m.id + "\t" + m.name + "\t" + m.age);

		}
	}
}
