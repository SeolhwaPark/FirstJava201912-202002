/*
 * 5과목                     총점
 * 1  2  3  4  5  xx
 * 6  7  8  9  10 xx
 * 11 12 13 14 15 xx
 * 16 17 18 19 20 xx
 * 21 22 23 24 25 xx
 * xx xx xx xx xx xx 과목별총점
 * 
 */
public class Exam_06 {
	public static void main(String[] args) {
		int a[][] = new int[6][6];
		int cnt = 0;
		
		//입력
		for(int x=0; x<a.length-1; x++) {
			for(int y=0; y<a[0].length-1; y++) {
				cnt ++;
				a[x][y] = cnt;
				a[x][5]+=a[x][y]; //1인당성적 합계
				a[5][y]+=a[x][y]; //과목별합계
				a[5][5]+=a[x][y]; //총합계
			}
		}
		
		//출력
		for(int x=0; x<a.length; x++) {
			for(int y=0; y<a[0].length; y++) {
				cnt ++;
				a[x][y] = cnt;
			}
			System.out.print("\n");
		}
		
	
	}
}
