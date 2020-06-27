package VIEW;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import MODEL.DAO;
import MODEL.VO;

public class UI {
	// 전체목록
	public void select() {
		DAO dao = new DAO();
		System.out.println("==== 전체 회원 목록 ====");
		try {
			List<VO> list = dao.select();
			System.out.println("전체 회원 수:" + list.size() + "명");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			List<VO> list = dao.select();
			System.out.println("아이디\t이름\t이메일\t등록일");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getId() + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(list.get(x).getEmail() + "\t");
				System.out.print(list.get(x).getRegdate() + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 회원등록
	public void insert(Scanner sc) throws Exception {
		DAO dao = new DAO();
		System.out.println("==== 회원 정보 등록 ====");
		String id = null;
		List<VO> list = dao.search(sc, id);
		try {
			while (true) {
				System.out.println("아이디:");
				id = sc.next();
				for (int x = 0; x < list.size(); x++) {
					if (list.get(x).getId().equals(id)) {
						System.out.println("이미 사용중인 아이디입니다.");
						break;
					}
				}
				System.out.println("이름:");
				String name = sc.next();
				System.out.println("패스워드");
				String passwd = sc.next();
				System.out.println("이메일");
				String email = sc.next();
				System.out.println("전화번호");
				String tel = sc.next();
				System.out.println("주소");
				String address = sc.next();
				System.out.println("나이");
				int age = sc.nextInt();

				System.out.println("등록하시려구요?(y/n)? ->등록후 메인으로 이동");
				if (sc.next().equalsIgnoreCase("y")) {
					dao.insert(id, name, passwd, email, tel, address, age);
					break;
				} else
					continue;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 로그인
	public void login(Scanner sc) throws Exception {
		DAO dao = new DAO();
		List<VO> testid = dao.testId();
		List<VO> testpw = dao.testPasswd();
		boolean login = false;
		boolean ok = false;
		int cnt = 0;
		System.out.println("==== 로그인 ====");
		while (ok == false) {
			System.out.println("아이디:");
			String id = sc.next();
			for (int x = 0; x < testid.size(); x++) {
				if (testid.get(x).getId().equals(id)) {
					System.out.println("ok");
					login = true;
					break;
				} else {
					System.out.println("등록된 아이디가 없읍니다");
					cnt++;
				}

			}

			if (login == true) {
				System.out.println("패스워드:");
				String passwd = sc.next();
				int cntt = 0;
				for (int x = 0; x < testpw.size(); x++) {
					if (testpw.get(x).equals(passwd)) {
						System.out.println("로그인 되었습니다!");
						cntt++;
						break;
					} else {
						System.out.println("비밀번호가 일치하지 않습니다");
						cnt++;
						ok = true;
					}
				}

				if (cntt > 0)
					break;
				if (cnt == 3) {
					System.out.println("3번이상 틀렸습니다. 메인으로 돌아갑니다.");
					break;
				}
			}

		}
	}

	// 검색
	public void search(Scanner sc) {
		System.out.println("==== 회원 정보 검색 ====");
		DAO dao = new DAO();
		while (true) {
			System.out.println("무엇을 검색하시겠습니까?");
			String id = sc.next();
			try {
				List<VO> list = dao.search(sc, id);
				System.out.println(list.size());
				if (list.size() == 0) {
					System.out.println("존재하지 않는 아이디입니다.");
					System.out.println("다시 검색하시겠습니까?");
					if (sc.next().equalsIgnoreCase("y"))
						continue;
					else
						break;
				}
				for (int x = 0; x < list.size(); x++) {
					System.out.print(list.get(x).getName() + "\t");
					System.out.print(list.get(x).getEmail() + "\t");
					System.out.print(list.get(x).getTel() + "\t");
					System.out.print(list.get(x).getAddress() + "\t");
					System.out.print(list.get(x).getAge() + "\t");
					System.out.print(list.get(x).getRegdate() + "\n");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("검색을 계속 하시겠습니까?");
			if (sc.next().equalsIgnoreCase("y"))
				continue;
			else
				break;
		}
	}

	// 수정
	public void update(Scanner sc) {
		System.out.println("==== 회원 정보 수정 ====");
		DAO dao = new DAO();
		while(true) {
			System.out.println("수정할 아이디를 입력하세요??");
			String id = sc.next();
			try {
				List<VO> list = dao.search(sc, id);
				System.out.println(list.size());
				for(int x=0; x<list.size(); x++) {
					System.out.println(list.get(x).getName());
					System.out.println(list.get(x).getEmail());
					System.out.println(list.get(x).getTel());
					System.out.println(list.get(x).getAddress());
					System.out.println(list.get(x).getAge());
				}
				if(list.size() >0) {
					System.out.println("이름:" + list.get(0).getName());
					String name = sc.next();
					System.out.println("패스워드:");
					for(int y=0; y<list.get(0).getPasswd().length(); y++) {
						System.out.print("*");
					}
					System.out.println("이메일:" + list.get(0).getEmail());
					String email = sc.next();
					System.out.println("전화번호:" + list.get(0).getTel());
					String tel = sc.next();
					System.out.println("주소:" + list.get(0).getAddress());
					String address = sc.next();
					System.out.println("나이:" + list.get(0).getAge());
					int age = sc.nextInt();
				}
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}



	// 삭제
	public void delete() {
		System.out.println("==== 회원 정보 삭제 ====");
		DAO dao = new DAO();

	}

	// 끝내기
	public void exit() {

	}
}
