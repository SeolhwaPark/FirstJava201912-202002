package rensyuu;

import java.io.File;
import java.util.Scanner;

/*
 * 처리조건
 * 정답은 키보드를 통해서 입력받는다
 * 정답 : 2,3,1,4,3,.. . . . 
 * 
 * 1 학생답안은 data.txt파일로 저장되어 있으며 20명이내
 * 
 * 2 각 문항당 5점으로 계산
 * 
 * 3 마지막에는 각 문항별 정답비율을 출력
 */
public class GakuseiExam {
	public static void main(String[] args) throws Exception{
		
		Gakusei[] gakusei = new Gakusei[20];
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정답 입력 :");
		String[] kaitou = sc.nextLine().split(",");
		
		Scanner sf = new Scanner(new File("scn\\Gakusei\\seiseki1.txt"));
		System.out.println("                     ** 객관식 채점 결과표 **");
		System.out.print("번호\t이름");
		for(int x=0; x<20; x++) {
			System.out.print((x+1) + "\t");
		}
		System.out.println("점수");
		
		while(sf.hasNext()) {
			String[] s = sf.nextLine().split(",");
			Gakusei seiseki = new Gakusei(s);
			gakusei[cnt] = seiseki;
			cnt++;
		}
		
	}

}
