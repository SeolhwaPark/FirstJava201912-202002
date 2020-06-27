import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exam_05 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("AAAA");
		list.add("BBBB");
		list.add("!!!!");
		list.add("DDDD");
		
		List list2 = list; //복사가 아니라 주소가 넘어감. 공간을 공유함 
		list2.add("FFFF");
		
		for(String str : list) {  //확장포문
			System.out.println(str);
		}
		
		System.out.println("---------------------");
		for(int x=0; x<list.size(); x++) {
			System.out.println(list.get(x));
		}
		
		System.out.println("---------------------");
		//스트링전용 반복자 이용시 와일문
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) { //hasNext 존재여부 묻는거
			System.out.println(iter.next());//존재하면 꺼내오기
		}
	}

}
