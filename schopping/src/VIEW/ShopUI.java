package VIEW;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import MODEL.ShopDAO;
import MODEL.ShopVO;

public class ShopUI {
//	 [1] ȸ������ ���
	public void Insert(Scanner sc) throws Exception {
		String phonepat = "(010|011)-\\d{3,4}-\\d{4}";
		ShopDAO dao = new ShopDAO();
		List<ShopVO> list = dao.Select();
		System.out.println("[1]ȸ������ ���");
		boolean flag = false;
		while (true) {
			String custno;
			while (true) {
				System.out.println("ȸ����ȣ :");
				custno = sc.next();
				if (Pattern.matches("[0-9]{6}", custno)) {
					break;
				} else
					System.out.println("ȸ����ȣ 6�ڸ��� �Է��ϼ���.");
			}
			for (int x = 0; x < list.size(); x++) {
				if (list.get(x).getCustno() == Integer.parseInt(custno)) {
					System.out.println("�̹� ������� ��ȣ�Դϴ�.");
					break;

				} else if (list.size() - 1 == x) {

					System.out.println("ȸ���̸� :");
					String custname = sc.next();
					
					String phone ;
					while(true) {
						System.out.println("�� �� ó :");
						phone = sc.next();
						if(Pattern.matches(phonepat, phone)) {
							break;
						}else {
							System.out.println("�߸��� �޴��� ��ȣ �ٽ� �Է��ϼ���");
							continue;
							
						}
					}
					

					String gender;
					while(true) {
						System.out.println("����(M/F) :");
						gender = sc.next().toUpperCase();
						if(Pattern.matches("M?F?{1}", gender))
							break;
						else System.out.println("������ M �Ǵ� F�� �Է°����մϴ�");
					}
					
					String grade;
					while(true) {
						System.out.println("ȸ�����(A/B/C) :");
						grade = sc.next().toUpperCase();
						if(Pattern.matches("A?B?C?{1}", grade))
							break;
						else System.out.println("ȸ������� A,B,C�� �ѱ��ڸ� �Է°����մϴ�");
					}

					System.out.println("����Ͻðڽ��ϱ�(y/n)");
					if (sc.next().equalsIgnoreCase("y")) {
						dao.Insert(Integer.parseInt(custno), custname, phone, gender, grade);
						System.out.println("ȸ�������� ��ϵǾ����ϴ�");

						System.out.println("��� ����Ͻðڽ��ϱ�?(y/n)");
						if (sc.next().equalsIgnoreCase("y")) {
							continue;
						} else {
							flag = true;
							break;
						}
					} else {
						System.out.println("�л������� ��� ��ҵǾ����ϴ�");
						flag = true;
						break;
					}
				}
			}
			if (flag)
				break;
		}

	}

//	 [2] ȸ��������Ȳ ��ȸ
	public void Select() {
		ShopDAO dao = new ShopDAO();
		System.out.println("[2] ȸ��������Ȳ ��ȸ");
		try {
			List<ShopVO> list = dao.Select();
			System.out.println("ȸ����ȣ\t�̸�\t����ó\t\t����\t��������\t\tȸ�����");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getCustno() + "\t");
				System.out.print(list.get(x).getCustname() + "\t");
				System.out.print(list.get(x).getPhone() + "\t");
				
				if(list.get(x).getGender().equals("M")) System.out.print("��"+ "\t");
				else System.out.print("��"+ "\t");
				if(list.get(x).getJoindate()==null) {
					System.out.print("\t\t");
				}else {
					System.out.print(list.get(x).getJoindate().substring(0,10)+"\t");
				}
				if(list.get(x).getGrade().equals("A"))System.out.print("VIP" + "\n");
				else if(list.get(x).getGrade().equals("B"))System.out.print("�Ϲ�" + "\n");
				else System.out.println("����");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//	 [3] ȸ������ ����
	public void Update(Scanner sc) {
		System.out.println("[3]ȸ������ ����");
		ShopDAO dao = new ShopDAO();
		while (true) {
			System.out.println("������ ȸ����ȣ�� �Է��ϼ���?");
			String custno = sc.next();
			int per = 0;
			try {
				List<ShopVO> list = dao.Select();
				if (list.size() > 0)
					for (int x = 0; x < list.size(); x++) {
						if (list.get(x).getCustno() == Integer.parseInt(custno)) {
							per = x;
							System.out.print("������ (" + list.get(per).getCustname() + "):");
							String custname = sc.next();
							System.out.print("����ó (" + list.get(per).getPhone() + "):");
							String phone = sc.next();
							System.out.print("���� (" + list.get(per).getGender() + "):");
							String gender = sc.next();
							System.out.print("ȸ����� (" + list.get(per).getGrade() + "):");
							String grade = sc.next();

							System.out.println("�����ұ��??(y/n)");
							if (sc.next().equalsIgnoreCase("y")) {
								int a = dao.Update(custno, custname, phone, gender, grade);
								System.out.println("�л������� �����Ǿ����ϴ�.");
								break;
							} else {
								break;
							}
						}
					}
				else {
					System.out.println("ȸ�������� �������� �ʽ��ϴ�.");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
	}

//	 [4] ȸ������ ����
	public void Delete(Scanner sc) throws Exception {
		System.out.println("[4]ȸ������ ����");
		ShopDAO dao = new ShopDAO();
		while (true) {
			boolean flag = false;
			int per = 0;
			List<ShopVO> list = dao.Select();
			System.out.print("ȸ����ȣ:");
			int custno = sc.nextInt();
			for (int x = 0; x < list.size(); x++) {
				if (list.get(x).getCustno() == custno) {
					flag = true;
					per = x;
					break;
				}
			}
			if (flag) {
				System.out.println("������(" + list.get(per).getCustname() + ")");
				System.out.println("����ó(" + list.get(per).getPhone() + ")");
				System.out.println("����(" + list.get(per).getGender() + ")");
				System.out.println("ȸ�����(" + list.get(per).getGrade() + ")");
				System.out.println("�����ұ��??(y/n)");
				if (sc.next().equalsIgnoreCase("y")) {
					dao.Delete(custno);
					System.out.println("ȸ�������� �����Ǿ����ϴ�.");
					break;
				} else {
					break;
				}
			} else
				System.out.println("�������� �ʴ� ��ȣ�Դϴ�.");
		}
	}
	
	
	public void date() {
		
	}
}
