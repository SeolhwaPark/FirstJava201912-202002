package rensyuu;

import java.util.regex.Pattern;

/*
 * 전화번호를 입력
 * 010-1234-1234
 * end (대소문자 관계없이) 종료 
 * 
 * 검색했을 때  1자리 이상 입력시 그 관련번호가 출력되야 한다
 * 이진검색 
 * 몇자리를 입력해도 출력되야 함.
 * 
 */
public class DenwaData {
	Denwa[] denwa;
	int cnt;
	
	DenwaData(){}
	
	DenwaData(Denwa[] denwa, int cnt){
		this.denwa = denwa;
		this.cnt = cnt;
	}
	
	void denwaPrint() {
		
	}
	
}