import java.util.Scanner;

public class sam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i=0, s=0;
		
		while(true) {
		System.out.print("입력하세요 :");
		int a = scn.nextInt();
		
		if(a == 0) {
			System.out.println("누적건수 :"+ i);
			System.out.println("누적합계 :"+ s);
		break;
		}
			i++;
			s+=a;
		}
	 }
}
