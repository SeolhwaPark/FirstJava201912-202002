package student;
/*
 *  * 출력
 * 학번	  이름 	점수		학점(출력할 때만)
 * 1-1-1  홍길동 	95 		A
 * 학번의 중복체크도 가능하면..!
 */
public class Student {
	int hak; //학년
	int ban; //반
	int bun; //번호
	String name; //이름
	int score; //점수
	String hj; //학점
	
	Student(){}
	
	Student(String[] arr){
		this.hak = Integer.parseInt(arr[0]);
		this.ban = Integer.parseInt(arr[1]);
		this.bun = Integer.parseInt(arr[2]);
		this.name = arr[3];
		this.bun = Integer.parseInt(arr[4]);
	}
	//System.out.println(list)
	//Object obj = list.get(0);
	
	
	
}
