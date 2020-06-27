package mem;
/*
* nextLine 공백이 있어도 엔터를 칠 때 까지..
* 
* 
* 입력
* 자료입력 : 홍길동, 900206-1, 010-2242-3810

*비고 1 spilt 2.substring
* Integer.parseInt 문자를 정수로
*
* 처리조건
* 입력은 1라인씩 입력
* 
* 성별체크
* 1900~1999 1남2여 2000~2099 3남4여
* 외국인 5,6 / 7,8
* 
* 출력
* 이름 	전화 			 	성별 		나이
* 홍길동 	010-2242-3810	 남 	 	30
* 
* 'end'입력자료의 끝 , 출력형식이 맞게 출력
* 입력은 최대 10명
* 회원정보 Member클래스 , 회원정보 배열처리 클래스는 MemberData, 메인클래스는멤버 MemberExam
*/
public class Member {
	String name; //이름
	String number; //주민번호
	String bangou; //전화
	
	Member(){
	}
	
	Member(String name, String number,String bangou){
		this.name = name;
		this.number = number;
		this.bangou = bangou;
	}
	
	public String toString() { 
		return name + "\t " + number + "\t" + bangou;
	}
	
}
