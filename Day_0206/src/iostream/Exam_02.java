package iostream;
import java.io.File;

public class Exam_02 {
	public static void main(String[] args) {
		File f = new File("c:\\data\\work");
		if(!f.exists()) {
			f.mkdir();
		}
		
		File f1 = new File(f,"test.txt");
		if(!f1.exists()) {
			try {
				f1.createNewFile(); //����ó���ؾ���
				
			} catch (Exception e) {
				System.out.println("���ϻ��� �Ұ�");
			}
		}
	}

}
