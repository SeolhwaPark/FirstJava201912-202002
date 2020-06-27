package thread;

import java.awt.Toolkit;
/*
 * 상속받은 버전
 * 
 * 상속받으면 스레드를 사용할 수 없음
 */
class Beep extends Thread{
	@Override
	public void run() { //run 작업의 단위
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

public class Exam_02 {
	public static void main(String[] args) {
		
		Beep beep = new Beep();
		
		//beep.run(); 단일스레드
		beep.start(); //스레드를 동작시킴 ..멀티스레드방식으로 출력됨
		
		for(int x = 0; x<10; x++) { 
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
		
		
		
		
	}
}
