package textstream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/*
 * 텍스트 입출력
 * Reader / Writer
 * InputStreamReader / OutputStreamWriter 화면출력,콘솔입출력
 * FileReader / FileWriter 파일입출력
 * BufferedReader / BufferedWriter 필터역할,연결자가튼거
 * 					PrintWriter
 */

public class Exam_01 {
	public static void main(String[] args)throws Exception  {
		File file = new File("c:\\data\\work\\data2.txt");
		//콘솔 출력
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		//PrintWriter pws = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		pw.println("화면 출력 테스트입니다.");
		pw.close(); //꼭 닫아야함

		//파일 출력
		PrintWriter pwf = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		pwf.println("파일 출력 테스트");
		pwf.close();
		
		//객체도 출력할 수 있지만 깨짐. 객체입출력스트림으로 입출력하면 잘 나옴..
		
	}
}