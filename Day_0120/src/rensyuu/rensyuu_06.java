package rensyuu;
/*
 * 힙은 객체를 저장
 * 스텍은 정수를 저장
 */
class AA{
	int bun ;
	String name;
	int score;
	AA(){}
	AA(int bun, String name, int score){
		this.bun = bun;
		this.name = name;
		this.score = score;
	}
	
}

class AATest{
	
}

public class rensyuu_06 {
	static void print(AA[] ss) {
		for(int x = 0 ; x < ss.length; x++) {
			System.out.print(ss[x].bun + "\t");
			System.out.print(ss[x].name + "\t");
			System.out.print(ss[x].score + "\n");
		}
	}
	
	public static void main(String[] args) {
		AA sa[] = new AA[5];
		sa[0] = new AA();
		sa[1] = new AA(1, "AAA", 90);
		sa[2] = new AA();
		sa[3] = new AA(2, "BBB", 88);
		sa[4] = new AA(3, "CCC", 77);
		print(sa);

		//AATest aat = new AATest;
		//aat.print(sa);
	}

}
