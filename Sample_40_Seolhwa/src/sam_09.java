import java.util.Scanner;

public class sam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int max = 0,min = 999;
		
		while(true) {
		System.out.print("입력하세요 : ");
		int a = scn.nextInt();
		
		if(a == -99){
			System.out.print("max :" + max + ", ");
			System.out.print("min :" + min);
			break;
		}
			if(max<a) {	
				max = a;
			}else if(min>a) {
				min = a;
			}
		}//while

	}

}
