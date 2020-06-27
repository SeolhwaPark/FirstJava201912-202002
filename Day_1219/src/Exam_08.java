import java.util.Scanner;

/*
 * 키보드 입력
 * 번호: 
 * 국어:
 * 영어:
 * 수학:
 * 
 *  출력
 *  번호 국어 영어 수학 총점 평균 판정
 * 
 * 처리조건:
 * 총점 = 국어 + 영어 +수학 
 * 평균 = 총점/3.
 * 판정기준이 평균이 3과목 모두 40이상이고 평균 60이상 "합격"
 * 1과목이라도 40미만이면 "과락"
 * 3과목 모두 40이상이나 평균 60 미만이면"불합격"
 * 
 */
public class Exam_08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("번호:");
		int bun = scan.nextInt();
		System.out.print("국어:");
		int kor = scan.nextInt();
		System.out.print("영어:");
		int eng = scan.nextInt();
		System.out.print("수학:");
		int mat = scan.nextInt();
		
		int tot = kor+eng+mat;
		double ave = (double)tot/3.; 
		String panjeng="";
/*		if(ave>=60) {
			if(kor>=40 && eng>=40 && mat>=40) {
				panjeng="합격";
			}else {
				panjeng="과락";
			}}
		
			else {
				panjeng="불합격";
			}
*/
		
		if(kor>=40 && eng>=40 && mat>=40 && ave>=60) {
			panjeng="합격";
		}else {
			if(ave<60) { //if(kor<40 || eng<40 || mat<40)
				panjeng="불합격"; //과락
			}else {
				panjeng="과락";}
			} //불합격

		System.out.print("출력");
		System.out.println("");
			System.out.print(bun+"\t");
			System.out.print(kor+"\t");
			System.out.print(eng+"\t");
			System.out.print(mat+"\t");
			System.out.print(tot+"\t");
			System.out.print(ave+"\t");
			System.out.print(panjeng+"\t");
	}

}

