package thread;
/*
 * 멀티스레드 
 * 두 작업을 병행가능. 번갈아가면서 작업을 실행, 예약시스템에서 쓰임
 * (CPU가 1개라서..)
 * 
 * Thread라는 클래스를 상속받아서
 * Runnable인터페이스 구현
 * 
 * 스레드 -> 실행코드 (작업하기 위해 실행되는 코드) ==작업
 * 
 * 단일스레드 - > 하나의 작업이 끝나고 나서 그다음 작업을 실행하고...
 */
//class A implements ... 가능
//class AA extends Thread{ //extends Thread 써야함

import java.awt.Toolkit;

	

public class Exam_01 {
	public static void main(String[] args) {
	//멀티스레드의 구현방법. 시분할시스템 TSS	
	Toolkit tool = Toolkit.getDefaultToolkit(); 
	for(int x = 0; x<10; x++) {
		tool.beep();//스피커 소리나게 하는거
		try {
			Thread.sleep(500); // 0.5초 정지 //sleep == cpu를 정지시키는거
		}catch(Exception o) {} //1000 == 1초
	}
	for(int x = 0; x<10; x++) {
		System.out.println("띵");
		try {
			Thread.sleep(500);
		}catch(Exception e) {}
	}
	}
}
