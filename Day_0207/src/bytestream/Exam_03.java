package bytestream;
import java.io.BufferedOutputStream;

import java.io.*;
/*
 * 스트림들 연결하기
 */
public class Exam_03 {
	public static void main(String[] args)throws Exception {
		File file = new File("c:\\data\\work\\data1.txt");
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		dos.writeInt(35);
		dos.writeDouble(3.14);
		dos.writeBytes("Seoul");
		dos.close();
		
		
	}

}
