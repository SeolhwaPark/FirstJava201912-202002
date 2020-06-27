package jslhrd6;

public class Exam_10 {
	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50};
		int b[] = new int[a.length];
		//int b[] = a; == 주소복사
		for(int x = 0 ; x < a.length ; x++) {
			b[x] = a[x]; // 배열복사, 객체의 값을 복사 == clone,.. 
			//클래스는 주소가 들어잇음,참조중인 객체는 복사할 수 없음
		}
		
		b[0] = 77;
		int c[] = a.clone();
		c[1] = 99;
		
		for(int x = 0 ; x < a.length ; x++) {
			System.out.println(a[x] + "\t" + b[x] + "\t" + c[x]);
		}
	}
}

//ㅠㅠ..ㅇㅇ ..ㅠㅠ 전자렌지 사용법