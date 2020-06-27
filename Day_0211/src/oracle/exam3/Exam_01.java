package oracle.exam3;

import java.util.Scanner;

import oracle.dao.SawonDAO;
import oracle.dto.EmpVO;

/*
 * 키보드로 부서번호,직급을 입력받음
 * 해당 사원 정보출력
 */
public class Exam_01 {
	public static void main(String[] args) {
		SawonDAO dao = new SawonDAO();
		Scanner scn = new Scanner(System.in);
		System.out.print("부서번호:");
		int dno = scn.nextInt();
		System.out.print("직급:");	
		String job = scn.next();
		
		EmpVO vo = dao.selectEmp(dno,job);
		System.out.println();
		if(vo != null) { 
			System.out.println("사원번호"+ vo.getEno());
			System.out.println("사원이름"+ vo.getEname() );
			System.out.println("업무명"+vo.getJob());
			System.out.println("상사번호"+vo.getManager());
			System.out.println("입사일"+vo.getHiredate());
			System.out.println("커밋션"+vo.getCommission());
			System.out.println("부서번호"+vo.getDno());
		}else {
			System.out.println("등록된 자료가 없습니다");
		}
		
		
		
	}
	

}
