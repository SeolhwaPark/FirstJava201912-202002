import java.util.Scanner;

/*
 * 키보드로 사용자 시작값 끝값 입력 다음과 같이 출력하믐 클래스를 작성하시요
 
 * 입력
 * 사용자: 홍길동
 * 시작 : 5
 * 끝: 20
 * 
 * 출력
 * 사용자 :홍길동
 * 연산결과: 5+6+7+8+9+10+. . . .+20 = xxx 
 */


class SeqNumber{
	String name;
	int start, end, sum;
	
	SeqNumber(){}
	
	SeqNumber(String name, int start, int end){
		this.name = name;
		this.start = start;
		this.end = end;
	}	
	
	void print(){
		//5+6+7+8+9+10+. . . .+20 = xxx 
		
		System.out.println("사용자 :" + name);
		System.out.print("연산결과 :" + start);
		
		sum = start;
		for(int i = start+1; i <= end ; i++) {
			System.out.print("+" + i);
			sum+=i;
		}
		System.out.println(" =" + sum);
		
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("사용자 :");
		String name = scn.next();
		System.out.print("시작 :");
		int start = scn.nextInt();
		System.out.print("끝 :");
		int end = scn.nextInt();

		SeqNumber seq = new SeqNumber(name, start, end);
		seq.print();
	}
}
