package VIEW;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import MODEL.DAO;
import MODEL.VO;

public class UI {
	// ��ü���
	public void select() {
		DAO dao = new DAO();
		System.out.println("==== ��ü ȸ�� ��� ====");
		try {
			List<VO> list = dao.select();
			System.out.println("��ü ȸ�� ��:" + list.size() + "��");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			List<VO> list = dao.select();
			System.out.println("���̵�\t�̸�\t�̸���\t�����");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getId() + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(list.get(x).getEmail() + "\t");
				System.out.print(list.get(x).getRegdate() + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ȸ�����
	public void insert(Scanner sc) throws Exception {
		DAO dao = new DAO();
		System.out.println("==== ȸ�� ���� ��� ====");
		String id = null;
		List<VO> list = dao.search(sc, id);
		try {
			while (true) {
				System.out.println("���̵�:");
				id = sc.next();
				for (int x = 0; x < list.size(); x++) {
					if (list.get(x).getId().equals(id)) {
						System.out.println("�̹� ������� ���̵��Դϴ�.");
						break;
					}
				}
				System.out.println("�̸�:");
				String name = sc.next();
				System.out.println("�н�����");
				String passwd = sc.next();
				System.out.println("�̸���");
				String email = sc.next();
				System.out.println("��ȭ��ȣ");
				String tel = sc.next();
				System.out.println("�ּ�");
				String address = sc.next();
				System.out.println("����");
				int age = sc.nextInt();

				System.out.println("����Ͻ÷�����?(y/n)? ->����� �������� �̵�");
				if (sc.next().equalsIgnoreCase("y")) {
					dao.insert(id, name, passwd, email, tel, address, age);
					break;
				} else
					continue;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �α���
	public void login(Scanner sc) throws Exception {
		DAO dao = new DAO();
		List<VO> testid = dao.testId();
		List<VO> testpw = dao.testPasswd();
		boolean login = false;
		boolean ok = false;
		int cnt = 0;
		System.out.println("==== �α��� ====");
		while (ok == false) {
			System.out.println("���̵�:");
			String id = sc.next();
			for (int x = 0; x < testid.size(); x++) {
				if (testid.get(x).getId().equals(id)) {
					System.out.println("ok");
					login = true;
					break;
				} else {
					System.out.println("��ϵ� ���̵� �����ϴ�");
					cnt++;
				}

			}

			if (login == true) {
				System.out.println("�н�����:");
				String passwd = sc.next();
				int cntt = 0;
				for (int x = 0; x < testpw.size(); x++) {
					if (testpw.get(x).equals(passwd)) {
						System.out.println("�α��� �Ǿ����ϴ�!");
						cntt++;
						break;
					} else {
						System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
						cnt++;
						ok = true;
					}
				}

				if (cntt > 0)
					break;
				if (cnt == 3) {
					System.out.println("3���̻� Ʋ�Ƚ��ϴ�. �������� ���ư��ϴ�.");
					break;
				}
			}

		}
	}

	// �˻�
	public void search(Scanner sc) {
		System.out.println("==== ȸ�� ���� �˻� ====");
		DAO dao = new DAO();
		while (true) {
			System.out.println("������ �˻��Ͻðڽ��ϱ�?");
			String id = sc.next();
			try {
				List<VO> list = dao.search(sc, id);
				System.out.println(list.size());
				if (list.size() == 0) {
					System.out.println("�������� �ʴ� ���̵��Դϴ�.");
					System.out.println("�ٽ� �˻��Ͻðڽ��ϱ�?");
					if (sc.next().equalsIgnoreCase("y"))
						continue;
					else
						break;
				}
				for (int x = 0; x < list.size(); x++) {
					System.out.print(list.get(x).getName() + "\t");
					System.out.print(list.get(x).getEmail() + "\t");
					System.out.print(list.get(x).getTel() + "\t");
					System.out.print(list.get(x).getAddress() + "\t");
					System.out.print(list.get(x).getAge() + "\t");
					System.out.print(list.get(x).getRegdate() + "\n");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("�˻��� ��� �Ͻðڽ��ϱ�?");
			if (sc.next().equalsIgnoreCase("y"))
				continue;
			else
				break;
		}
	}

	// ����
	public void update(Scanner sc) {
		System.out.println("==== ȸ�� ���� ���� ====");
		DAO dao = new DAO();
		while(true) {
			System.out.println("������ ���̵� �Է��ϼ���??");
			String id = sc.next();
			try {
				List<VO> list = dao.search(sc, id);
				System.out.println(list.size());
				for(int x=0; x<list.size(); x++) {
					System.out.println(list.get(x).getName());
					System.out.println(list.get(x).getEmail());
					System.out.println(list.get(x).getTel());
					System.out.println(list.get(x).getAddress());
					System.out.println(list.get(x).getAge());
				}
				if(list.size() >0) {
					System.out.println("�̸�:" + list.get(0).getName());
					String name = sc.next();
					System.out.println("�н�����:");
					for(int y=0; y<list.get(0).getPasswd().length(); y++) {
						System.out.print("*");
					}
					System.out.println("�̸���:" + list.get(0).getEmail());
					String email = sc.next();
					System.out.println("��ȭ��ȣ:" + list.get(0).getTel());
					String tel = sc.next();
					System.out.println("�ּ�:" + list.get(0).getAddress());
					String address = sc.next();
					System.out.println("����:" + list.get(0).getAge());
					int age = sc.nextInt();
				}
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}



	// ����
	public void delete() {
		System.out.println("==== ȸ�� ���� ���� ====");
		DAO dao = new DAO();

	}

	// ������
	public void exit() {

	}
}
