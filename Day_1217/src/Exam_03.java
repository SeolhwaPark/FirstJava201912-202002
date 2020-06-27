/*
 * // \t 칸 간격 벌림

 */
public class Exam_03 {

	public static void main(String[] args) {
		int bun = 10; //입력작업
		char irum = 'k';
		int kor=95;
		int eng=88,mat=77;
		
		// 총점 계산
		int tot = kor+eng+mat;
		// 평균
		double ave=tot/3.;
		
		System.out.println("번호 :"+bun);
		System.out.println("이름 :"+irum);
		System.out.println("총점 :"+tot);
		System.out.println("평균 :"+ave);

		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.print(bun+"\t"+irum+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+ave+"\t");		
	}

}
