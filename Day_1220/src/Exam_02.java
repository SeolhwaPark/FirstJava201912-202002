/*
 * 1~100 합계
 * while(조건식){}
 */
public class Exam_02 {
	public static void main(String[] args) {
		int i=0; // 1 2 3 4 5 
		int tot=0; // 1+2+3+4+5
		
		while(true) { //참일 때만 반복 
			i++;
			tot=tot+i;
			System.out.println(i);
			if(i==100) {
				break;//반복문 탈출 ㅋ
				
			}
		}
		System.out.println("1~100 :"+tot);

	}

}
