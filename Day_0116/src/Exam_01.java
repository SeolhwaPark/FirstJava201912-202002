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
 */

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		Student[] std = new Student[10];
		
		while (cnt<10) { //객체10명분 입력
			Student s = new Student();
			System.out.print((cnt+1) + "입력하세요 :");
		
			s.number = scn.nextInt();
			if(s.number == -99)break;
			s.name = scn.next();
			s.kor = scn.nextInt();
			s.eng = scn.nextInt();
			s.mat = scn.nextInt();
			std[cnt] = s;
			cnt++;
			if(cnt == 10)break;
		}
		StudentData data = new StudentData(std,cnt);
		data.dataPrint();
		
	}

}
