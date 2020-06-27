package customer.view;

import java.util.*;
import java.util.Scanner;

import customer.model.CustDAO;
import customer.model.CustVO;
/*
***�ű� �� ���� ���***
����
����ó
�ּ�
�����
�������
����

����Ͻðڽ��ϱ�(y/n)?
*/

public class CustUI {
	static CustDAO dao = new CustDAO();

	// [1] �� ��ü ���
	public void custList() {
		List<CustVO> list = dao.custList();
		System.out.println("����ȣ\t�̸�\t����ó\t\t�����\t�������\t\t\t����\t�������");
		for (CustVO a : list) {
			System.out.print(a.getNum() + "\t" + a.getName() + "\t" + a.getTel() +
					"\t\t" + a.getOffice() + "\t");
			System.out.println(a.getBirthday().substring(0, 10) + "\t\t" + 
					a.getSex() + "\t" + a.getIndate());
		}
	}

	// [2] �ű� �� ���
	public void custInsert(Scanner sc) {
		System.out.print("����ȣ  :");
		int num = sc.nextInt();
		System.out.print("��  ��  �� :");
		String name = sc.next();
		System.out.print("��  ��  ó :");
		String tel = sc.next();
		System.out.print("��       �� :");
		String addr = sc.next();
		System.out.print("��  ��  �� :");
		String office = sc.next();
		System.out.print("�������  :");
		String birthday = sc.next();
		System.out.print("��       �� :");
		String sex = sc.next();
		System.out.println("����Ͻðڽ��ϱ�?(y/n)");
		String yesno = sc.next();
		if (yesno.equalsIgnoreCase("y")) {
			int check = dao.custInsert(num, name, tel, addr, office, birthday, sex);
			if (check == 1)
				System.out.println("��� ����");
			else
				System.out.println("��� ����");
		} else
			System.out.println("��� ���");
	}

	// [3] �� �˻�
	public void custSearch(Scanner sc) {
		System.out.println("	***�� ���� �˻�***");

		System.out.print("���ϴ� ���� �̸��� �Է��ϼ���?");
		String name = sc.next();
		CustVO a = dao.custSearch(name);
		if (a == null)
			System.out.println("���� �������� �ʽ��ϴ�.");
		else {
			System.out.println("���� :" + a.getName());
			System.out.println("����ó :" + a.getTel());
			System.out.println("�ּ� :" + a.getAddr());
			System.out.println("����� :" + a.getOffice());
			System.out.println("������� :" + a.getBirthday());
			System.out.println("���� :" + a.getSex());
			System.out.println("������� :" + a.getIndate());
		}
	}

	// [4] �� ���� ����
	public void custUpdate(Scanner sc) {
		System.out.println("	***�� ���� ����***");
		System.out.print("���ϴ� ���� ��ȣ�� �Է��ϼ���?");
		int num = sc.nextInt();
		CustVO a = dao.custSearch(num);
		if (a == null)
			System.out.println("���� �������� �ʽ��ϴ�.");
		else {
			System.out.print("��  ��  ó :");
			String tel = sc.next();
			System.out.print("��  ��  �� :");
			String office = sc.next();
			System.out.println("�����Ͻðڽ��ϱ�?(y/n)");
			String yesno = sc.next();
			if (yesno.equalsIgnoreCase("y")) {
				int check = dao.custUpdate(num, tel, office);
				if (check == 1)
					System.out.println("���� ����");
				else
					System.out.println("���� ����");
			} else
				System.out.println("���� ���");
		}
	}

	// [5] �� ���� ����
	public void custDelete(Scanner sc) {
		System.out.println("	***�� ���� ����***");
		System.out.print("������ ����ȣ:");
		int num = sc.nextInt();
		CustVO a = dao.custSearch(num);
		if (a == null)
			System.out.println("���� �������� �ʽ��ϴ�.");
		else {
			System.out.println("���� :" + a.getName());
			System.out.println("����ó :" + a.getTel());
			System.out.println("�ּ� :" + a.getAddr());
			System.out.println("����� :" + a.getOffice());
			System.out.println("������� :" + a.getBirthday());
			System.out.println("���� :" + a.getSex());
			System.out.println("������� :" + a.getIndate());
			System.out.println("�����Ͻðڽ��ϱ�?(y/n)");
			String yesno = sc.next();
			if (yesno.equalsIgnoreCase("y")) {
				int check = dao.custDelete(num);
				if (check == 1)
					System.out.println("���� ����");
				else
					System.out.println("���� ����");
			} else
				System.out.println("���� ���");
		}
	}

	// [6] ����
	public boolean custExit(Scanner sc) {
		System.out.println("���α׷��� �����Ͻðڽ��ϱ�?(y/n)");
		String yesno = sc.next();
		if (yesno.equalsIgnoreCase("y")) {
			return true;
		} else
			return false;

	}
}
