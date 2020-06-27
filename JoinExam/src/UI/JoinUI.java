package UI;

import java.util.List;
import java.util.Scanner;

import DAO.JoinDAO;
import VO.JoinVO;

public class JoinUI {

	// 목록
	public void select() {
		JoinDAO dao = new JoinDAO();
		System.out.println("==== 전체 회원 목록 ====");
		try {
			List<JoinVO> list = dao.select();
			System.out.println("전체 회원수 : " + list.size() + "명");

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println("아이디\t이름\t이메일\t등록일자");
			List<JoinVO> list = dao.select();
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getUserid() + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(list.get(x).getEmail() + "\t");
				System.out.println(list.get(x).getRegdate().substring(2, 10));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 등록
	public void insert(Scanner sc) throws Exception {
		JoinDAO dao = new JoinDAO();
		List<JoinVO> list = dao.search(sc, null);
		System.out.println("==== 회원정보 등록 ====");

		while (true) {
			System.out.println("아이디 :");
			String userid = sc.next();
			for (int x = 0; x < list.size(); x++) {
				if (list.get(x).getUserid().equals(userid)) {
					System.out.println("이미 사용중인 아이디입니다.");
					break;
				}
			}
			System.out.println("이름 :");
			String name = sc.next();
			System.out.println("패스워드 :");
			String passwd = sc.next();
			System.out.println("이메일 :");
			String email = sc.next();
			System.out.println("나이 :");
			int age = sc.nextInt();

			System.out.println("등록하시겠습니까(y/n) ? --> 등록후 메인 메뉴로 이동");

			if (sc.next().equalsIgnoreCase("y")) {
				dao.insert(userid, name, passwd, email, age);
				break;
			} else {
				continue;
			}
		}
	}
	//로그
	public void login(Scanner sc) throws Exception {
		JoinDAO dao = new JoinDAO();
		List<JoinVO> idlist = dao.id();
		List<JoinVO> passlist = dao.pass();
		boolean login = false;
		boolean okidoki = false;
		int cnt = 0;
		System.out.println("==== 로그인 ====");
		while (okidoki == false) {
			System.out.println("아이디 :");
			String userid = sc.next();
			for (int x = 0; x < idlist.size(); x++) {
				if (idlist.get(x).getUserid().equals(userid)) {
					System.out.println("okidoki");
					login = true;
					break;
				} else {
					System.out.println("등록된 아이디가 없습니다.");
					cnt++;
				}
			}
			if (login == true) {
				System.out.println("패스워드 :");
				String passwd = sc.next();
				int a = 0;
				for (int y = 0; y < passlist.size(); y++) {
					if (passlist.get(y).getPasswd().equals(passwd)) {
						System.out.println("로그인 되었습니다");
						a++;
						break;
					} else {
						System.out.println("비밀번호가 맞지않습니다.");
						cnt++;
						okidoki = true;

					}
				}
				if (a > 0)
					break;
			}
			if(cnt ==3) {
				System.out.println("3번이상 틀렸습니다. 메인으로 이동합니다.");
				break;
			}
		}
	}

	// 검색
	public void search(Scanner sc) {
		JoinDAO dao = new JoinDAO();
		System.out.println("==== 회원 정보 검색 ====");
		while (true) {
			System.out.println("무엇을 검색하시겠습니까?");
			String a = sc.next();
			try {
				List<JoinVO> list = dao.search(sc, a);
				System.out.println(list.size());
				if (list.size() == 0) {
					System.out.println("존재하지 않는 아이디입니다.");
					System.out.println("검색을 다시할가요?(y/n)?");
					if (sc.next().equalsIgnoreCase("y")) {
						continue;
					} else {
						break;
					}
				}
				for (int x = 0; x < list.size(); x++) {
					System.out.print(list.get(x).getName() + "\t");
					System.out.print(list.get(x).getEmail() + "\t");
					System.out.print(list.get(x).getAge() + "\t");
					System.out.print(list.get(x).getRegdate().substring(0, 11) + "\t");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println();
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
		JoinDAO dao = new JoinDAO();
		System.out.println("==== 회원 정보 수정 ====");
		while (true) {
			System.out.println("무엇을 검색하시겠습니까?");
			String userid = sc.next();
			try {
				List<JoinVO> list = dao.search(sc, userid);
				System.out.println(list.size());
				System.out.println(list.get(0).getName());

				if (list.size() > 0) {
					System.out.println("이름 :" + list.get(0).getName());
					String name = sc.next();
					System.out.print("패스워드 :");
					for (int x = 0; x < list.get(0).getPasswd().length(); x++) {
						System.out.print("*");
					}
					String passwd = sc.next();
					System.out.println("이메일 :");
					System.out.println(list.get(0).getEmail());
					String email = sc.next();
					System.out.println("나이 :");
					System.out.println(list.get(0).getAge());
					int age = sc.nextInt();
					System.out.println("갱신할까요??(y/n)");
					if (sc.next().equalsIgnoreCase("y")) {
						dao.update(userid, name, passwd, email, age);
					} else {
						continue;
					}
				} else
					System.out.println("ssss");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	// 삭제
	public void delete(Scanner sc) throws Exception {
		JoinDAO dao = new JoinDAO();
		System.out.println("==== 회원 정보 삭제 ====");
		while (true) {
			System.out.println("삭제할 아이디를 입력 :");
			String userid = sc.next();
			List<JoinVO> list = dao.search(sc, userid);
			if(list.size()>0) {
				System.out.println(list.get(0).getName());
				System.out.println("삭제할까요??(y/n)");
				if (sc.next().equalsIgnoreCase("y")) {
					dao.delete(userid);
				} else {
					continue;
				} break;
			}else System.out.println("XXXX");
		
		}
	}

	public void exit(Scanner sc) {
		System.exit(0);
	}
}
