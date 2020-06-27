package VIEW;

import java.util.List;
import java.util.Scanner;

import MODEL.DAO;
import MODEL.VO;

/*
private int bun
private String name
private String sexual
private String cell
private String addr
private String birth
 */
public class UI {
	// 학생정보 입력
	public void insert(Scanner sc) throws Exception {
		DAO dao = new DAO();
		List<VO> list = dao.select();
		System.out.println("[1-1.학생정보 입력]");

//		while (true) {
//			System.out.println("학     번:");
//			int bun = sc.nextInt();
//			if (bun == 0000)
//				break;
//			for (int x = 0; x < list.size(); x++) {
//				if (list.get(x).getBun() == bun) {
//					System.out.println("이미 사용중인 번호입니다.");
//					break;
//
//				} else if (list.size() - 1 == x) {
//					System.out.println("이     름:");
//					String name = sc.next();
//					System.out.println("성     별:");
//					String sexual = sc.next();
//					System.out.println("전화번호:");
//					String cell = sc.next();
//					System.out.println("주     소:");
//					String addr = sc.next();
//					System.out.println("생년월일:");
//					String birth = sc.next();
//
//					System.out.println("등록하시겠습니까?(y/n)");
//					if (sc.next().equalsIgnoreCase("y")) {
//						dao.insert(bun, name, sexual, cell, addr, birth);
//						System.out.println("학생정보가 등록되었습니다.");
//
//						System.out.println("계속 등록하시겠습니까?(y/n)");
//						if (sc.next().equalsIgnoreCase("y"))
//							continue;
//						else
//							break;
//					}
//				} else {
//					System.out.println("정보가 등록이 취소되었습니다.");
//					break;
//				}
//			}
//		}
	}

