package textstream;

import java.io.BufferedReader;
import java.io.FileReader;

public class Exam_02 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = 
				new BufferedReader(
						new FileReader("c:\\data\\work\\data2.txt"));
		String data = br.readLine();
		System.out.println(data);
		br.close();
	}

}
