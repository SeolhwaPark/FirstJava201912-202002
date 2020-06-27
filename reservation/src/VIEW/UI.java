package VIEW;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import MODEL.DAO;
import MODEL.VO;

public class UI {

//	 [1] 도서 대출 예약 등록
	public void Insert(Scanner sc) throws Exception {
		DAO dao = new DAO();
		List<VO> list = dao.select();
		System.out.println("[1] 도서 대출예약 등록");
		boolean number = false;
		int cnt = 0;
		while (true) {
			System.out.println("대출번호 :");
			int lentno = sc.nextInt();
			for (int x = 0; x < list.size(); x++) {
				if (list.get(x).getLentno()==lentno) {
					System.out.println("이미 등록된 고객번호입니다.");
					number = true;
					break;
				} else {
					System.out.println("사용 가능한 고객번호입니다.");
					cnt++;
				}
			}
			System.out.println("고객성명 :");
			String custname = sc.next();
			System.out.println("연 락 처 :");
			String phone = sc.next();
			System.out.println("도서코드 :");
			int bookno = sc.nextInt();
			System.out.println("대출일자 :");
			String outdate = sc.next();
			System.out.println("반납일자 :");
			String indate = sc.next();
			
			System.out.println("등록합니다(y/n) ?");
			if (sc.next().equalsIgnoreCase("y")) {
				dao.Insert(lentno, custname, bookno, phone, outdate, indate);
			} else 
				continue;
			break;
			
		}
	}

//	 [2] 도서 대출 현황 조회
	public void Select() {
		DAO dao = new DAO();
		System.out.println("	도서 대출 현황 조회");
		try {
			System.out.println("대출번호\t고객성명\t전화번호\t도서코드\t대출일자\t반납일자\t대출상태");
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

//	 [3] 도서 대출 예약 수정
	public void update(Scanner sc) {
		DAO dao = new DAO();
		System.out.println("도서 대출 예약 수정");
		while (true) {
			System.out.println("대출번호:");
			int lentno = sc.nextInt();
			try {
				List<VO> list = dao.select();
				if (list.size() > 0) {
					System.out.println("고객성명:");
					System.out.println(list.get(0).getCustname());
					String custname = sc.next();
					System.out.print("연 락 처:");
					System.out.println(list.get(0).getPhone());
					String phone = sc.next();
					System.out.println("도서코드:");
					System.out.println(list.get(0).getBookno());
					int bookno = sc.nextInt();
					System.out.println("대출일자:");
					System.out.println(list.get(0).getOutdate());
					String outdate = sc.next();
					System.out.println("반납일자:");
					System.out.println(list.get(0).getIndate());
					String indate = sc.next();

					System.out.println("수정합니다(y/n)?");
					if (sc.next().equalsIgnoreCase("y")) {
						dao.update(lentno, custname, phone, bookno, outdate, indate);
					} else {
						continue;
					}
				} else
					System.out.println("수정에 실패하였습니다.");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

//	 [4] 도서 대출 반납 등록
	public void Return(Scanner sc) throws Exception {
		DAO dao = new DAO();
		System.out.println("[4] 도서 대출반납 등록");
		while (true) {
			System.out.println("대출번호 :");
			int lentno = sc.nextInt();

			String status;
			while (true) {
				System.out.println("코드정보 대출(1),반납(2)");
				System.out.println("상태코드 :");
				status = sc.next();
				List<VO> list = dao.select();
				if (list.size() == 0) {
					System.out.println("존재하지 않는 코드입니다.");
					continue;
				}
				break;
			}
			System.out.println("등록합니다(y/n) ?");
			if (sc.next().equalsIgnoreCase("y")) {
				dao.Return(status);
			} else {
				continue;
			}
		}
	}

}
