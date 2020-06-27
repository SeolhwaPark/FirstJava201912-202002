import java.util.Arrays;

/*
 * Arrays
 * 
 * 배열 복사,항목 비교, 정렬, 검색 등을 지원하는 클래스
 */
public class Exam_08 {
	public static void main(String[] args) {
		int[] var = { 1, 2, 3, 4, 5, 6 };
		int[] str = Arrays.copyOf(var, var.length);// 리턴타입//다 복사할려면 var.length
		for (int x = 0; x < str.length; x++) {
			System.out.print(str[x] + "\t");
		}
		
		System.out.println();
		System.out.println("배열의 주소 비교 : "+ var.equals(str));//배열 첫번째 요소의 주소
		System.out.println("배열요소의 값 : "+ Arrays.equals(var,str));//항목 비교
		
	}
}
