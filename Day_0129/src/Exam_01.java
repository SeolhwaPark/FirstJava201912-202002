import java.util.Scanner;


/*
 * 번호 이름 점수5개 입력 받아서 출력하는 프로그램을 완성하시오
 * 
 * 입력항목 최대 10개 또는 번호 -99이면 종료
 * 번호 이름 점수 5개
 * 
 * 점수출력시 오름차순으로 출력
 * 
 * 출력
 * 번호 이름 점수
 * 1 AAA 77 80 87 90 95
 * 
 */
class Hak {
	int bun;
	String name;
	int[] score = new int[5];
	
	Hak(){}
	
	Hak(String[] hh){
		bun = Integer.parseInt(hh[0]);
		name = hh[1];
		
		for(int i = 0; i<score.length; i++) {
			this.score[i] = Integer.parseInt(hh[i+2]);
		}
	}
}

class HakData {
	Hak[] hak;
	int cnt;
	
	HakData(Hak[] hak, int cnt) {
		this.hak = hak;
		this.cnt = cnt;
		
		dataPrint();
	}

	void dataPrint() {
		// 출력
		System.out.println("번호\t이름\t점수");
		for(int x = 0; x<cnt; x++) { //사람수
			for(int y = 0; y<hak.length-1; y++) { // 정렬위한포문
				for(int z= y+1; z<hak[x].score.length; z++) { // 정렬
					if(hak[x].score[y] > hak[x].score[z]) {
						int temp = hak[x].score[y];
						hak[x].score[y] = hak[x].score[z];
						hak[x].score[z] = temp;
					}					
				}
			}
		}
		
		for (int x = 0; x < cnt; x++) {
			System.out.print(hak[x].bun + "\t" + hak[x].name + "\t");
			for (int y = 0; y <hak[x].score.length; y++) {
				System.out.print(hak[x].score[y] + "\t");
			}
		}	
	}
}
	public class Exam_01 {
	public static void main(String[] args) {
		Hak[] hak = new Hak[10];
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		
		while(cnt<10) {
			System.out.print("입력 :");
			String[] arr = scn.nextLine().split(",");
			for(int x = 0; x<cnt; x++) {
				for(int y =0; y<hak[x].score.length; y++) {
					if(100<Integer.parseInt(arr[y]) && 0>Integer.parseInt(arr[y])) {
						System.out.println("점수 오륩니더");
						continue;
					}
				}
			}
			if(arr[0].equals("-99"))break;
			Hak h = new Hak(arr);
			hak[cnt] = h;
			cnt++;
		}
		HakData h = new HakData(hak,cnt);
	}
}
