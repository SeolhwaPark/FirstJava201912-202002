package UI;

import java.util.List;
import java.util.Scanner;

import DAO.studentDAO;
import VO.StudentVO;

public class StudentUI {
	// 학생정보입력//
	public void insert(Scanner sc) throws Exception {
		studentDAO dao = new studentDAO();
		List<StudentVO> list = dao.select();
		System.out.println("[1-1]학생정보입력");

		while (true) {
			System.out.println("학     번 :");
			int bun = sc.nextInt();
			if (bun == 0000)
				break;
			for (int x = 0; x < list.size(); x++) {
				if (list.get(x).getBun() == bun) {
					System.out.println("이미 사용중인 학번입니다.");
					break;

				} else if (list.size() - 1 == x) {
					System.out.println("이     름 :");
					String name = sc.next();
					System.out.println("주     소 :");
					String addr = sc.next();
					System.out.println("전     화 :");
					String email = sc.next();
					System.out.println("생년월일 :");
					String birth = sc.next();

					System.out.println("등록하시겠습니까(y/n)");
					if (sc.next().equalsIgnoreCase("y")) {
						dao.insert(bun, name, addr, email, birth);
						System.out.println("학생정보가 등록되었습니다");

						System.out.println("계속 등록하시겠습니까?(y/n)");
						if (sc.next().equalsIgnoreCase("y")) {
							continue;
						} else {
							break;
						}
					} else {
						System.out.println("학생정보가 등록 취소되었습니다");
						break;
					}
				}
			}
		}
	}

	public void select() {
		studentDAO dao = new studentDAO();
		System.out.println("[1-2]학생정보 조회");
		try {
			List<StudentVO> list = dao.select();
			System.out.println("총 " + list.size() + "명의 학생을 조회합니다.");
			System.out.println("학번\t이름\t전화\t나이");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getBun() + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(list.get(x).getEmail() + "\t");
				String s = list.get(x).getBirth().substring(0, 4);
				int a = 2021 - Integer.parseInt(s);
				System.out.println(a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 학생정보검색//

	public void search(Scanner sc) {
		studentDAO dao = new studentDAO();
		boolean a = false;
		while (a == false) {
			System.out.println("[1-3]학생정보 검색");
			System.out.println("<학생정보 검색>");
			System.out.println("1.이름으로 검색");
			System.out.println("2.학번으로 검색");
			System.out.println("3.학년으로 검색");
			System.out.println("4.검색 취소");
			System.out.print("선택:");

			switch (sc.nextInt()) {
			case 1: {
				this.searchName(sc);
				break;
			}
			case 2: {
				this.searchBun(sc);
				break;
			}
			case 3: {
				this.searchHak(sc);
				break;
			}
			case 4: {
				this.searchCan(sc);
				a = true;
				break;
			}
			}
		}
	}

	// 이름검색//
	public void searchName(Scanner sc) {
		System.out.println("[1-3-1]이름으로 검색");
		studentDAO dao = new studentDAO();
		System.out.print("이름:");
		String name = sc.next();
		System.out.println("학번\t이름\t학년\t주소\t전화\t나이");
		try {
			List<StudentVO> list = dao.searchName(name);
			if (list.size() == 0)
				System.out.println("존재하지 않는 이름입니다.");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getBun() + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(Integer.toString(list.get(x).getBun()).substring(0, 1) + "\t");
				System.out.print(list.get(x).getAddr() + "\t");
				System.out.print(list.get(x).getEmail() + "\t");
				System.out.print(list.get(x).getBirth() + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 학번검색//
	public void searchBun(Scanner sc) {
		System.out.println("[1-3-2]학번으로 검색");
		studentDAO dao = new studentDAO();
		System.out.println("학번:");
		String bun = sc.next();
		System.out.println("학번\t이름\t주소\t전화\t나이");
		try {
			List<StudentVO> list = dao.searchBun(bun);
			if (list.size() == 0)
				System.out.println("존재하지 않는 학번입니다.");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getBun() + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(list.get(x).getAddr() + "\t");
				System.out.print(list.get(x).getEmail() + "\t");
				System.out.print(list.get(x).getBirth() + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 학년검색//
	public void searchHak(Scanner sc) {
		System.out.println("[1-3-3]학년으로 검색");
		studentDAO dao = new studentDAO();
		System.out.println("학년:");
		String bun = sc.next() + "%";
		System.out.println("학번\t이름\t주소\t전화\t나이");
		try {
			List<StudentVO> list = dao.searchHak(bun);
			if (list.size() == 0)
				System.out.println("존재하지 않는 학년입니다.");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(Integer.toString(list.get(x).getBun()).substring(0, 1) + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(list.get(x).getAddr() + "\t");
				System.out.print(list.get(x).getEmail() + "\t");
				System.out.print(list.get(x).getBirth() + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 취소//
	public void searchCan(Scanner sc) {
		System.out.println("[1-3-4]검색 취소");
		System.out.println("취소되었습니다.");
	}

	// 수정//
	public void update(Scanner sc) {
		System.out.println("[1-4]학생정보 수정");
		studentDAO dao = new studentDAO();
		while (true) {
			System.out.println("수정할 학번을 입력하세요?");
			String bun = sc.next();
			if (bun.equals("0000"))
				break;
			try {
				List<StudentVO> list = dao.searchBun(bun);
				if (list.size() > 0)
					for (int x = 0; x < list.size(); x++) {
						if (list.get(x).getBun() == Integer.parseInt(bun)) {
							System.out.print("이름 :");
							String name = sc.next();
							System.out.print("주소 :");
							String addr = sc.next();
							System.out.print("전화 :");
							String email = sc.next();
							System.out.print("생년월일 :");
							String birth = sc.next();
							System.out.println("갱신할까요??(y/n)");
							if (sc.next().equalsIgnoreCase("y")) {
								int a = dao.update(bun, name, addr, email, birth);
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

	// 학생정보삭제//
	public void delete(Scanner sc) throws Exception {
		System.out.println("[1-5]학생정보 삭제");
		studentDAO dao = new studentDAO();
		while (true) {
			System.out.print("삭제할 번호:");
			String bun = sc.next();
			List<StudentVO> list = dao.searchBun(bun);
			if (list.size() > 0) {
				System.out.println("삭제할까요??(y/n)");
				if (sc.next().equalsIgnoreCase("y")) {
					dao.delete(bun);
					System.out.println("학생정보가 삭제되었습니다.");
					break;
				} else {
					break;
				}

			} else
				System.out.println("존재하지 않는 번호입니다.");

		}
	}

	// 끝내기
	public void exit(Scanner sc) {
		System.exit(0);
	}
}
