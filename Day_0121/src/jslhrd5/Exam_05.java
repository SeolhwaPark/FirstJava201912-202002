package jslhrd5;

import java.io.IOException;

/*
 * 예외처리
 * 
 * 자바를 컴파일 하여 에러가 발생 하지 않았다고 원하는 결과를 얻은 것은 아니다.
 * 프로그램개발은 마쳤지만, 사용하다 보면 예기치 않는 문제가 발생하는 경우가 있다.
 * 이렇게 프로그램이 실행되는 동안에 발생하는 예기치 않은 에러를 예외라고 하다.
 * 즉 예외는 일반적이지 않는 상황에서 발생하는 에러이다.
 * 
 * 
 * 최상위 클래스 == Exception
 * 
 * 
 * 
 * try{
 * 
 * }catch(Exception e){ 	<- Exception이 모든 예외가 있을 때 그 예외를 처리해줌
 * 
 * }finally{ <- finally 예외의 발생과 관계없이 강행함
 * 
 * }
 */
public class Exam_05 {
	public static void main(String[] args) {
		try {
			int a = System.in.read();
		}catch (IOException e) {
			System.out.println("예외가 발생");
			//e.printStackTrace(); // 예외를 확인할 때
		}catch (Exception ee) { //catch가 늘어나면 밑으로 내려갈 수 록 규모가 커짐
			ee.printStackTrace();
		}finally { //마무리..
			
		}
		
		
	}

}