	// 학생정보 전체조회
	public void select() {
		DAO dao = new DAO();
		System.out.println("[1-2.학생정보 전체조회]");
		try {
			List<VO> list = dao.select();
			System.out.println("현재 총 " + list.size() + "명의 학생정보가 존재합니다.");
			System.out.println("학번\t이름\t성별\t전화\t주소\t나이");

			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getBun() + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(list.get(x).getSexual() + "\t");
				System.out.print(list.get(x).getCell() + "\t");
				System.out.print(list.get(x).getAddr() + "\t");
				String birthday = list.get(x).getBirth().substring(0, 4);
				int tosi = (2020 - Integer.parseInt(birthday)) - 1;
				System.out.println(tosi);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 학생정보 검색
	public void search(Scanner sc) {
		DAO dao = new DAO();
		boolean a = false;
		while (a == false) {
			System.out.println("[1-3.학생정보 검색]");
			System.out.println("1.이름으로 검색");
			System.out.println("2.전화번호로 검색");
			System.out.println("3.학번으로 검색");
			System.out.println("4.주소로 검색");
			System.out.println("5.학년으로 검색");
			System.out.println("6.검색 취소");
			System.out.print("선택:");
			switch (sc.next()) {
			case "1": {
				this.searchName(sc);
				break;
			}
			case "2": {
				this.searchCell(sc);
				break;
			}
			case "3": {
				this.searchBun(sc);
				break;
			}
			case "4": {
				this.searchAddr(sc);
				break;
			}
			case "5": {
				this.searchHak(sc);
				break;
			}
			case "6": {
				this.searchCan(sc);
				a = true;
				break;
			}
			}
		}

	}

	// 이름
	public void searchName(Scanner sc) {
		System.out.println("[1-3-1.이름으로 검색]");
		DAO dao = new DAO();
		System.out.print("이름:");
		String name = sc.next();
		System.out.println("학번\t이름\t학년\t성별\t전화\t주소\t나이");
		try {
			List<VO> list = dao.searchName(name);
			if (list.size() == 0)
				System.out.println("존재하지 않는 이름입니다.");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getBun() + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(Integer.toString(list.get(x).getBun()).substring(0, 1) + "\t");
				System.out.print(list.get(x).getSexual() + "\t");
				System.out.print(list.get(x).getCell() + "\t");
				System.out.print(list.get(x).getAddr() + "\t");
				System.out.print(list.get(x).getBirth() + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 전화
	public void searchCell(Scanner sc) {
		System.out.println("[1-3-2.전화번호로 검색]");
		DAO dao = new DAO();
		System.out.print("전화번호:");
		String cell = sc.next();
		System.out.println("학번\t이름\t학년\t성별\t전화\t주소\t나이");
		try {
			List<VO> list = dao.searchCell(cell);
			if (list.size() == 0)
				System.out.println("존재하지 않는 전화번호입니다.");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getBun() + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(Integer.toString(list.get(x).getBun()).substring(0, 1) + "\t");
				System.out.print(list.get(x).getSexual() + "\t");
				System.out.print(list.get(x).getCell() + "\t");
				System.out.print(list.get(x).getAddr() + "\t");
				System.out.print(list.get(x).getBirth() + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 학번
	public void searchBun(Scanner sc) {
		System.out.println("[1-3-3.학번로 검색]");
		DAO dao = new DAO();
		System.out.print("학번:");
		String bun = sc.next();
		System.out.println("학번\t이름\t학년\t성별\t전화\t주소\t나이");
		try {
			List<VO> list = dao.searchBun(bun);
			if (list.size() == 0)
				System.out.println("존재하지 않는 전화번호입니다.");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getBun() + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(Integer.toString(list.get(x).getBun()).substring(0, 1) + "\t");
				System.out.print(list.get(x).getSexual() + "\t");
				System.out.print(list.get(x).getCell() + "\t");
				System.out.print(list.get(x).getAddr() + "\t");
				System.out.print(list.get(x).getBirth() + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 주소
	public void searchAddr(Scanner sc) {
		System.out.println("[1-3-4.주소로 검색]");
		DAO dao = new DAO();
		System.out.print("주소:");
		String addr = sc.next();
		System.out.println("학번\t이름\t학년\t성별\t전화\t주소\t나이");
		try {
			List<VO> list = dao.searchAddr(addr);
			if (list.size() == 0)
				System.out.println("존재하지 않는 전화번호입니다.");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getBun() + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(Integer.toString(list.get(x).getBun()).substring(0, 1) + "\t");
				System.out.print(list.get(x).getSexual() + "\t");
				System.out.print(list.get(x).getCell() + "\t");
				System.out.print(list.get(x).getAddr() + "\t");
				System.out.print(list.get(x).getBirth() + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 학년
	public void searchHak(Scanner sc) {
		System.out.println("[1-3-5.학년으로 검색]");
		DAO dao = new DAO();
		System.out.print("학년:");
		String bun = sc.next() + "%";
		System.out.println("학번\t이름\t학년\t성별\t전화\t주소\t나이");
		try {
			List<VO> list = dao.searchHak(bun);
			if (list.size() == 0)
				System.out.println("존재하지 않는 학년입니다.");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getBun() + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(Integer.toString(list.get(x).getBun()).substring(0, 1) + "\t");
				System.out.print(list.get(x).getSexual() + "\t");
				System.out.print(list.get(x).getCell() + "\t");
				System.out.print(list.get(x).getAddr() + "\t");
				System.out.print(list.get(x).getBirth() + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void searchCan(Scanner sc) {
		System.out.println("[1-3-6.검색 취소]");
		System.out.println("검색이 취소되었습니다.");
	}

	// 학생정보 수정
	public void update(Scanner sc) {
		System.out.println("[1-4.학생정보 수정]");
		DAO dao = new DAO();
		while (true) {
			System.out.println("수정할 학번을 입력하세영:");
			String bun = sc.next();
			if (bun.equals("0000"))
				break;
			try {
				List<VO> list = dao.searchBun(bun);
				if (list.size() > 0)
					for (int x = 0; x < list.size(); x++) {
						if (list.get(x).getBun() == Integer.parseInt(bun)) {
							System.out.println("이름:");
							String name = sc.next();
							System.out.println("성별:");
							String sexual = sc.next();
							System.out.println("전화번호:");
							String cell = sc.next();
							System.out.println("주소:");
							String addr = sc.next();
							System.out.println("생년월일:");
							String birth = sc.next();
							if (sc.next().equalsIgnoreCase("y")) {
								int a = dao.update(bun, name, sexual, cell, addr, birth);
								System.out.println("학생정보가 수정되었습니다.");
								break;
							} else {
								break;
							}
						}

					}
				else {
					System.out.println("학생정보가 존재하지 않습니다.");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}

	}

	// 학생정보 삭제
	public void delete(Scanner sc) throws Exception {
		System.out.println("[1-5.학생정보 삭제]");
		DAO dao = new DAO();
		while(true) {
			System.out.println("학생번호:");
			String bun = sc.next();
			List<VO> list = dao.searchBun(bun);
			if(list.size() > 0) {
				System.out.println("삭제할까요?(y/n)");
				if(sc.next().equalsIgnoreCase("y")) {
				dao.delete(bun);
				System.out.println("학생정보가 삭제되었습니다.");
				break;
			}else {
				break;
			}
		}else
			System.out.println("존재하지 않는 번호입니다.");
		}
	}

	// 메인화면
	public void exit() {
		System.out.println("[1-6.메인화면]");
		System.exit(0);
	}

}
