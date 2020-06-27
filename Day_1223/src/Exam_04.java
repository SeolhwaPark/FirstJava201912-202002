/*
 * 배열의 선언과 동시 초기화
 *  원하는 값으로 초기화하려면...->  int[] a = {}; 
 */

public class Exam_04 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,45,67,5,89,7,54,5}; // 인덱스가 9개가 됨
		//int a[] = new int [9];
		//a[0]=1;
		// 배열의 길이를 계산해야할 때  : 예를 들면 a.length
		System.out.println("배열 길이 : " + a.length);// 배열의 길이를 계산
		for(int i=0; i<a.length; i++) {
			System.out.println("a["+ i +"]= " + a[i]);
		}
		
	}

}
