import java.util.List;
import java.util.ArrayList;

/*
 * 
 */
public class Exam_02 {
	public static void main(String[] args) {
		//문자열만 들어가는 어레이리스트
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("Java");
		list.add("C++");
		list.add("Python");
		list.add("Program");
		// 오브젝트를 꺼내오려면 오브젝트의 타입으로 변환시켜줘야 하는데
		//이미 전환했으면  굳이 변환하지 않아도 되지만 타입을 정했으면 그걸 
		String str =list.get(0); 
		
		//순서적인 접근이 가능하니까
		for(int x=0; x<list.size(); x++) {
			System.out.println(list.get(x));
		} //순서적으로 출력이 가능
		
		boolean bool = list.contains("c++");
		System.out.println(bool);
		int index = list.indexOf("C++"); // C++이몇번째에 있는지 확인하는 출력
		System.out.println(index); 
		list.set(0,"Java"); // 홍길동을 자바로 바꾸는 방법
		System.out.println(list.get(0));
		
	}

}
