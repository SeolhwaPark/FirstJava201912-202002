package Student;

import java.util.ArrayList;
import java.util.List;

public class ExQ {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(89);
		list.add(84);
		list.add(90);
		list.add(77);
		list.add(95);
		list.add(90);
		list.add(65);
		list.add(100);
		list.add(90);
		list.add(84);
		System.out.println(list);
		System.out.println(list.indexOf(90)); // 몇번째에 있냐 indexOf , 없으면 -1, 있으면 인덱스 번호 리턴
		index(list,90);
	}
	
	
	
	static void index(List<Integer> l,int a) {
		int out[] = new int[l.size()];
		int cnt=0;
		for(int i=0;i<l.size();i++) {
			if(l.get(i)==a) {
				out[cnt]=i;
				cnt++;
			}
		}
		System.out.print(a+"의 인덱스는 ");
		for(int i=0;i<cnt;i++){
			System.out.print(out[i]+" ");			
		}
		System.out.println("입니다.");
	}
}
