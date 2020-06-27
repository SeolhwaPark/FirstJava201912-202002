package UI;

import java.util.List;
import java.util.Scanner;

import DAO.studentDAO;
import VO.StudentVO;

public class StudentUI {
	// �л������Է�//
	public void insert(Scanner sc) throws Exception {
		studentDAO dao = new studentDAO();
		List<StudentVO> list = dao.select();
		System.out.println("[1-1]�л������Է�");

		while (true) {
			System.out.println("��     �� :");
			int bun = sc.nextInt();
			if (bun == 0000)
				break;
			for (int x = 0; x < list.size(); x++) {
				if (list.get(x).getBun() == bun) {
					System.out.println("�̹� ������� �й��Դϴ�.");
					break;

				} else if (list.size() - 1 == x) {
					System.out.println("��     �� :");
					String name = sc.next();
					System.out.println("��     �� :");
					String addr = sc.next();
					System.out.println("��     ȭ :");
					String email = sc.next();
					System.out.println("������� :");
					String birth = sc.next();

					System.out.println("����Ͻðڽ��ϱ�(y/n)");
					if (sc.next().equalsIgnoreCase("y")) {
						dao.insert(bun, name, addr, email, birth);
						System.out.println("�л������� ��ϵǾ����ϴ�");

						System.out.println("��� ����Ͻðڽ��ϱ�?(y/n)");
						if (sc.next().equalsIgnoreCase("y")) {
							continue;
						} else {
							break;
						}
					} else {
						System.out.println("�л������� ��� ��ҵǾ����ϴ�");
						break;
					}
				}
			}
		}
	}

	public void select() {
		studentDAO dao = new studentDAO();
		System.out.println("[1-2]�л����� ��ȸ");
		try {
			List<StudentVO> list = dao.select();
			System.out.println("�� " + list.size() + "���� �л��� ��ȸ�մϴ�.");
			System.out.println("�й�\t�̸�\t��ȭ\t����");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getBun() + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(list.get(x).getEmail() + "\t");
				String s = list.get(x).getBirth().substring(0, 4);
				int a = 2021 - Integer.parseInt(s);
				System.out.println(a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// �л������˻�//

	public void search(Scanner sc) {
		studentDAO dao = new studentDAO();
		boolean a = false;
		while (a == false) {
			System.out.println("[1-3]�л����� �˻�");
			System.out.println("<�л����� �˻�>");
			System.out.println("1.�̸����� �˻�");
			System.out.println("2.�й����� �˻�");
			System.out.println("3.�г����� �˻�");
			System.out.println("4.�˻� ���");
			System.out.print("����:");

			switch (sc.nextInt()) {
			case 1: {
				this.searchName(sc);
				break;
			}
			case 2: {
				this.searchBun(sc);
				break;
			}
			case 3: {
				this.searchHak(sc);
				break;
			}
			case 4: {
				this.searchCan(sc);
				a = true;
				break;
			}
			}
		}
	}

	// �̸��˻�//
	public void searchName(Scanner sc) {
		System.out.println("[1-3-1]�̸����� �˻�");
		studentDAO dao = new studentDAO();
		System.out.print("�̸�:");
		String name = sc.next();
		System.out.println("�й�\t�̸�\t�г�\t�ּ�\t��ȭ\t����");
		try {
			List<StudentVO> list = dao.searchName(name);
			if (list.size() == 0)
				System.out.println("�������� �ʴ� �̸��Դϴ�.");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getBun() + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(Integer.toString(list.get(x).getBun()).substring(0, 1) + "\t");
				System.out.print(list.get(x).getAddr() + "\t");
				System.out.print(list.get(x).getEmail() + "\t");
				System.out.print(list.get(x).getBirth() + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �й��˻�//
	public void searchBun(Scanner sc) {
		System.out.println("[1-3-2]�й����� �˻�");
		studentDAO dao = new studentDAO();
		System.out.println("�й�:");
		String bun = sc.next();
		System.out.println("�й�\t�̸�\t�ּ�\t��ȭ\t����");
		try {
			List<StudentVO> list = dao.searchBun(bun);
			if (list.size() == 0)
				System.out.println("�������� �ʴ� �й��Դϴ�.");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getBun() + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(list.get(x).getAddr() + "\t");
				System.out.print(list.get(x).getEmail() + "\t");
				System.out.print(list.get(x).getBirth() + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �г�˻�//
	public void searchHak(Scanner sc) {
		System.out.println("[1-3-3]�г����� �˻�");
		studentDAO dao = new studentDAO();
		System.out.println("�г�:");
		String bun = sc.next() + "%";
		System.out.println("�й�\t�̸�\t�ּ�\t��ȭ\t����");
		try {
			List<StudentVO> list = dao.searchHak(bun);
			if (list.size() == 0)
				System.out.println("�������� �ʴ� �г��Դϴ�.");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(Integer.toString(list.get(x).getBun()).substring(0, 1) + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(list.get(x).getAddr() + "\t");
				System.out.print(list.get(x).getEmail() + "\t");
				System.out.print(list.get(x).getBirth() + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ���//
	public void searchCan(Scanner sc) {
		System.out.println("[1-3-4]�˻� ���");
		System.out.println("��ҵǾ����ϴ�.");
	}

	// ����//
	public void update(Scanner sc) {
		System.out.println("[1-4]�л����� ����");
		studentDAO dao = new studentDAO();
		while (true) {
			System.out.println("������ �й��� �Է��ϼ���?");
			String bun = sc.next();
			if (bun.equals("0000"))
				break;
			try {
				List<StudentVO> list = dao.searchBun(bun);
				if (list.size() > 0)
					for (int x = 0; x < list.size(); x++) {
						if (list.get(x).getBun() == Integer.parseInt(bun)) {
							System.out.print("�̸� :");
							String name = sc.next();
							System.out.print("�ּ� :");
							String addr = sc.next();
							System.out.print("��ȭ :");
							String email = sc.next();
							System.out.print("������� :");
							String birth = sc.next();
							System.out.println("�����ұ��??(y/n)");
							if (sc.next().equalsIgnoreCase("y")) {
								int a = dao.update(bun, name, addr, email, birth);
								System.out.println("�л������� �����Ǿ����ϴ�.");
								break;
							} else {
								break;
							}
						}
					}
				else {
					System.out.println("�л������� �������� �ʽ��ϴ�.");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
	}

	// �л���������//
	public void delete(Scanner sc) throws Exception {
		System.out.println("[1-5]�л����� ����");
		studentDAO dao = new studentDAO();
		while (true) {
			System.out.print("������ ��ȣ:");
			String bun = sc.next();
			List<StudentVO> list = dao.searchBun(bun);
			if (list.size() > 0) {
				System.out.println("�����ұ��??(y/n)");
				if (sc.next().equalsIgnoreCase("y")) {
					dao.delete(bun);
					System.out.println("�л������� �����Ǿ����ϴ�.");
					break;
				} else {
					break;
				}

			} else
				System.out.println("�������� �ʴ� ��ȣ�Դϴ�.");

		}
	}

	// ������
	public void exit(Scanner sc) {
		System.exit(0);
	}
}
