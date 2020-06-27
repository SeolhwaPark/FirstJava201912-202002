package VIEW;

import java.util.List;
import java.util.Scanner;

import MODEL.DAO;
import MODEL.VO;

/*
private int bun
private String name
private String sexual
private String cell
private String addr
private String birth
 */
public class UI {
	// �л����� �Է�
	public void insert(Scanner sc) throws Exception {
		DAO dao = new DAO();
		List<VO> list = dao.select();
		System.out.println("[1-1.�л����� �Է�]");

//		while (true) {
//			System.out.println("��     ��:");
//			int bun = sc.nextInt();
//			if (bun == 0000)
//				break;
//			for (int x = 0; x < list.size(); x++) {
//				if (list.get(x).getBun() == bun) {
//					System.out.println("�̹� ������� ��ȣ�Դϴ�.");
//					break;
//
//				} else if (list.size() - 1 == x) {
//					System.out.println("��     ��:");
//					String name = sc.next();
//					System.out.println("��     ��:");
//					String sexual = sc.next();
//					System.out.println("��ȭ��ȣ:");
//					String cell = sc.next();
//					System.out.println("��     ��:");
//					String addr = sc.next();
//					System.out.println("�������:");
//					String birth = sc.next();
//
//					System.out.println("����Ͻðڽ��ϱ�?(y/n)");
//					if (sc.next().equalsIgnoreCase("y")) {
//						dao.insert(bun, name, sexual, cell, addr, birth);
//						System.out.println("�л������� ��ϵǾ����ϴ�.");
//
//						System.out.println("��� ����Ͻðڽ��ϱ�?(y/n)");
//						if (sc.next().equalsIgnoreCase("y"))
//							continue;
//						else
//							break;
//					}
//				} else {
//					System.out.println("������ ����� ��ҵǾ����ϴ�.");
//					break;
//				}
//			}
//		}
	}

