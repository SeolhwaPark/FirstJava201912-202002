
public class Exam_08 {
	public static void main(String[] args) {
		/*
		 * Math.random() -- > 0~10 사이의 난수
		 */
		int[] lotto = new int[6];
		for(int x=0; x<lotto.length; x++) {
			lotto[x] = (int)(Math.random()*45)+1;
		//중복쳍크
			for(int y=0; y<x; y++) { //0번째와 비교
				if(lotto[x] == lotto[y]) {
					x--;
					break; //배열안에 값이 같으면 다른 값을 집어넣음
					//넣고나서 비교하는 구조
				}
			}
		}
		for(int x = 0; x< lotto.length; x++) {
			System.out.println(lotto[x] + "\t");
		}
	}
}
