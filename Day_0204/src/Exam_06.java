import java.util.Stack;

public class Exam_06 {
	public static void main(String[] args) {
		Stack s = new Stack(); //������ �������� ������ Ʋ�� ���� ,LIFO
		s.push("AAAAA");
		s.push("BBBB");
		s.push("CCCC");
		s.push("DDDD");
		
		System.out.println(s);
		System.out.println(s.peek()); //������ �����ʹ� �����ȵ�
		
		System.out.println(s);
		System.out.println(s.pop()); //������ �����ʹ� ������
		
		System.out.println("----------");
		System.out.println(s);
	}

	
}
