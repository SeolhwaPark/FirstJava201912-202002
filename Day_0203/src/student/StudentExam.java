package student;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 키보드입력
 * 입력 : 번호, 이름, 점수, 점수 , 점수 ,점수, 점수
 * 
 * 처리조건 
 * 입력시 번호가 '0'이면 입력종료
 * 번호가 중복시 입력 불가 하도록 처리
 * 총점을 기준으로 석차 부여
 * 1차 출력은 입력자료순으로 출력하고
 * 2차 출력은 석차를 기준으로 출력
 * 
 * 출력
 * 번호 이름 점수. . .  점수 총점 평균 석차
 */
public class StudentExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		System.out.println("번호와 이름, 각 과목의 점수를 입력하세요");
		
		while (true) {
			System.out.print("입력:");
			String[] arr = sc.nextLine().split(",");
			if (arr[0].equalsIgnoreCase("0"))
				break;
			Student s = new Student(arr);

		   //번호중복
			boolean bool = list.contains(s); 
			if (bool) {
				System.out.println("번호 중복임돠");
			} else {
				list.add(s);
			}
		}
			new StudentData(list);
			
	}

}
