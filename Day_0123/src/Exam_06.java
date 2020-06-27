/*
 * Math.random() -- > 0~10 사이의 난수
 */
public class Exam_06 {
	public static void main(String[] args) {
		//1~10
		for(int x = 0 ; x<10; x++) {
			//System.out.println(Math.random());
			int a = (int)(Math.random()*10);
			System.out.println(a+1); //1~10
		}
		System.out.println("------------------");
		
		for(int x =0; x<10; x++) {
			int a = (int)(Math.random()*6)+1;
			System.out.println(a);
		}
		
	}

}
