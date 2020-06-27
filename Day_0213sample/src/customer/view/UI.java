package customer.view;

import java.util.List;
import java.util.Scanner;

import customer.model.CustDAO;
import customer.model.CustVO;

public class UI {
	static CustDAO temp = new CustDAO();
	public void List() {
		List<CustVO> list = temp.CList();
		System.out.println("����ȣ\t�̸�\t����ó\t\t�����\t�������\t\t\t����\t�������");
		for(CustVO a :list) {
			System.out.print(a.getNum()+"\t"+a.getName()+"\t"+a.getTel()+"\t\t"+a.getOffice()+"\t");
			System.out.println(a.getBirthday().substring(0,10)+"\t\t"+a.getSex()+"\t"+a.getIndate());
		}
	}
	
	public void NewCustom(Scanner sc) {
		System.out.print("����ȣ  :");
		int num=sc.nextInt();
		System.out.print("��  ��  �� :");
		String name=sc.next();
		System.out.print("��  ��  ó :");
		String tel=sc.next();
		System.out.print("��       �� :");
		String addr=sc.next();
		System.out.print("��  ��  �� :");
		String office=sc.next();
		System.out.print("�������  :");
		String birthday=sc.next();
		System.out.print("��       �� :");
		String sex=sc.next();
		System.out.println("����Ͻðڽ��ϱ�?(y/n)");
		String yesno = sc.next();
		if(yesno.equalsIgnoreCase("y")) {
		int check=temp.NewCustomer(num, name, tel, addr, office, birthday, sex);
		if(check==1) System.out.println("��� ����");
		else System.out.println("��� ����");
		}
		else System.out.println("��� ���");
	}
	
	public void SearchCustomer(Scanner sc) {
		System.out.print("�˻��� ����:");
		String name=sc.next();
		CustVO a = temp.SearchCustomer(name);
		if(a==null) System.out.println("���� �������� �ʽ��ϴ�.");
		else {
		System.out.println("���� :"+a.getName());
		System.out.println("����ó :"+a.getTel());
		System.out.println("�ּ� :"+a.getAddr());
		System.out.println("����� :"+a.getOffice());
		System.out.println("������� :"+a.getBirthday());
		System.out.println("���� :"+a.getSex());
		System.out.println("������� :"+a.getIndate());
		}
	}
	
	public void UpdateCustomer(Scanner sc) {
		System.out.print("������ ���ϴ� ����ȣ:");
		int num=sc.nextInt();
		CustVO a = temp.SearchCustomer(num);
		if(a==null) System.out.println("���� �������� �ʽ��ϴ�.");
		else {
		System.out.print("��  ��  ó :");
		String tel=sc.next();
		System.out.print("��  ��  �� :");
		String office=sc.next();
		System.out.println("�����Ͻðڽ��ϱ�?(y/n)");
		String yesno = sc.next();
		if(yesno.equalsIgnoreCase("y")) {
		int check=temp.UpdateCustomer(num,tel,office);
		if(check==1) System.out.println("���� ����");
		else System.out.println("���� ����");
		}
		else System.out.println("���� ���");
		}
	}
	
	public void DeleteCustomer(Scanner sc) {
		System.out.print("������ ����ȣ:");
		int num=sc.nextInt();
		CustVO a = temp.SearchCustomer(num);
		if(a==null) System.out.println("���� �������� �ʽ��ϴ�.");
		else {
		System.out.println("���� :"+a.getName());
		System.out.println("����ó :"+a.getTel());
		System.out.println("�ּ� :"+a.getAddr());
		System.out.println("����� :"+a.getOffice());
		System.out.println("������� :"+a.getBirthday());
		System.out.println("���� :"+a.getSex());
		System.out.println("������� :"+a.getIndate());
		System.out.println("�����Ͻðڽ��ϱ�?(y/n)");
		String yesno = sc.next();
		if(yesno.equalsIgnoreCase("y")) {
		int check=temp.DleteCustomer(num);
		if(check==1) System.out.println("���� ����");
		else System.out.println("���� ����");
		}
		else System.out.println("���� ���");
		}
	}
	
	public boolean exit(Scanner sc) {
		System.out.println("���α׷��� �����Ͻðڽ��ϱ�?(y/n)");
		String yesno = sc.next();
		if(yesno.equalsIgnoreCase("y")) {
			return true;
		}
		else return false;
		
	}
}
