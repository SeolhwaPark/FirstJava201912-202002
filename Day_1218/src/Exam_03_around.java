import java.util.Scanner;

/*
 * 번호, 이름, 국어, 영어, 수학, 점수를 키보드로 입력
 * 총점, 평균(소수이하 두번째 자리에서 반올림)
 */
public class Exam_03_around {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("번호 :"); //사용의 편의성을 위해 쓴거
		int bun = s.nextInt();
		System.out.print("이름 :");
		String name= s.next();
		System.out.print("국어 :");
		int kor = s.nextInt();
		System.out.print("영어 :");
		int eng = s.nextInt();
		System.out.print("수학 :");
		int mat = s.nextInt();
		int tot = kor+eng+mat;
		double ave = (double)tot/3.; 
		//87.256->87.3
		ave = ((int)(ave*10+0.5))/10.;
		//ave*10+0.5=873.06 (3자리수반올림이면 *100+0.05)
		//876.06->873-> (int)정수에다가 반올림하려면 /10.->87.3 (3자리수이면 /100.)
		System.out.println("번호 :"+bun);
		System.out.println("이름 :"+name);
		System.out.println("총점 :"+tot);
		System.out.println("평균 :"+ave);
		
	}

}
