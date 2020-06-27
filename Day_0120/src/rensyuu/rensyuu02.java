package rensyuu;

public class rensyuu02 {
	static void test(int[] s) {
		
		int c = s[0];
		s[0] = s[1];
		s[1] = c;
		
	}
	static void swap(int a, int b) {
		
		int c = a;
		a = b;
		b = a;
	}
	public static void main(String[] args) {
		
		int a = 10, b =20;
		swap(a,b);
		int s[] = new int[2];
		s[0] = 10;
		s[1] = 20;
		
		for(int x =0; x<s.length; x++) {
			System.out.println(s[x]);
		}
		test(s); // 참조에 의한 호출
		
		//배열은 시작주소를 알고 있으면 자료형의 크기만큼 더해서 찾아냄
		
	}

}