	// �л����� ��ü��ȸ
	public void select() {
		DAO dao = new DAO();
		System.out.println("[1-2.�л����� ��ü��ȸ]");
		try {
			List<VO> list = dao.select();
			System.out.println("���� �� " + list.size() + "���� �л������� �����մϴ�.");
			System.out.println("�й�\t�̸�\t����\t��ȭ\t�ּ�\t����");

			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getBun() + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(list.get(x).getSexual() + "\t");
				System.out.print(list.get(x).getCell() + "\t");
				System.out.print(list.get(x).getAddr() + "\t");
				String birthday = list.get(x).getBirth().substring(0, 4);
				int tosi = (2020 - Integer.parseInt(birthday)) - 1;
				System.out.println(tosi);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �л����� �˻�
	public void search(Scanner sc) {
		DAO dao = new DAO();
		boolean a = false;
		while (a == false) {
			System.out.println("[1-3.�л����� �˻�]");
			System.out.println("1.�̸����� �˻�");
			System.out.println("2.��ȭ��ȣ�� �˻�");
			System.out.println("3.�й����� �˻�");
			System.out.println("4.�ּҷ� �˻�");
			System.out.println("5.�г����� �˻�");
			System.out.println("6.�˻� ���");
			System.out.print("����:");
			switch (sc.next()) {
			case "1": {
				this.searchName(sc);
				break;
			}
			case "2": {
				this.searchCell(sc);
				break;
			}
			case "3": {
				this.searchBun(sc);
				break;
			}
			case "4": {
				this.searchAddr(sc);
				break;
			}
			case "5": {
				this.searchHak(sc);
				break;
			}
			case "6": {
				this.searchCan(sc);
				a = true;
				break;
			}
			}
		}

	}

	// �̸�
	public void searchName(Scanner sc) {
		System.out.println("[1-3-1.�̸����� �˻�]");
		DAO dao = new DAO();
		System.out.print("�̸�:");
		String name = sc.next();
		System.out.println("�й�\t�̸�\t�г�\t����\t��ȭ\t�ּ�\t����");
		try {
			List<VO> list = dao.searchName(name);
			if (list.size() == 0)
				System.out.println("�������� �ʴ� �̸��Դϴ�.");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getBun() + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(Integer.toString(list.get(x).getBun()).substring(0, 1) + "\t");
				System.out.print(list.get(x).getSexual() + "\t");
				System.out.print(list.get(x).getCell() + "\t");
				System.out.print(list.get(x).getAddr() + "\t");
				System.out.print(list.get(x).getBirth() + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ��ȭ
	public void searchCell(Scanner sc) {
		System.out.println("[1-3-2.��ȭ��ȣ�� �˻�]");
		DAO dao = new DAO();
		System.out.print("��ȭ��ȣ:");
		String cell = sc.next();
		System.out.println("�й�\t�̸�\t�г�\t����\t��ȭ\t�ּ�\t����");
		try {
			List<VO> list = dao.searchCell(cell);
			if (list.size() == 0)
				System.out.println("�������� �ʴ� ��ȭ��ȣ�Դϴ�.");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getBun() + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(Integer.toString(list.get(x).getBun()).substring(0, 1) + "\t");
				System.out.print(list.get(x).getSexual() + "\t");
				System.out.print(list.get(x).getCell() + "\t");
				System.out.print(list.get(x).getAddr() + "\t");
				System.out.print(list.get(x).getBirth() + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �й�
	public void searchBun(Scanner sc) {
		System.out.println("[1-3-3.�й��� �˻�]");
		DAO dao = new DAO();
		System.out.print("�й�:");
		String bun = sc.next();
		System.out.println("�й�\t�̸�\t�г�\t����\t��ȭ\t�ּ�\t����");
		try {
			List<VO> list = dao.searchBun(bun);
			if (list.size() == 0)
				System.out.println("�������� �ʴ� ��ȭ��ȣ�Դϴ�.");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getBun() + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(Integer.toString(list.get(x).getBun()).substring(0, 1) + "\t");
				System.out.print(list.get(x).getSexual() + "\t");
				System.out.print(list.get(x).getCell() + "\t");
				System.out.print(list.get(x).getAddr() + "\t");
				System.out.print(list.get(x).getBirth() + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �ּ�
	public void searchAddr(Scanner sc) {
		System.out.println("[1-3-4.�ּҷ� �˻�]");
		DAO dao = new DAO();
		System.out.print("�ּ�:");
		String addr = sc.next();
		System.out.println("�й�\t�̸�\t�г�\t����\t��ȭ\t�ּ�\t����");
		try {
			List<VO> list = dao.searchAddr(addr);
			if (list.size() == 0)
				System.out.println("�������� �ʴ� ��ȭ��ȣ�Դϴ�.");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getBun() + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(Integer.toString(list.get(x).getBun()).substring(0, 1) + "\t");
				System.out.print(list.get(x).getSexual() + "\t");
				System.out.print(list.get(x).getCell() + "\t");
				System.out.print(list.get(x).getAddr() + "\t");
				System.out.print(list.get(x).getBirth() + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �г�
	public void searchHak(Scanner sc) {
		System.out.println("[1-3-5.�г����� �˻�]");
		DAO dao = new DAO();
		System.out.print("�г�:");
		String bun = sc.next() + "%";
		System.out.println("�й�\t�̸�\t�г�\t����\t��ȭ\t�ּ�\t����");
		try {
			List<VO> list = dao.searchHak(bun);
			if (list.size() == 0)
				System.out.println("�������� �ʴ� �г��Դϴ�.");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getBun() + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(Integer.toString(list.get(x).getBun()).substring(0, 1) + "\t");
				System.out.print(list.get(x).getSexual() + "\t");
				System.out.print(list.get(x).getCell() + "\t");
				System.out.print(list.get(x).getAddr() + "\t");
				System.out.print(list.get(x).getBirth() + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void searchCan(Scanner sc) {
		System.out.println("[1-3-6.�˻� ���]");
		System.out.println("�˻��� ��ҵǾ����ϴ�.");
	}

	// �л����� ����
	public void update(Scanner sc) {
		System.out.println("[1-4.�л����� ����]");
		DAO dao = new DAO();
		while (true) {
			System.out.println("������ �й��� �Է��ϼ���:");
			String bun = sc.next();
			if (bun.equals("0000"))
				break;
			try {
				List<VO> list = dao.searchBun(bun);
				if (list.size() > 0)
					for (int x = 0; x < list.size(); x++) {
						if (list.get(x).getBun() == Integer.parseInt(bun)) {
							System.out.println("�̸�:");
							String name = sc.next();
							System.out.println("����:");
							String sexual = sc.next();
							System.out.println("��ȭ��ȣ:");
							String cell = sc.next();
							System.out.println("�ּ�:");
							String addr = sc.next();
							System.out.println("�������:");
							String birth = sc.next();
							if (sc.next().equalsIgnoreCase("y")) {
								int a = dao.update(bun, name, sexual, cell, addr, birth);
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

	// �л����� ����
	public void delete(Scanner sc) throws Exception {
		System.out.println("[1-5.�л����� ����]");
		DAO dao = new DAO();
		while(true) {
			System.out.println("�л���ȣ:");
			String bun = sc.next();
			List<VO> list = dao.searchBun(bun);
			if(list.size() > 0) {
				System.out.println("�����ұ��?(y/n)");
				if(sc.next().equalsIgnoreCase("y")) {
				dao.delete(bun);
				System.out.println("�л������� �����Ǿ����ϴ�.");
				break;
			}else {
				break;
			}
		}else
			System.out.println("�������� �ʴ� ��ȣ�Դϴ�.");
		}
	}

	// ����ȭ��
	public void exit() {
		System.out.println("[1-6.����ȭ��]");
		System.exit(0);
	}

}
