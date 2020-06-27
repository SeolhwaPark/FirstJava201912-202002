package VIEW;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import MODEL.DAO;
import MODEL.VO;

public class UI {

//	 [1] ���� ���� ���� ���
	public void Insert(Scanner sc) throws Exception {
		DAO dao = new DAO();
		List<VO> list = dao.select();
		System.out.println("[1] ���� ���⿹�� ���");
		boolean number = false;
		int cnt = 0;
		while (true) {
			System.out.println("�����ȣ :");
			int lentno = sc.nextInt();
			for (int x = 0; x < list.size(); x++) {
				if (list.get(x).getLentno()==lentno) {
					System.out.println("�̹� ��ϵ� ����ȣ�Դϴ�.");
					number = true;
					break;
				} else {
					System.out.println("��� ������ ����ȣ�Դϴ�.");
					cnt++;
				}
			}
			System.out.println("������ :");
			String custname = sc.next();
			System.out.println("�� �� ó :");
			String phone = sc.next();
			System.out.println("�����ڵ� :");
			int bookno = sc.nextInt();
			System.out.println("�������� :");
			String outdate = sc.next();
			System.out.println("�ݳ����� :");
			String indate = sc.next();
			
			System.out.println("����մϴ�(y/n) ?");
			if (sc.next().equalsIgnoreCase("y")) {
				dao.Insert(lentno, custname, bookno, phone, outdate, indate);
			} else 
				continue;
			break;
			
		}
	}

//	 [2] ���� ���� ��Ȳ ��ȸ
	public void Select() {
		DAO dao = new DAO();
		System.out.println("	���� ���� ��Ȳ ��ȸ");
		try {
			System.out.println("�����ȣ\t������\t��ȭ��ȣ\t�����ڵ�\t��������\t�ݳ�����\t�������");
			List<VO> list = dao.select();
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getLentno() + "\t");
				System.out.print(list.get(x).getCustname() + "\t");
				System.out.print(list.get(x).getPhone() + "\t");
				System.out.print(list.get(x).getBookno() + "\t");
				System.out.print(list.get(x).getOutdate().substring(2, 10) + "\t");
				System.out.print(list.get(x).getIndate().substring(2, 10) + "\t");
				System.out.println(list.get(x).getStatus());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	 [3] ���� ���� ���� ����
	public void update(Scanner sc) {
		DAO dao = new DAO();
		System.out.println("���� ���� ���� ����");
		while (true) {
			System.out.println("�����ȣ:");
			int lentno = sc.nextInt();
			try {
				List<VO> list = dao.select();
				if (list.size() > 0) {
					System.out.println("������:");
					System.out.println(list.get(0).getCustname());
					String custname = sc.next();
					System.out.print("�� �� ó:");
					System.out.println(list.get(0).getPhone());
					String phone = sc.next();
					System.out.println("�����ڵ�:");
					System.out.println(list.get(0).getBookno());
					int bookno = sc.nextInt();
					System.out.println("��������:");
					System.out.println(list.get(0).getOutdate());
					String outdate = sc.next();
					System.out.println("�ݳ�����:");
					System.out.println(list.get(0).getIndate());
					String indate = sc.next();

					System.out.println("�����մϴ�(y/n)?");
					if (sc.next().equalsIgnoreCase("y")) {
						dao.update(lentno, custname, phone, bookno, outdate, indate);
					} else {
						continue;
					}
				} else
					System.out.println("������ �����Ͽ����ϴ�.");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

//	 [4] ���� ���� �ݳ� ���
	public void Return(Scanner sc) throws Exception {
		DAO dao = new DAO();
		System.out.println("[4] ���� ����ݳ� ���");
		while (true) {
			System.out.println("�����ȣ :");
			int lentno = sc.nextInt();

			String status;
			while (true) {
				System.out.println("�ڵ����� ����(1),�ݳ�(2)");
				System.out.println("�����ڵ� :");
				status = sc.next();
				List<VO> list = dao.select();
				if (list.size() == 0) {
					System.out.println("�������� �ʴ� �ڵ��Դϴ�.");
					continue;
				}
				break;
			}
			System.out.println("����մϴ�(y/n) ?");
			if (sc.next().equalsIgnoreCase("y")) {
				dao.Return(status);
			} else {
				continue;
			}
		}
	}

}
