package VIEW;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import MODEL.DAO;
import MODEL.VO;
import MODEL.VO2;

public class UI {
	// 목록
	public void select() {
		DAO dao = new DAO();
		try {
			List<VO> list = dao.select();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			Calendar c1 = Calendar.getInstance();
			String strToday = sdf.format(c1.getTime());
			System.out.println("사원번호\t이름\t업무명1\t  상사번호\t입사일자\t\t급여\t커미션\t부서명");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getEno() + "\t");
				System.out.print(list.get(x).getEname() + "\t");
				System.out.print(list.get(x).getJob() + "\t");
				System.out.print(list.get(x).getManager() + "\t");

				if (list.get(x).getHiredate().length() > 0)
					System.out.print(strToday + "\t");

				if (list.get(x).getSalary() > 0)
					System.out.print(list.get(x).getSalary() + "\t");
				else
					System.out.print("" + "\t");

				if (list.get(x).getCommission() > 0)
					System.out.print(list.get(x).getCommission() + "\t");
				else
					System.out.print("" + "\t");

				System.out.println(list.get(x).getDname());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 등록
	public void insert(Scanner sc) throws Exception {
		DAO dao = new DAO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Calendar c1 = Calendar.getInstance();
		String strToday = sdf.format(c1.getTime());

		System.out.println("	*** 신규 사원 정보 등록 ***");
		while (true) {
			System.out.println("사원이름 :");
			String ename = sc.next();
			System.out.println("업 무 명 :");
			String job = sc.next();
			System.out.println("상사번호 :");
			int manager = sc.nextInt();

			sc.nextLine();// 엔터받을때 그 전의 엔터를 없에줌
			System.out.println("입사일자(2019-05-02):");
			String hiredate = sc.nextLine();
			if (hiredate.length() >= 0)
				hiredate = strToday;

			System.out.println("급    여 :");
			int salary = sc.nextInt();

			System.out.println("커 미 션 :");
			int commission = sc.nextInt();

			int dno;
			while (true) {
				System.out.println("부서정보(10:ACCOUNTING, 20:RESEARCH, 30:SALES, 40:OPERATIONS)");
				System.out.println("부서번호 : ");
				dno = sc.nextInt(); // 입력받고
				List<VO> list = dao.searchNo(dno);
				if (list.size() == 0) { // 부서번호가 0이면
					System.out.println("존재하지 않는 번호입니다.");
					continue;
				}
				break;
			}
			
			System.out.println("등록하시겠습니까(y/n) ? --> 등록후 메인 메뉴로 이동");
			if (sc.next().equalsIgnoreCase("y")) {
				dao.insert(ename, job, manager, hiredate, salary, commission, dno);
			} else {
				continue;
			}
		}
	}

	// 이름검색
	public void search(Scanner sc) {
		DAO dao = new DAO();
		while (true) {
			System.out.println("무엇을 검색하시겠습니까?");
			String a = sc.next();
			try {
				List<VO> list = dao.searchName(a);
				System.out.println(list.size());
				if (list.size() == 0)
					System.out.println("존재하지 않는 이름입니다.");
				for (int x = 0; x < list.size(); x++) {
					System.out.print(list.get(x).getEno() + "\t");
					System.out.print(list.get(x).getEname() + "\t");
					System.out.print(list.get(x).getJob() + "\t");
					System.out.print(list.get(x).getDname2() + "\t");
					System.out.print(list.get(x).getHiredate().substring(0, 11) + "\t");
					System.out.print(list.get(x).getSalary() + "\t");
					System.out.print(list.get(x).getCommission() + "\t");
					System.out.print(list.get(x).getDname() + "\n");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("검색을 계속할가요?(y/n)?");
			if (sc.next().equalsIgnoreCase("y")) {
				continue;
			} else {
				break;
			}
		}
	}

	// 수정
	public void update(Scanner sc) {
		DAO dao = new DAO();
		System.out.println("	*** 신규 사원 정보 수정 ***");
		while (true) {
			System.out.println("사원이름 :");
			String ename = sc.next();
			System.out.println("업 무 명 :");
			String job = sc.next();
			System.out.println("상사번호 :");
			int manager = sc.nextInt();

			// 엔터누르면 오늘날짜가 자동으로 들어가게 하기
			sc.nextLine();
			System.out.println("입사일자(2019-05-02):");
			String hiredate = sc.nextLine();
			if (hiredate.length() >= 0)
				hiredate = "2020-03-01";

			System.out.println("급    여 :");
			int salary = sc.nextInt();
			System.out.println("커 미 션 :");
			int commission = sc.nextInt();
			System.out.println("부서정보(10:xxx, 20:yyyy, 30:dddd, 40:ssss)");
			System.out.println("부서번호 : ");
			int dno = sc.nextInt();
			System.out.println("갱신할까요??(y/n)");
			if (sc.next().equalsIgnoreCase("y")) {
				dao.update(ename, job, manager, hiredate, salary, commission, dno);
			} else {
				continue;
			}
		}
	}

	// 삭제
	public void delete(Scanner sc) {
		DAO dao = new DAO();
		while (true) {
			System.out.println("삭제할 번호를 입력 :");
			int eno = sc.nextInt();
			System.out.println("삭제할까요??(y/n)");
			if (sc.next().equalsIgnoreCase("y")) {
				dao.delete(eno);
			} else {
				continue;
			}
		}
	}
	public void exit(Scanner sc) {
		System.exit(0);
	}
}
