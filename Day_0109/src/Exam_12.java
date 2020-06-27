import java.util.Scanner;

/* 키보드  = 학생성적정보입력 최대 10명분
 * 
 * 1. 입력 (번호 이름 국어 영어 수학)
 * 입력 : 1 홀길동 89 80 90
 * 입력 : 2 김자바 77 88 99
 * 입력 : -99 종료
 * 
 * 2. 1번째 출력
 * 번호 이름 국어 영어 수학 총점 평균 석차
 * 
 * 3. 2번째 출력 (석차를 기준으로 정렬하여 석차)
 * 번호 이름 국어 영어 수학 총점 평균 석차
 */

public class Exam_12 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
			int score[][] = new int[10][6]; // 10명분의 배열에 6항목이 있음
			int cnt = 0;
			double avg[] = new double[5];//평균
			String name[] = new String[10]; //이름

			//번호 이름 국어 영어 수학 입력받기
			while(true) {
				System.out.print((cnt+1) + "번 입력 : ");
				int data = scn.nextInt(); //자료입력받는애
				if(data == -99)break;
				score[cnt][0] = data;
				name[cnt] = scn.next();
				score[cnt][1] =scn.nextInt(); //국어
				score[cnt][2] = scn.nextInt(); //영어
				score[cnt][3] = scn.nextInt(); //수학
				cnt++;
				if(cnt == 10)break;
				}//while
			
			//총점	
			for(int x=0; x<score.length; x++) {
				for(int y=1; y<4; y++) {
					score[x][4]+=score[x][y];
				}
				//평균계산
				avg[x] = (int)(score[x][4]/3.*10 +0.5)/10.; //소수이하 2자리까지 나옴
			}
			
			//석차계산
			for(int x=0; x<score.length;x++) {
				for(int y=0; y<score.length;y++) {//자기 자신과 비교를 한 번함
					if(score[x][4]<score[y][4]){//총점을 기준으로 할 때
					score[x][5]++;//자기자신을 증가
					}
				}
			}

			//이름
			for(int x=0; x<score.length; x++) {
				for(int y=1; y<4; y++) {
					score[x][4]+=score[x][y];
				}
				//평균계산
				avg[x] = (int)(score[x][4]/3.*10 +0.5)/10.; //소수이하 2자리까지 나옴
			}
			
			//출력
			System.out.println("번호\t국어\t영어\t수학\t총점");
			for(int x=0; x<score.length; x++) {
				for(int y=0; y<score[x].length; y++) {
					System.out.print(score[x][y] + "\t");
				}
				System.out.println();
			}
	}
}
