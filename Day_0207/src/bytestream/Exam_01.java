package bytestream;

/*
 * 1Byte �����
 * 1.�ܼ� ���.. �������� ������
 *  - FileOutputStream ȭ����� FileinputStream �����Է��ؼ� ���
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
