package bytestream;

/*
 * 1Byte 입출력
 * 1.콘솔 출력.. 여러개를 연결함
 *  - FileOutputStream 화면출력 FileinputStream 파일입력해서 출력
 *  - BufferedOutputStream
 *  - DataOutputStream
 *  - write();
 */
import java.io.*;
public class Exam_01 {
	public static void main(String[] args) {
		File file = new File("c:\\data\\work\\data.txt");
		
		try {
			FileOutputStream fos = new FileOutputStream(FileDescriptor.out);
			FileOutputStream fosf = new FileOutputStream(file);
			byte[] data = {66,68,70,72,(byte)'!'};
			fos.write(data);
			fosf.write(data);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
