package customer.view;

import java.util.*;
import java.util.Scanner;

import customer.model.CustDAO;
import customer.model.CustVO;
/*
***신규 고객 정보 등록***
고객명
연락처
주소
직장명
생년월일
성별

등록하시겠습니까(y/n)?
*/

public class CustUI {
	static CustDAO dao = new CustDAO();

	// [1] 고객 전체 목록
	public void custList() {
		List<CustVO> list = dao.custList();
		System.out.println("고객번호\t이름\t연락처\t\t직장명\t생년월일\t\t\t성별\t등록일자");
		for (CustVO a : list) {
			System.out.print(a.getNum() + "\t" + a.getName() + "\t" + a.getTel() +
					"\t\t" + a.getOffice() + "\t");
			System.out.println(a.getBirthday().substring(0, 10) + "\t\t" + 
					a.getSex() + "\t" + a.getIndate());
		}
	}

	// [2] 신규 고객 등록
	public void custInsert(Scanner sc) {
		System.out.print("고객번호  :");
		int num = sc.nextInt();
		System.out.print("고  객  명 :");
		String name = sc.next();
		System.out.print("연  락  처 :");
		String tel = sc.next();
		System.out.print("주       소 :");
		String addr = sc.next();
		System.out.print("직  장  명 :");
		String office = sc.next();
		System.out.print("생년월일  :");
		String birthday = sc.next();
		System.out.print("성       별 :");
		String sex = sc.next();
		System.out.println("등록하시겠습니까?(y/n)");
		String yesno = sc.next();
		if (yesno.equalsIgnoreCase("y")) {
			int check = dao.custInsert(num, name, tel, addr, office, birthday, sex);
			if (check == 1)
				System.out.println("등록 성공");
			else
				System.out.println("등록 실패");
		} else
			System.out.println("등록 취소");
	}

	// [3] 고객 검색
	public void custSearch(Scanner sc) {
		System.out.println("	***고객 정보 검색***");

		System.out.print("원하는 고객의 이름을 입력하세요?");
		String name = sc.next();
		CustVO a = dao.custSearch(name);
		if (a == null)
			System.out.println("고객이 존재하지 않습니다.");
		else {
			System.out.println("고객명 :" + a.getName());
			System.out.println("연락처 :" + a.getTel());
			System.out.println("주소 :" + a.getAddr());
			System.out.println("직장명 :" + a.getOffice());
			System.out.println("생년월일 :" + a.getBirthday());
			System.out.println("성별 :" + a.getSex());
			System.out.println("등록일자 :" + a.getIndate());
		}
	}

	// [4] 고객 정보 수정
	public void custUpdate(Scanner sc) {
		System.out.println("	***고객 정보 수정***");
		System.out.print("원하는 고객의 번호를 입력하세요?");
		int num = sc.nextInt();
		CustVO a = dao.custSearch(num);
		if (a == null)
			System.out.println("고객이 존재하지 않습니다.");
		else {
			System.out.print("연  락  처 :");
			String tel = sc.next();
			System.out.print("직  장  명 :");
			String office = sc.next();
			System.out.println("수정하시겠습니까?(y/n)");
			String yesno = sc.next();
			if (yesno.equalsIgnoreCase("y")) {
				int check = dao.custUpdate(num, tel, office);
				if (check == 1)
					System.out.println("수정 성공");
				else
					System.out.println("수정 실패");
			} else
				System.out.println("수정 취소");
		}
	}

	// [5] 고객 정보 삭제
	public void custDelete(Scanner sc) {
		System.out.println("	***고객 정보 삭제***");
		System.out.print("삭제할 고객번호:");
		int num = sc.nextInt();
		CustVO a = dao.custSearch(num);
		if (a == null)
			System.out.println("고객이 존재하지 않습니다.");
		else {
			System.out.println("고객명 :" + a.getName());
			System.out.println("연락처 :" + a.getTel());
			System.out.println("주소 :" + a.getAddr());
			System.out.println("직장명 :" + a.getOffice());
			System.out.println("생년월일 :" + a.getBirthday());
			System.out.println("성별 :" + a.getSex());
			System.out.println("등록일자 :" + a.getIndate());
			System.out.println("삭제하시겠습니까?(y/n)");
			String yesno = sc.next();
			if (yesno.equalsIgnoreCase("y")) {
				int check = dao.custDelete(num);
				if (check == 1)
					System.out.println("삭제 성공");
				else
					System.out.println("삭제 실패");
			} else
				System.out.println("삭제 취소");
		}
	}

	// [6] 종료
	public boolean custExit(Scanner sc) {
		System.out.println("프로그램을 종료하시겠습니까?(y/n)");
		String yesno = sc.next();
		if (yesno.equalsIgnoreCase("y")) {
			return true;
		} else
			return false;

	}
}
