package member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Ű���� �Է� 
 *	���̵� �̸� �����Է� Member��ü�� ����
 *
 *����
 *- �Է½� ���̵� end �̸� ��ü��� �� ����
 *- ArrayList�̿� 
 *- ���̵� ���� ��� ����.. �ߺ��� ���̵��Դϴ�
 *	���� ����� ���Է�
 *
 * ������ ���� ���
 * ���̵�     �̸�     ����
 * user01 ȫ���  29
 */
public class MemberExam {
	public static void main(String[] args) {
		List<Member> list = new ArrayList<Member>();
		Scanner scn = new Scanner(System.in);
		Member m = null;

		while (true) {
			System.out.print("�Է��ϼ���:");
			String[] arr = scn.nextLine().split(",");
			if (arr[0].equalsIgnoreCase("end"))
				break;
			m = new Member(arr[0], arr[1], Integer.parseInt(arr[2]));

			// if(list.contains(m))
			boolean bool = list.contains(m); // ����������ڷḦ ������ �������̵�
			if (bool) {
				System.out.println("�ߺ��ӵ�");
			} else {
				list.add(m);
			}
		}

		System.out.println("���̵�\t�̸�\t����");
		// System.out.println(list);

//		for (Member mem : list) {
			// System.out.print(mem.userid + "\t");
			// System.out.print(mem.name + "\t");
			// System.out.print(mem.nai + "\n");
//			System.out.println(mem); // ������ ����//���̵�
//		}
		 new MemberData(list);
	}

}
