package textstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
 * 파일로 부터 입력 (data.txt)
 * 
 * 츨력예시
 * 번호    이름   성별 국어 영어 수학 총점 평균
 *  1  홍길동  남자 
 *  
 *  화면(콘솔) 출력과 파일로 출력(dataout.txt)을 동시에
 */


public class StudentExam {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("c:\\data\\data.txt"));
		List<Student> list = new ArrayList<Student>();

		while (true) {
			String data = br.readLine();
			if (data == null)
				break;
			String[] arr = data.split(",");
			Student s = new Student(arr);
			list.add(s);
		}

		PrintWriter pwf = new PrintWriter(new BufferedWriter(new FileWriter("c:\\data\\dataout.txt")));
		System.out.println("번호\t이름\t성별\t국어\t영어\t수학\t총점\t평균");
		for (Student s : list) {
			System.out.println(s);
			pwf.println(s);
		}
		pwf.close();
		
	

	}
}
