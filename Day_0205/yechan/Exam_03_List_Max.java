import java.util.ArrayList;
import java.util.List;

/* 리스트 words 에는 여러 개의 영단어가 입력되어 있다.
 * 입력된 단어들 중에서 가장 길이가 긴 단어를 출력하는 프로그램을 작성
 * 가장 긴 단어가 여러개인 경우에는 모두 출력한다.
 */
public class Exam_03_List_Max {
	static void output(List<String> ls) {
		int max=0;
		System.out.print("output : ");
		for(int i=0;i<ls.size();i++) {
			if(ls.get(i).length()>max) max=ls.get(i).length();
		}
		for(int i=0;i<ls.size();i++) {
			if(ls.get(i).length()==max)
			System.out.print(ls.get(i)+"\t");
		}
		
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("name");list.add("lion");list.add("elephants");
		list.add("pig");list.add("train");list.add("apple");
		list.add("republic");list.add("increase");list.add("movements");
		
		System.out.println(list);
		output(list);
	}
}
