package thread;

class AA extends Thread{
	@Override //언어테이션
	public void run() {
		for(int x =1; x<10; x++) {
			for(int y=1; y<5; y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
}
class BB implements Runnable{
	@Override
	public void run() {
		int s = 0;
		for(int x = 1; x<10; x++) {
			System.out.println(x);
			s+=x;
		}
		System.out.print("s =" + s);
	}
	
}
public class Exam_04 {
	public static void main(String[] args) {
		Thread aa = new AA();
		aa.start();
		
		BB bb = new BB();
		Thread bbb = new Thread(bb);
		bbb.start();
		
		
		
	}

}
