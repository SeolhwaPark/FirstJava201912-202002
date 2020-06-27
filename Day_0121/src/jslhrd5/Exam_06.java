package jslhrd5;
/*
 * main의 메소드에서 발생하는 모든 예외처리를 담당해주는 역활 throws IOException
 * (자기를 호출해 준 사람을 위해 예외를 받아 처리함)
 * 
 * throw == 예외를 발생시킴
 * 
 */
import java.io.IOException;

class AA{
	char input() throws IOException{
		char ch = (char)System.in.read();
		return ch;
	}
}
class BB{
	char input(){
		char ch = '\0';
		try{
			ch= (char)System.in.read();
		}catch (IOException e) {
			e.printStackTrace();
		}
			return ch;			
		
	}
}
public class Exam_06 {
	public static void main(String[] args) {
		
		AA a = new AA();
		
		try {
			char c = a.input();
			System.out.println("입력값 :" + c);
		}catch (Exception e) {
			e.printStackTrace();
		}
	//	if(ddd<0) {
	//		throw new Exception(); //강제적 예외 발생}
		
		BB b = new BB();
		char bb = b.input();
		System.out.println("입력값 :" + bb);
	}

}
