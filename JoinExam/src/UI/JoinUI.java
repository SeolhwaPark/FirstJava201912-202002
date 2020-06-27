package UI;

import java.util.List;
import java.util.Scanner;

import DAO.JoinDAO;
import VO.JoinVO;

public class JoinUI {

	// ���
	public void select() {
		JoinDAO dao = new JoinDAO();
		System.out.println("==== ��ü ȸ�� ��� ====");
		try {
			List<JoinVO> list = dao.select();
			System.out.println("��ü ȸ���� : " + list.size() + "��");

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println("���̵�\t�̸�\t�̸���\t�������");
			List<JoinVO> list = dao.select();
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getUserid() + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(list.get(x).getEmail() + "\t");
				System.out.println(list.get(x).getRegdate().substring(2, 10));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ���
	public void insert(Scanner sc) throws Exception {
		JoinDAO dao = new JoinDAO();
		List<JoinVO> list = dao.search(sc, null);
		System.out.println("==== ȸ������ ��� ====");

		while (true) {
			System.out.println("���̵� :");
			String userid = sc.next();
			for (int x = 0; x < list.size(); x++) {
				if (list.get(x).getUserid().equals(userid)) {
					System.out.println("�̹� ������� ���̵��Դϴ�.");
					break;
				}
			}
			System.out.println("�̸� :");
			String name = sc.next();
			System.out.println("�н����� :");
			String passwd = sc.next();
			System.out.println("�̸��� :");
			String email = sc.next();
			System.out.println("���� :");
			int age = sc.nextInt();

			System.out.println("����Ͻðڽ��ϱ�(y/n) ? --> ����� ���� �޴��� �̵�");

			if (sc.next().equalsIgnoreCase("y")) {
				dao.insert(userid, name, passwd, email, age);
				break;
			} else {
				continue;
			}
		}
	}
	//�α�
	public void login(Scanner sc) throws Exception {
		JoinDAO dao = new JoinDAO();
		List<JoinVO> idlist = dao.id();
		List<JoinVO> passlist = dao.pass();
		boolean login = false;
		boolean okidoki = false;
		int cnt = 0;
		System.out.println("==== �α��� ====");
		while (okidoki == false) {
			System.out.println("���̵� :");
			String userid = sc.next();
			for (int x = 0; x < idlist.size(); x++) {
				if (idlist.get(x).getUserid().equals(userid)) {
					System.out.println("okidoki");
					login = true;
					break;
				} else {
					System.out.println("��ϵ� ���̵� �����ϴ�.");
					cnt++;
				}
			}
			if (login == true) {
				System.out.println("�н����� :");
				String passwd = sc.next();
				int a = 0;
				for (int y = 0; y < passlist.size(); y++) {
					if (passlist.get(y).getPasswd().equals(passwd)) {
						System.out.println("�α��� �Ǿ����ϴ�");
						a++;
						break;
					} else {
						System.out.println("��й�ȣ�� �����ʽ��ϴ�.");
						cnt++;
						okidoki = true;

					}
				}
				if (a > 0)
					break;
			}
			if(cnt ==3) {
				System.out.println("3���̻� Ʋ�Ƚ��ϴ�. �������� �̵��մϴ�.");
				break;
			}
		}
	}

	// �˻�
	public void search(Scanner sc) {
		JoinDAO dao = new JoinDAO();
		System.out.println("==== ȸ�� ���� �˻� ====");
		while (true) {
			System.out.println("������ �˻��Ͻðڽ��ϱ�?");
			String a = sc.next();
			try {
				List<JoinVO> list = dao.search(sc, a);
				System.out.println(list.size());
				if (list.size() == 0) {
					System.out.println("�������� �ʴ� ���̵��Դϴ�.");
					System.out.println("�˻��� �ٽ��Ұ���?(y/n)?");
					if (sc.next().equalsIgnoreCase("y")) {
						continue;
					} else {
						break;
					}
				}
				for (int x = 0; x < list.size(); x++) {
					System.out.print(list.get(x).getName() + "\t");
					System.out.print(list.get(x).getEmail() + "\t");
					System.out.print(list.get(x).getAge() + "\t");
					System.out.print(list.get(x).getRegdate().substring(0, 11) + "\t");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println();
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
		JoinDAO dao = new JoinDAO();
		System.out.println("==== ȸ�� ���� ���� ====");
		while (true) {
			System.out.println("������ �˻��Ͻðڽ��ϱ�?");
			String userid = sc.next();
			try {
				List<JoinVO> list = dao.search(sc, userid);
				System.out.println(list.size());
				System.out.println(list.get(0).getName());

				if (list.size() > 0) {
					System.out.println("�̸� :" + list.get(0).getName());
					String name = sc.next();
					System.out.print("�н����� :");
					for (int x = 0; x < list.get(0).getPasswd().length(); x++) {
						System.out.print("*");
					}
					String passwd = sc.next();
					System.out.println("�̸��� :");
					System.out.println(list.get(0).getEmail());
					String email = sc.next();
					System.out.println("���� :");
					System.out.println(list.get(0).getAge());
					int age = sc.nextInt();
					System.out.println("�����ұ��??(y/n)");
					if (sc.next().equalsIgnoreCase("y")) {
						dao.update(userid, name, passwd, email, age);
					} else {
						continue;
					}
				} else
					System.out.println("ssss");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	// ����
	public void delete(Scanner sc) throws Exception {
		JoinDAO dao = new JoinDAO();
		System.out.println("==== ȸ�� ���� ���� ====");
		while (true) {
			System.out.println("������ ���̵� �Է� :");
			String userid = sc.next();
			List<JoinVO> list = dao.search(sc, userid);
			if(list.size()>0) {
				System.out.println(list.get(0).getName());
				System.out.println("�����ұ��??(y/n)");
				if (sc.next().equalsIgnoreCase("y")) {
					dao.delete(userid);
				} else {
					continue;
				} break;
			}else System.out.println("XXXX");
		
		}
	}

	public void exit(Scanner sc) {
		System.exit(0);
	}
}
