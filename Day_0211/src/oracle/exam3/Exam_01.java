package oracle.exam3;

import java.util.Scanner;

import oracle.dao.SawonDAO;
import oracle.dto.EmpVO;

/*
 * Ű����� �μ���ȣ,������ �Է¹���
 * �ش� ��� �������
 */
public class Exam_01 {
	public static void main(String[] args) {
		SawonDAO dao = new SawonDAO();
		Scanner scn = new Scanner(System.in);
		System.out.print("�μ���ȣ:");
		int dno = scn.nextInt();
		System.out.print("����:");	
		String job = scn.next();
		
		EmpVO vo = dao.selectEmp(dno,job);
		System.out.println();
		if(vo != null) { 
			System.out.println("�����ȣ"+ vo.getEno());
			System.out.println("����̸�"+ vo.getEname() );
			System.out.println("������"+vo.getJob());
			System.out.println("����ȣ"+vo.getManager());
			System.out.println("�Ի���"+vo.getHiredate());
			System.out.println("Ŀ�Լ�"+vo.getCommission());
			System.out.println("�μ���ȣ"+vo.getDno());
		}else {
			System.out.println("��ϵ� �ڷᰡ �����ϴ�");
		}
		
		
		
	}
	

}
