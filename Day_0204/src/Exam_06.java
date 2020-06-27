import java.util.Stack;

public class Exam_06 {
	public static void main(String[] args) {
		Stack s = new Stack(); //들어갈때랑 나갈때랑 순서가 틀린 구조 ,LIFO
		s.push("AAAAA");
		s.push("BBBB");
		s.push("CCCC");
		s.push("DDDD");
		
		System.out.println(s);
		System.out.println(s.peek()); //꺼내온 데이터는 삭제안됨
		
		System.out.println(s);
		System.out.println(s.pop()); //꺼내온 데이터는 삭제됨
		
		System.out.println("----------");
		System.out.println(s);
	}

	
}
