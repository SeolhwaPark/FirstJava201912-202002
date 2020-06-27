import java.util.Scanner;
/*키보드입력(1~99)
 * 입력자료가 -99, 또는 입력자료 건수가 20개면 종료
 * 입력 : 77
 * . . . 
 * 입력 : -99(-99는 입력자료가 아님)
 * 입력자료 : xx xx xx xx xx............
 * 평균 : xx
 * 평균이 가장 가까운 수 : xx
 */

public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score[] = new int[20]; 	//배열선언 20개
		int a = score[0]; 	//입력받을 자료저장
		int cnt = 0; 	//자료갯수 카운트
		int sum = 0; 	//합계로 평균계산해야함
		double ave = 0; 	//평균 
		
		while(true){ 	//자료 입력받기
			System.out.print("입력 : ");
			int data = scn.nextInt(); //자료입력받은 변수
			if(data == -99 || cnt == 20){
				break; //-99입력이 들어오거나 혹은 count가 20개가 되면 종료
			}
			if(data>=1 && data<=99){ //1이상 99이하일 때 //평균구하기
				score [cnt] = data; //배열안에 데이터들어옴
				cnt++; //숫자들어옴 다음번지 들어감
				sum = sum + data;
			}else {
				break;
			}
		}
		System.out.print("입력자료 : ");
		for(int i=0; i<cnt; i++) { //배열내용 
			System.out.print( score[i] + "\t "); //가로로 띄우면서 나열하기
		}
		
		System.out.println();
		System.out.println("평균 : "+ (double)sum/cnt); 
		
		ave = (double)sum/cnt; //평균값 정수로 나타내고 싶으면 정수로 int씀
		double cha[] = new double[20]; //배열선언 20개 //평균자료저장하기//정수로 하고프면 int
		for(int i=0; i<cnt; i++) { //갯수가 변수i보다 큰 동안에 
			if(score[i]>ave) { //만약 배열이 평균보다 크면
				cha[i] = score[i]-ave; //배열안엔 평균을 뺀 놈이
			}else if(score[i]<ave){ //아니면 배열보다 평균이 더 크면
				cha[i] = ave - score[i]; //배열안에 값이 평균을 뺀 값임
			}
		}
		double min = cha[0]; //평균값과 가까운 수 
		int AAA=0; //가까운 수 넣을 변수선언
		for(int c = 1 ; c<cnt; c++) { // 변수c가 갯수보다 작을 동안에 계속
			if(min>cha[c]) { //최소가 배열 안에 있을때
				min = cha[c]; //그 값을 골라내기
				AAA=c; //배열 안에서의 최소값이 나옴
			}
		}
		System.out.println("평균과 가까운 수 : "+ score[AAA]);
		//syso ctrl space 			System.out.println();
	}
}