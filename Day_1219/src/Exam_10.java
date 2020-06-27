/*
 * 두개의 정수입력 대,소 구분
 *  단, 동일한 값은 없음
 */
public class Exam_10 {
	public static void main(String[] args) {
		int a=90,b=80;
		int max, min;
		if(a>b) {
			max=a;
			min=b;
		}else {
			max=b;
			min=a;
		}
		System.out.println("max :" + max);
		System.out.println("min :" + min);

	}

}
