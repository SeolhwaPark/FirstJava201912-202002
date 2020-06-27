import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam_01_List_index{
	static List<Integer> list = new ArrayList<Integer>();
	static int index(int idx,int val) {
		for(int i=idx;i<list.size();i++) {
			if(list.get(i)==val) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		list.add(89);list.add(84);list.add(90);
		list.add(95);list.add(80);list.add(78);
		list.add(90);list.add(87);list.add(54);
		Scanner sc = new Scanner(System.in);
		System.out.print("input :");
		int val =  sc.nextInt();
		int index = 0;
		System.out.println(val + "의 인덱스는");
		while(index<list.size()) {
			index=index(index,val);
			if(index==-1) break;
			System.out.print(index + ",");
			index++;

		}
		System.out.println("입니다");
	}
}
