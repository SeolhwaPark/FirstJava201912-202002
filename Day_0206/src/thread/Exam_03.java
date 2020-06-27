package thread;

import java.awt.Toolkit;

/*
 * 인터페이스 구현
 */
class BeepTask implements Runnable{
	@Override
	public void run() {
		Toolkit tool = Toolkit.getDefaultToolkit(); 
		for(int x = 0; x<10; x++) {
			tool.beep();//스피커 소리나게 하는거
			System.out.println("소리"); //글로 소리를 표현
			try {
				Thread.sleep(500); // 0.5초 정지 //sleep == cpu를 정지시키는거
			}catch(Exception o) {} //1000 == 1초
		}
	}
}
public class Exam_03 {
	public static void main(String[] args) {
		//Beep beep = new BeepTask();
		Runnable beep = new BeepTask();
		
		Thread thread = new Thread(beep);//스레드로 매개변수를 넘겨서 생성
		thread.start();
		
		for(int x = 0; x<10; x++) { 
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
		

	}

}
