class Hakk{
 
	int bun;
	String name;
	int score;

	Hakk(int a, String b, int c){
		bun = a ;
		name = b;
		score = c;
	}
	
	Hakk(){
		
	}


}
/* 키보드입력
 * 번호 이름 점수 입력
 * 입력 : 1 홍길동 90
 * 출력
 * 번호 이름 점수 그래프(10점당'*'1개)
 * 1 홍길동 90 *********
 
 */

public class Exam_07 {
	public static void main(String[] args) {
		
		int bun  = 1;
		String na = "홍길동";
		int score = 90;
		
		Hakk h1 = new Hakk();
		//h1.bun = bun;
		//h1.name = na;
		//h1.score = score;
		
		Hakk h2 = new Hakk(bun,na,score);
				
		System.out.println(h2.bun + "\t" + h2.name + "\t");
		for(int x = 0; x < h2.score; x++) {
			if(x%10 == 0) {
				System.out.print("*");
			}
		}
		
		System.out.println();
	}

}
