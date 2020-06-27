import java.util.Scanner;

/*
 * if (조건식){ //참
 *  문장1;
 * }else{ //거짓
 *  문장2;
 * }
 *  문장3;
 *  
 *  문제 : 키보드(Scanner)로 점수를 입력 받아서 85이상이면 "합격"
 *		    아니면 "불학격"
 */
public class Exam_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수입력:");
		int var = scanner.nextInt();//점수입력에 필요하긔
		
		String str="";//결과출력에 필요하긔
		if(var>=85) {
			str="합격";
		}else {
			str="불합격";
		}
		System.out.println("결과 :" +str);
		
		}

	}

