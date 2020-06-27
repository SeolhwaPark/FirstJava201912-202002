package user;
/*
 * 클래스배열을 이욯한 검색기능 구현
 
 회원정보입력
 회원이름
 회원 id
 이메일
 
 회원 전체정보출력
 고유번호 이름 id 이메일
 
 처리조건
 회원정보는 10명이며 입력값이 null이거나 "end"이면 입력된 회원정보를 모두 출력
 회원정보 입력시 아이디 중복은 불가 아이디 중복시 경고하고 다시입력  -> ?
 고유번호는 입력순에 맞게 자동으로 등록되도록 한다  
 회원정보출력시 객체이름으로 출력되도록 한다 메소드호출 불가   
 
 조회
 검색종료는 end 대소문자구분 없음
 검색 : ID 입력후 엔터
 존재하면 정보출력하고 없으면 해당정보없음 출력
 */
public class User implements Comparable<User>{
	String name; 
	String userId;
	String email;
	int goyu;

	User(String a){
		userId=a;
	}
	
	User(String name, String userId, String email ){
		this.name = name;
		this.userId = userId;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "고유번호:" +goyu + "\t성명:"+ name +"\tID:"+ userId + "\tE-Mail:"+email;
		
	}
	@Override
	public int compareTo(User o) {
		return userId.compareTo(o.userId);
	}
}
