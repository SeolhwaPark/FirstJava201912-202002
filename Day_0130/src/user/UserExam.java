package user;

import java.io.StreamCorruptedException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * Ŭ�����迭�� �̟G�� �˻���� ����
 * 
 
 ȸ�������Է�
 ȸ���̸�
 ȸ�� id
 �̸���
 
 ȸ�� ��ü�������
 ������ȣ �̸� id �̸���
 
 ó������
 ȸ�������� 10���̸� �Է°��� null�̰ų� "end"�̸� �Էµ� ȸ�������� ��� ��� oo
 ȸ������ �Է½� ���̵� �ߺ��� �Ұ� ���̵� �ߺ��� ����ϰ� �ٽ��Է�  -> ?oo
 ������ȣ�� �Է¼��� �°� �ڵ����� ��ϵǵ��� �Ѵ�  -> ? oo
 ȸ��������½� ��ü�̸����� ��µǵ��� �Ѵ� �޼ҵ�ȣ�� �Ұ�   ->? oo
 
 ��ȸ
 �˻������ end ��ҹ��ڱ��� ���� oo
 �˻� : ID �Է��� ���� oo
 �����ϸ� ��������ϰ� ������ �ش��������� ��� oo
 *
 */
public class UserExam {
	public static void main(String[] args) {
		User[] use = new User[2];
		Scanner scn = new Scanner(System.in);
		String name = null;
		String userId = null;
		String email = null;
		int cnt = 0;
		String[] id = new String[10]; // �ּҰ� �Ⱥ���
		String patt = "\\w+@\\w+.\\w+(\\.\\w+)?";
		System.out.println("**ȸ������**");
		
		// �Է�
		while (cnt < 10) {
			System.out.print("�̸��Է� :");
			name = scn.next();
			if (name == null || name.equalsIgnoreCase("end"))
				break;
			System.out.print("ID�Է� :");
			userId = scn.next();
			boolean sw = true;
			for (int x = cnt; x < cnt + 1; x++) {
				id[x] = userId;
			}
			for (int x = 0; x < cnt; x++) {
				if (id[x].equals(userId)) {
					System.out.println("�ߺ��Է��Դϴ�. �ٽ� �Է��ϼ���");
					sw = false;
					break;
				}
			}
			if (sw) {
				System.out.print("E-Mail�Է� :");
				email = scn.next();
				User uu = new User(name, userId, email);
				use[cnt] = uu;// �Է��Ѱ�����
				use[cnt].goyu = cnt + 1;
				cnt++;
			} else {
				continue;
			} 
			
			boolean bool = Pattern.matches(patt, email);
			if (bool) {
				System.out.println(email + "�����ӵ�");
			} else {
				System.out.println(email + "������ �ƴԵ�");
				continue;
			}
		}

		// ȸ�� ��ü�������
		System.out.println("*��ü ȸ������*");
		for (int x = 0; x < cnt; x++) {
			System.out.println(use[x]);
		}

		System.out.println("----------------------");
		System.out.print("�˻�ID:");
		String search = scn.next();
		Arrays.parallelSort(use);

		try {
			int no = Arrays.binarySearch(use, new User(search));
			System.out.println(use[no]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�ش���������");
		}
	}
}