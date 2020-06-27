package view;

import java.util.List;
import java.util.Scanner;

import model.DeptDAO;
import model.DeptVO;

//메소드
public class UI {
	DeptDAO dao =new DeptDAO();
	
	//목록 리스트
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
	
	//등록
	public void deptInsert(Scanner sc) {
		System.out.println("*부서정보 등록*");
		System.out.println("부서번호:");
		int dno = sc.nextInt();
		System.out.println("부서명:");
		String dname= sc.next();
		System.out.println("지역명:");
		String loc= sc.next();
		//db 등록 처리
		dao.deptInsert(dno, dname, loc);
	}
	
	//수정
	public void deptUpdate(Scanner sc) {
		System.out.println("*부서정보 수정*");
		System.out.println("부서번호:");
		int dno = sc.nextInt();
		System.out.println("부서명:");
		String dname= sc.next();
		System.out.println("지역명:");
		String loc= sc.next();
		dao.deptUpdate(dno, dname, loc);
		
	}
	
	//검색	
	public void deptSearch(Scanner sc) {
		System.out.println("*부서정보 검색*");
		System.out.println("부서번호:");
		int dno = sc.nextInt();
		dao.deptSearch(dno);
		
	}
	
	//삭제
	public void deptDelete(Scanner sc) {
		System.out.println("*부서정보 삭제*");
		System.out.println("부서번호:");
		int dno = sc.nextInt();
		dao.deptDelete(dno);
	
	}
}
