package rensyuu;

public class Loto {
	int[] game = new int[6]; //로또6자리
	int cnt; //입력수
	boolean bonasu = false; //보너스확인용
	String rank;//순위
	
	Loto(){} //생성자클래스
	
	Loto(int[] lotto){
		game = lotto;//Loto클래스배열에 게임용 숫자 6자리 넘기기
	}
	
}
