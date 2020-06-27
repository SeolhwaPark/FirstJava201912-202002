import java.util.Scanner;

/*	클래스 배열처리
 * 키보드 입력 최대 10명 
 * 입력 : 번호 이름 국어 영어 수학 
 * . . . . . . . . . . . .
 * 
 * 출력 (석차를 기준으로 오름차순)
 * 번호 이름 국어 영어 수학 총점 평균
 * 
 * 번호가 -99이면 입력종료
 * 1.학생 정보 Student
 * 2.학생 정보 처리 StudentData
 * 3.자료 입력 main()
 * 
 */

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		Gakusei[] gaku =  new Gakusei[10];
	
		while(cnt<10) {
			
			System.out.print((cnt + 1)+"를 입력하세요 :");
	
			int bunho = scn.nextInt();
			if(bunho == -99) break;
			String name = scn.next();
			int kor = scn.nextInt();
			int eng = scn.nextInt();
			int mat = scn.nextInt();
	
			Gakusei gak = new Gakusei(bunho,name,kor,eng,mat);
			gaku[cnt] = gak;
			cnt++;
		}
		
		GakuseiData data = new GakuseiData(gaku,cnt);
		data.gakuseiPrint();
		
	}

}
