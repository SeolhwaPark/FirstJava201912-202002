package view;

import java.util.List;
import java.util.Scanner;

import model.DeptDAO;
import model.DeptVO;

//�޼ҵ�
public class UI {
	DeptDAO dao =new DeptDAO();
	
	//��� ����Ʈ
	public void deptView() {
		System.out.println("DNO\tDNAME\tLOC");
		//db
		List<DeptVO> list = dao.deptList();
		for(int x=0; x<list.size(); x++) {
			System.out.print(list.get(x).getDno()+"\t");
			System.out.print(list.get(x).getDname()+"\t");
			System.out.print(list.get(x).getLoc()+"\n");
		}
	}
	
	//���
	public void deptInsert(Scanner sc) {
		System.out.println("*�μ����� ���*");
		System.out.println("�μ���ȣ:");
		int dno = sc.nextInt();
		System.out.println("�μ���:");
		String dname= sc.next();
		System.out.println("������:");
		String loc= sc.next();
		//db ��� ó��
		dao.deptInsert(dno, dname, loc);
	}
	
	//����
	public void deptUpdate(Scanner sc) {
		System.out.println("*�μ����� ����*");
		System.out.println("�μ���ȣ:");
		int dno = sc.nextInt();
		System.out.println("�μ���:");
		String dname= sc.next();
		System.out.println("������:");
		String loc= sc.next();
		dao.deptUpdate(dno, dname, loc);
		
	}
	
	//�˻�	
	public void deptSearch(Scanner sc) {
		System.out.println("*�μ����� �˻�*");
		System.out.println("�μ���ȣ:");
		int dno = sc.nextInt();
		dao.deptSearch(dno);
		
	}
	
	//����
	public void deptDelete(Scanner sc) {
		System.out.println("*�μ����� ����*");
		System.out.println("�μ���ȣ:");
		int dno = sc.nextInt();
		dao.deptDelete(dno);
	
	}
}
