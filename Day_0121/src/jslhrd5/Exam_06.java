package jslhrd5;
/*
 * main�� �޼ҵ忡�� �߻��ϴ� ��� ����ó���� ������ִ� ��Ȱ throws IOException
 * (�ڱ⸦ ȣ���� �� ����� ���� ���ܸ� �޾� ó����)
 * 
 * throw == ���ܸ� �߻���Ŵ
 * 
 */
import java.io.IOException;

class AA{
	char input() throws IOException{
		char ch = (char)System.in.read();
		return ch;
	}
}
class BB{
	char input(){
		char ch = '\0';
		try{
			ch= (char)System.in.read();
		}catch (IOException e) {
			e.printStackTrace();
		}
			return ch;			
		
	}
}
public class Exam_06 {
	public static void main(String[] args) {
		
		AA a = new AA();
		
		try {
			char c = a.input();
			System.out.println("�Է°� :" + c);
		}catch (Exception e) {
			e.printStackTrace();
		}
	//	if(ddd<0) {
	//		throw new Exception(); //������ ���� �߻�}
		
		BB b = new BB();
		char bb = b.input();
		System.out.println("�Է°� :" + bb);
	}

}