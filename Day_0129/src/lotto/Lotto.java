package lotto;
/*
 * 출력예시
 * 게임수 입력:2
 * 1 :23,10,17,35,40,7
 * 2 :10,19,30,32,38,22
 * 
 * 처리조건
 * 로또번호는 1~45숫자 중   임의 수 6개,숫자만 + 보너스 1개로 구성된다
 * ex) 38,27,10,4,40,17 -30
 * 
 * 사용자가 입력한 6개의 수치를 비교하여 당첨여부를 결정한다.
 * 1등 :보너스 번호를 제외한 6개 모두 맞추는 경우
 * 2등 :6개 중 5개를 맞추고 보너스번호와 일치한 수가 있을 경우
 * 3등 :보너스번호를 제외한 5개를 맞추는 경우
 * 4등 :보너스번호를 제외한 4개를 맞추는 경우
 * 5등 :보너스번호를 제외한 3개를 맞추는 경우
 * 
 * 게임결과
 * 당첨번호 : 10,19,22,28,34,40 - 보너스 7
 * 1 : 7,10,17,23,35,40 - 꽝
 * 2 :10,19,22,30,32,38 -5등
 */
public class Lotto {
	int game[] = new int[6];//게임수
	int cnt;
	boolean bonus = false; //보너스
	String rank; //순위
	
	Lotto(){}
	
	Lotto(int[] a){
		game = a; // 로또번호를 로또클래스에 넘겨줌
	}
	
}
