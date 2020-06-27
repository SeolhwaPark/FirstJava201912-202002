import java.util.Scanner;

/*리턴타입 0, 매개변수 

 * 키보드로 정수 입력
 * 입력된 정수까지 합계 출력
 */
public class Exam_08 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = scn.nextInt();
		int ss = sum(num);
		System.out.print(ss);
	}
	
	static int sum(int s) {
		int sum = 0;
		for(int x=1; x<=s; x++) {
			sum+=x;
		}
		
		return sum; //리턴은 저장한 공간이 필요해서 변수를 주어야함.값은 하나만 나와야함
		//리턴은 작업에 필요할 때 씀. 결과값을 메인에 가져오려고할 때
	}

}
