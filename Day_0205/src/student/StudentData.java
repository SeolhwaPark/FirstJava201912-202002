package student;

import java.util.List;
/*
 *  * 출력
 * 학번	  이름 	점수		학점(출력할 때만)
 * 1-1-1  홍길동 	95 		A
 * 학번의 중복체크도 가능하면..!
 * 
 */
public class StudentData {
	Student[] arr;
	List list ;
	int cnt;
	
	StudentData(){}
	StudentData(List list,int cnt){
		this.list = list;
		this.cnt = cnt;
	}
	
	private void StudentPrint() {
		System.out.println("학번\t이름\t점수\t학점");
		for (int x = 0; x < list.size(); x++) {
			System.out.println(list.get(x));
		}
	}
}
