package bytestream;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;

public class Exam_02 {
	public static void main(String[] args)throws Exception{
		File file = new File("c:\\data\\work\\data.txt");
		//Ű���� �Է�
/*		FileInputStream fi =new FileInputStream(FileDescriptor.in);
		System.out.print("�Է�:");
		int b = fi.read();
*/		
		
		//���Ϸ� �Է¹ޱ�
		FileInputStream fis = new FileInputStream(file);
		byte[] by = new byte[100];
		int count = fis.read(by); //�迭�о����
		for(int i=0; i<count; i++)
			System.out.println(i+ ":"+ (char)by[i]);//�ѱ��ھ� ��µǱ�
		
		
	}
}
