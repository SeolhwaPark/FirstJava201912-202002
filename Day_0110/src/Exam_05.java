/*
 * 출렭
 * 
 * Java : 90 67 78 80 xxx합계 xx.xxx평균
 *
 *
 *메소드는 어디서든 사용할 수 있어야 함
 *
 */
public class Exam_05 {
	public static void main(String[] args) {
		String name = "Java";
		int score[] = {90,67,78,89};
		aaa(name, score);
	}
	static void aaa(String n, int[] aa) {
		System.out.println(n + ":");
		int sum = 0;
		for(int x = 0;x<aa.length;x++) {
			System.out.println(aa[x] + "\t");
			sum+=aa[x];
		}
		System.out.println(sum + "\t");
		System.out.println(sum/aa.length + "\n");
	}

}
