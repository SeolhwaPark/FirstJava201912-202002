package mem;


/*

* 출력
* 이름 	전화 			 	성별 		나이
* 홍길동 	010-2242-3810	 남 	 	30
* 
* 'end'입력자료의 끝 , 출력형식이 맞게 출력
* 입력은 최대 10명
* 회원정보 Member클래스 , 회원정보 배열처리 클래스는 MemberData, 메인클래스는멤버 MemberExam
*/
public class MemberData {
	Member[] mem; // 회원정보의 배열이 들어간 클래스
	int cnt;
	
	MemberData(){}
	MemberData(Member[] m, int cnt){
		mem = m;
		this.cnt = cnt;
	}
	
	//출력테스트
	
	/*void testPrint() {
		System.out.println("이름\t주민번호\t전화번호");
		for(int x = 0 ; x<cnt; x++) {
			System.out.println(mem[x]);
		}
		System.out.println();
		for(int x = 0; x<cnt; x++) {
			System.out.println(mem[x].name + "\t" + mem[x].bangou );
		}
	}
	*/
	void memPrint() {
		System.out.println("이름\t전화번호\t성별\t나이");
		for(int x = 0; x<cnt; x++) {
			System.out.print(mem[x].name + "\t" + mem[x].bangou +"\t" );
			
			//성별,출생연도
			String str = mem[x].number.substring(7);
			
			int year = 0;
			if(str.equals("1")) {
				System.out.print("남\t" );
				year = 1900;
			}else if(str.equals("2")){
				System.out.print("여\t" );
				year = 1900;
			}else if(str.equals("3")){
				System.out.print("남\t" );
				year = 2000;
			}else if(str.equals("4")){
				System.out.print("여\t" );
				year = 2000;
			}else if(str.equals("5")){
				System.out.print("남\t" );
				year = 1900;
			}else if(str.equals("6")){
				System.out.print("여\t" );
				year = 1900;
			}else if(str.equals("7")){
				System.out.print("남\t" );
				year = 2000;
			}else if(str.equals("8")){
				System.out.print("여\t" );
				year = 2000;
			}
			int ydate = Integer.parseInt(mem[x].number.substring(0,2)); //생년
			int age = 2020 - (year+ydate); //나이계산
			System.out.print(age);
		}
	}
	
}
