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
/* Ű�����Է�
 * ��ȣ �̸� ���� �Է�
 * �Է� : 1 ȫ�浿 90
 * ���
 * ��ȣ �̸� ���� �׷���(10����'*'1��)
 * 1 ȫ�浿 90 *********
 
 */

public class Exam_07 {
	public static void main(String[] args) {
		
		int bun  = 1;
		String na = "ȫ�浿";
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
