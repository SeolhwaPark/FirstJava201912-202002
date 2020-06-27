package Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<Student>();
		
		while(true) {
			String hak,ban,bun,name,score;
			boolean flag = false;
			while(true) {
				System.out.print("학년 :");
				hak = sc.nextLine();
				if(hak.contentEquals("0")) {
					flag=true;
					break;
				}
				if(Pattern.matches("[1-3]{1}", hak)) break;
				System.out.println("학년의 입력범위는 1~3입니다. 다시입력해주세요.");
			}
			if(flag) break;
			while(true) {
				System.out.print("반 :");
				ban=sc.nextLine();
				if(Pattern.matches("^[1-6]{1}$", ban)) break;
				System.out.println("반의 입력범위는 1~6입니다. 다시입력해주세요.");

			}
			
			while(true) {
				System.out.print("번호 :");
				bun=sc.nextLine();
				if(Pattern.matches("^[0-9]{1,2}", bun)) {
					if(1<=Integer.parseInt(bun) && Integer.parseInt(bun)<=45)
						break;
				}
				System.out.println("번호의 입력범위는 1~45입니다. 다시입력해주세요.");

			}
			
			String hakbun=hak+ban+bun;
			if(list.contains(new Student(hakbun))) {
				System.out.println("학번이 중복되었습니다. 반,번호,이름을 다시 입력해주세요");
				continue;
			}
			
			
			while(true) {
				System.out.print("이름 :");
				name=sc.nextLine();
				if(Pattern.matches("^[a-zA-Z]{1,10}$", name)) break;
				System.out.println("이름은 영문자 10자 이내로 다시입력해주세요.");
			}
			
			while(true) {
				System.out.print("점수 :");
				score=sc.nextLine();
				if(Pattern.matches("^[0-9]{1,3}$", score)) {
					if(Integer.parseInt(score)<=100) break;
				}
				System.out.println("점수의 입력범위는 1~100입니다. 다시입력해주세요.");

			}
			Student std = new Student(hakbun,name,score);
			list.add(std);
		}
		
		System.out.println("학번\t이름\t\t점수\t학점");
		for(Student std :list) {
			System.out.println(std);
		}
	}
}
