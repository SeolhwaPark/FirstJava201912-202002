import java.util.Random;

public class Exam_02 {
	public static void main(String[] args) {
		//Math.random()
		Random r = new Random();
		for(int x=0; x<10; x++) {
			int s = r.nextInt(45)+1; // 최대 1부터 45까지 출력
			System.out.println(s);
		}
	}

}
