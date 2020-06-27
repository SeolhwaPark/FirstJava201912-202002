package student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 처리조건
 * 정답은 키보드를 통해서 입력받는다
 * 정답 : 2,3,1,4,3,.. . . . 
 * 
 * 1 학생답안은 data.txt파일로 저장되어 있으며 20명이내
 * 
 * 2 각 문항당 5점으로 계산
 * 3 마지막에는 각 문항별 정답비율을 출력
 */
public class StudentExam {
	public static void main(String[] args) throws FileNotFoundException {
		Student[] student = new Student[20];
		int cnt =0;
		//키보드입력
		Scanner scn = new Scanner(System.in);
		System.out.print("정답입력 :");
		String[] kotae = scn.nextLine().split(",");
		
		//파일들여오기
		Scanner scf = new Scanner(new File("src\\student\\data.txt"));
		System.out.println("                     ** 객관식 채점 결과표 **");
		System.out.print("번호\t이름\t");
		
		for(int x = 0; x<20; x++) {
			System.out.print((x+1) + "\t");
		}
		System.out.println("점수");
		
		while(scf.hasNext()) { //여러줄 읽어올때
			String[] str = scf.nextLine().split(",");
			Student jj = new Student(str);
			student[cnt] = jj;
			cnt++;
		}
		
		StudentData data = new StudentData(student,kotae,cnt);
	}

}
