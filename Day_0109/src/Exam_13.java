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

public class Exam_13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
			int score[][] = new int[10][6]; // 10명분의 배열에 6항목이 있음
			int cnt; //실제 입력할 사람수
			double avg[] = new double[10];//평균
			String name[] = new String[10]; //이름

			//번호 이름 국어 영어 수학 입력받기
			for(cnt = 0; cnt<10; cnt++) {
				System.out.print((cnt+1)+ "번째 입력 : ");
				score[cnt][0] = scn.nextInt();
				if(score[cnt][0]==-99)break;
				name[cnt] = scn.next();
				for(int x=1; x<4; x++) {
					score[cnt][x] = scn.nextInt();
					score[cnt][4]+=score[cnt][x];
			}
				avg[cnt] = (int)(score[cnt][4]/3.*10+0.5)/10.;
			}
			
			//테스트출력 
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
			for(int x=0; x<cnt; x++) {
				System.out.print(score[x][0]+"\t");//번호
				System.out.print(name[x]+"\t");//이름
				for(int y=1; y<5; y++) { //y<항목수
					System.out.print(score[x][y]+"\t"); //국영수총
				}
				System.out.print(avg[x]+"\t");//평균
				//System.out.println(score[x][5]+"\n"); //석차
			}
			//석차계산
			for(int x=0; x<cnt; x++) {
				int r = 1;//초기값 1주는게 쉽다
				for(int y=0; y<cnt; y++) {
					if(score[x][4]<score[y][4]){
					r++;
					}
				}
				System.out.println();
				score[x][5]=r;
			}
			//1차 출력
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
			for(int x=0; x<cnt; x++) {
				System.out.print(score[x][0]+"\t");//번호
				System.out.print(name[x]+"\t");//이름
				for(int y=1; y<5; y++) { //y<항목수
					System.out.print(score[x][y]+"\t"); //국영수총
				}
				System.out.print(avg[x]+"\t");//평균
				System.out.println(score[x][5]+"\n"); //석차
			}
				
			//소트
			for(int x=0; x<cnt-1; x++) {
				for(int y=x+1; y<cnt; y++) { //비교해야되기 때무네 1더함 
					
					if(score[x][5]>score[y][5]) { //번호를 기준으로 열을 정렬
						for(int k =0; k<score[x].length; k++) {//k = 항목
							int temp = score[x][k]; //번호
							score[x][k] = score[y][k];
							score[y][k] = temp;
						}
						
						String na = name[x];
						name[x] = name[y];
						name[y] =  na;
						
						double imsi = avg[x];
						avg[x] = avg[y];
						avg[y] = imsi;
					}
				}
			}
	
			//2차 출력
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
				for(int x=0; x<cnt; x++) {
					System.out.print(score[x][0]+"\t");//번호
					System.out.print(name[x]+"\t");//이름
					for(int y=1; y<5; y++) { //y<항목수
						System.out.print(score[x][y]+"\t"); //국영수총
					}
					System.out.print(avg[x]+"\t");//평균
					System.out.println(score[x][5]+"\n"); //석차
			}
		
		
		
		
	}
}
