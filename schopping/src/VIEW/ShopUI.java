package VIEW;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import MODEL.ShopDAO;
import MODEL.ShopVO;

public class ShopUI {
//	 [1] 회원정보 등록
	public void Insert(Scanner sc) throws Exception {
		String phonepat = "(010|011)-\\d{3,4}-\\d{4}";
		ShopDAO dao = new ShopDAO();
		List<ShopVO> list = dao.Select();
		System.out.println("[1]회원정보 등록");
		boolean flag = false;
		while (true) {
			String custno;
			while (true) {
				System.out.println("회원번호 :");
				custno = sc.next();
				if (Pattern.matches("[0-9]{6}", custno)) {
					break;
				} else
					System.out.println("회원번호 6자리를 입력하세요.");
			}
			for (int x = 0; x < list.size(); x++) {
				if (list.get(x).getCustno() == Integer.parseInt(custno)) {
					System.out.println("이미 사용중인 번호입니다.");
					break;

				} else if (list.size() - 1 == x) {

					System.out.println("회원이름 :");
					String custname = sc.next();
					
					String phone ;
					while(true) {
						System.out.println("연 락 처 :");
						phone = sc.next();
						if(Pattern.matches(phonepat, phone)) {
							break;
						}else {
							System.out.println("잘못된 휴대폰 번호 다시 입력하세요");
							continue;
							
						}
					}
					

					String gender;
					while(true) {
						System.out.println("성별(M/F) :");
						gender = sc.next().toUpperCase();
						if(Pattern.matches("M?F?{1}", gender))
							break;
						else System.out.println("성별은 M 또는 F만 입력가능합니다");
					}
					
					String grade;
					while(true) {
						System.out.println("회원등급(A/B/C) :");
						grade = sc.next().toUpperCase();
						if(Pattern.matches("A?B?C?{1}", grade))
							break;
						else System.out.println("회원등급은 A,B,C중 한글자만 입력가능합니다");
					}

					System.out.println("등록하시겠습니까(y/n)");
					if (sc.next().equalsIgnoreCase("y")) {
						dao.Insert(Integer.parseInt(custno), custname, phone, gender, grade);
						System.out.println("회원정보가 등록되었습니다");

						System.out.println("계속 등록하시겠습니까?(y/n)");
						if (sc.next().equalsIgnoreCase("y")) {
							continue;
						} else {
							flag = true;
							break;
						}
					} else {
						System.out.println("학생정보가 등록 취소되었습니다");
						flag = true;
						break;
					}
				}
			}
			if (flag)
				break;
		}

	}

//	 [2] 회원정보현황 조회
	public void Select() {
		ShopDAO dao = new ShopDAO();
		System.out.println("[2] 회원정보현황 조회");
		try {
			List<ShopVO> list = dao.Select();
			System.out.println("회원번호\t이름\t연락처\t\t성별\t가입일자\t\t회원등급");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getCustno() + "\t");
				System.out.print(list.get(x).getCustname() + "\t");
				System.out.print(list.get(x).getPhone() + "\t");
				
				if(list.get(x).getGender().equals("M")) System.out.print("남"+ "\t");
				else System.out.print("여"+ "\t");
				if(list.get(x).getJoindate()==null) {
					System.out.print("\t\t");
				}else {
					System.out.print(list.get(x).getJoindate().substring(0,10)+"\t");
				}
				if(list.get(x).getGrade().equals("A"))System.out.print("VIP" + "\n");
				else if(list.get(x).getGrade().equals("B"))System.out.print("일반" + "\n");
				else System.out.println("직원");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//	 [3] 회원정보 수정
	public void Update(Scanner sc) {
		System.out.println("[3]회원정보 수정");
		ShopDAO dao = new ShopDAO();
		while (true) {
			System.out.println("수정할 회원번호를 입력하세요?");
			String custno = sc.next();
			int per = 0;
			try {
				List<ShopVO> list = dao.Select();
				if (list.size() > 0)
					for (int x = 0; x < list.size(); x++) {
						if (list.get(x).getCustno() == Integer.parseInt(custno)) {
							per = x;
							System.out.print("고객성명 (" + list.get(per).getCustname() + "):");
							String custname = sc.next();
							System.out.print("연락처 (" + list.get(per).getPhone() + "):");
							String phone = sc.next();
							System.out.print("성별 (" + list.get(per).getGender() + "):");
							String gender = sc.next();
							System.out.print("회원등급 (" + list.get(per).getGrade() + "):");
							String grade = sc.next();

							System.out.println("갱신할까요??(y/n)");
							if (sc.next().equalsIgnoreCase("y")) {
								int a = dao.Update(custno, custname, phone, gender, grade);
								System.out.println("학생정보가 수정되었습니다.");
								break;
							} else {
								break;
							}
						}
					}
				else {
					System.out.println("회원정보가 존재하지 않습니다.");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
	}

//	 [4] 회원정보 삭제
	public void Delete(Scanner sc) throws Exception {
		System.out.println("[4]회원정보 삭제");
		ShopDAO dao = new ShopDAO();
		while (true) {
			boolean flag = false;
			int per = 0;
			List<ShopVO> list = dao.Select();
			System.out.print("회원번호:");
			int custno = sc.nextInt();
			for (int x = 0; x < list.size(); x++) {
				if (list.get(x).getCustno() == custno) {
					flag = true;
					per = x;
					break;
				}
			}
			if (flag) {
				System.out.println("고객성명(" + list.get(per).getCustname() + ")");
				System.out.println("연락처(" + list.get(per).getPhone() + ")");
				System.out.println("성별(" + list.get(per).getGender() + ")");
				System.out.println("회원등급(" + list.get(per).getGrade() + ")");
				System.out.println("삭제할까요??(y/n)");
				if (sc.next().equalsIgnoreCase("y")) {
					dao.Delete(custno);
					System.out.println("회원정보가 삭제되었습니다.");
					break;
				} else {
					break;
				}
			} else
				System.out.println("존재하지 않는 번호입니다.");
		}
	}
	
	
	public void date() {
		
	}
}
