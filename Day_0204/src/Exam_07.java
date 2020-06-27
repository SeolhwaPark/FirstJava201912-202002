import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue인터페이스
 */
public class Exam_07 {
	public static void main(String[] args) {
		Queue que = new LinkedList();
		que.offer("aaa");
		que.offer("bbb");
		que.offer("ccc");
		que.offer("ddd");
		System.out.print(que.poll()); //꺼내오기
		System.out.print(que.poll());
		System.out.print(que.poll());
		System.out.print(que.poll());
		
		
		
		
	}

}
