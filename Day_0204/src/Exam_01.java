import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * List -> ArrayList 싱글스레드방식의 배열구조, Vector멀티스레드방식의 배열구조, LinkedList
 * 공통점 중복이 허용됨, 순서적인 접근.
 * 
 * LinkedList
 * 
 */
public class Exam_01 {
	public static void main(String[] args) {
		List list = new ArrayList(); //리스트 개체를 생성. 디폴트공간이 없음
		List list2 = new LinkedList(); //리스트 개체를 생성. 얘도 디폴트공간이 없음
		
		list.add("123"); //공간추가, 차례대로 들어감, 끼워넣기 가능, 삽입삭제는 느림
		list2.add("AAA"); // 앞뒤에 주소가 존재함, 삽입삭제가 빠름
	}
}
