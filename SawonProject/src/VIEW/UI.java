package VIEW;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import MODEL.DAO;
import MODEL.VO;
import MODEL.VO2;

public class UI {
	// ���
	public void select() {
		DAO dao = new DAO();
		try {
			List<VO> list = dao.select();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			Calendar c1 = Calendar.getInstance();
			String strToday = sdf.format(c1.getTime());
			System.out.println("�����ȣ\t�̸�\t������1\t  ����ȣ\t�Ի�����\t\t�޿�\tĿ�̼�\t�μ���");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getEno() + "\t");
				System.out.print(list.get(x).getEname() + "\t");
				System.out.print(list.get(x).getJob() + "\t");
				System.out.print(list.get(x).getManager() + "\t");

				if (list.get(x).getHiredate().length() > 0)
					System.out.print(strToday + "\t");

				if (list.get(x).getSalary() > 0)
					System.out.print(list.get(x).getSalary() + "\t");
				else
					System.out.print("" + "\t");

				if (list.get(x).getCommission() > 0)
					System.out.print(list.get(x).getCommission() + "\t");
				else
					System.out.print("" + "\t");

				System.out.println(list.get(x).getDname());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ���
	public void insert(Scanner sc) throws Exception {
		DAO dao = new DAO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Calendar c1 = Calendar.getInstance();
		String strToday = sdf.format(c1.getTime());

		System.out.println("	*** �ű� ��� ���� ��� ***");
		while (true) {
			System.out.println("����̸� :");
			String ename = sc.next();
			System.out.println("�� �� �� :");
			String job = sc.next();
			System.out.println("����ȣ :");
			int manager = sc.nextInt();

			sc.nextLine();// ���͹����� �� ���� ���͸� ������
			System.out.println("�Ի�����(2019-05-02):");
			String hiredate = sc.nextLine();
			if (hiredate.length() >= 0)
				hiredate = strToday;

			System.out.println("��    �� :");
			int salary = sc.nextInt();

			System.out.println("Ŀ �� �� :");
			int commission = sc.nextInt();

			int dno;
			while (true) {
				System.out.println("�μ�����(10:ACCOUNTING, 20:RESEARCH, 30:SALES, 40:OPERATIONS)");
				System.out.println("�μ���ȣ : ");
				dno = sc.nextInt(); // �Է¹ް�
				List<VO> list = dao.searchNo(dno);
				if (list.size() == 0) { // �μ���ȣ�� 0�̸�
					System.out.println("�������� �ʴ� ��ȣ�Դϴ�.");
					continue;
				}
				break;
			}
			
			System.out.println("����Ͻðڽ��ϱ�(y/n) ? --> ����� ���� �޴��� �̵�");
			if (sc.next().equalsIgnoreCase("y")) {
				dao.insert(ename, job, manager, hiredate, salary, commission, dno);
			} else {
				continue;
			}
		}
	}

	// �̸��˻�
	public void search(Scanner sc) {
		DAO dao = new DAO();
		while (true) {
			System.out.println("������ �˻��Ͻðڽ��ϱ�?");
			String a = sc.next();
			try {
				List<VO> list = dao.searchName(a);
				System.out.println(list.size());
				if (list.size() == 0)
					System.out.println("�������� �ʴ� �̸��Դϴ�.");
				for (int x = 0; x < list.size(); x++) {
					System.out.print(list.get(x).getEno() + "\t");
					System.out.print(list.get(x).getEname() + "\t");
					System.out.print(list.get(x).getJob() + "\t");
					System.out.print(list.get(x).getDname2() + "\t");
					System.out.print(list.get(x).getHiredate().substring(0, 11) + "\t");
					System.out.print(list.get(x).getSalary() + "\t");
					System.out.print(list.get(x).getCommission() + "\t");
					System.out.print(list.get(x).getDname() + "\n");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("�˻��� ����Ұ���?(y/n)?");
			if (sc.next().equalsIgnoreCase("y")) {
				continue;
			} else {
				break;
			}
		}
	}

	// ����
	public void update(Scanner sc) {
		DAO dao = new DAO();
		System.out.println("	*** �ű� ��� ���� ���� ***");
		while (true) {
			System.out.println("����̸� :");
			String ename = sc.next();
			System.out.println("�� �� �� :");
			String job = sc.next();
			System.out.println("����ȣ :");
			int manager = sc.nextInt();

			// ���ʹ����� ���ó�¥�� �ڵ����� ���� �ϱ�
			sc.nextLine();
			System.out.println("�Ի�����(2019-05-02):");
			String hiredate = sc.nextLine();
			if (hiredate.length() >= 0)
				hiredate = "2020-03-01";

			System.out.println("��    �� :");
			int salary = sc.nextInt();
			System.out.println("Ŀ �� �� :");
			int commission = sc.nextInt();
			System.out.println("�μ�����(10:xxx, 20:yyyy, 30:dddd, 40:ssss)");
			System.out.println("�μ���ȣ : ");
			int dno = sc.nextInt();
			System.out.println("�����ұ��??(y/n)");
			if (sc.next().equalsIgnoreCase("y")) {
				dao.update(ename, job, manager, hiredate, salary, commission, dno);
			} else {
				continue;
			}
		}
	}

	// ����
	public void delete(Scanner sc) {
		DAO dao = new DAO();
		while (true) {
			System.out.println("������ ��ȣ�� �Է� :");
			int eno = sc.nextInt();
			System.out.println("�����ұ��??(y/n)");
			if (sc.next().equalsIgnoreCase("y")) {
				dao.delete(eno);
			} else {
				continue;
			}
		}
	}
	public void exit(Scanner sc) {
		System.exit(0);
	}
}
