package iostream;
/*
 * 입출력 스트림
 * 
 * 바이트방식 (InputStream, OutputStream) ->한글깨짐
 * 
 * 문자(테스트)방식 (Reader,Writer)
 */
import java.io.*;

public class Exam_01 {
	public static void main(String[] args) {
		File f = new File("c:\\data\\work");
		if(f.exists())//존재한다면
			f.delete(); // 자바로 파일 삭제하기
		try {
			Thread.sleep(3000); //3초 기다리다가
		} catch (Exception e) {}
		
		System.out.println("시작");
		try {
			Thread.sleep(3000); //3초 기다리다가
		} catch (Exception e) {}
		
		if(!f.exists())//존재하지 않는다면
			f.mkdir(); // 파일 만들기
		System.out.println("끝");
		
	}

}
