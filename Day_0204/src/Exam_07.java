import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue�������̽�
 */
public class Exam_07 {
	public static void main(String[] args) {
		Queue que = new LinkedList();
		que.offer("aaa");
		que.offer("bbb");
		que.offer("ccc");
		que.offer("ddd");
		System.out.print(que.poll()); //��������
		System.out.print(que.poll());
		System.out.print(que.poll());
		System.out.print(que.poll());
		
		
		
		
	}

}
