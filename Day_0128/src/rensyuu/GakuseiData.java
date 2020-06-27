package rensyuu;
/*
 * 출력예시
 * 
 * 객관식 채점 결과표
 * 
 * 성적배열
 * 번호	 이름 	1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 점슈
 * 
 * 정답비율 70% 정답의 배열
 */

public class GakuseiData {
	Gakusei[] seiseki;
	int[] ox = new int[20];
	int[] seikai = new int[20];
	int cnt =0;
	
	GakuseiData(){}
	
	GakuseiData(Gakusei[] seiseki, int[] sekai, int cnt){
		this.seiseki = seiseki;
		this.cnt = cnt;
		
		for(int i = 0; i<seikai.length; i++) {
			this.seikai[i] = seikai[i];
		}
	}
	
	void keisan() {
		//답지
		for(int x = 0 ; x<cnt; x++) {
			for(int y = 0; y<seikai.length; y++) {
				
			}
		}
	}
	

}
