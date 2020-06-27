package bytestream;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;

public class Exam_02 {
	public static void main(String[] args)throws Exception{
		File file = new File("c:\\data\\work\\data.txt");
		//키보드 입력
/*		FileInputStream fi =new FileInputStream(FileDescriptor.in);
		System.out.print("입력:");
		int b = fi.read();
*/		
		
		//파일로 입력받기
		FileInputStream fis = new FileInputStream(file);
		byte[] by = new byte[100];
		int count = fis.read(by); //배열읽어오기
		for(int i=0; i<count; i++)
			System.out.println(i+ ":"+ (char)by[i]);//한글자씩 출력되긔
		
		
	}
}
