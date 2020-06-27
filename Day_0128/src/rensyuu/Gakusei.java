package rensyuu;
/*
 * 출력예시
 * 
 * 객관식 채점 결과표
 * 
 * 번호	 이름 	1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 점슈
 * 1  	홍기동	o x o x. . . .
 * 
 * 정답비율 70%
 */
public class Gakusei {
	int bangou;
	String name;
	int tensuu;
	String[] seiseki;
	int[] kotae;
	String[] ox;
	
	Gakusei(){}
	
	Gakusei(String[] gakuten){
		bangou = Integer.parseInt(gakuten[0]);
		name = gakuten[1];
	
		for(int i = 2; i<gakuten.length; i++) {
			kotae[i-2] = Integer.parseInt(gakuten[i]);		
		}
	}

}
