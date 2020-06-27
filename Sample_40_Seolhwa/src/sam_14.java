import java.util.Scanner;
/*
 * 2~ m까지 입력된 정수중에서 소수의 갯수를 출력
 */
public class sam_14 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i = 2; 
		int k = 0;//소수의 갯수
		
		System.out.print("정수입력 :");
		int m = scn.nextInt();
		
		while(true) {
			int j = 2;
			
			while(true) {
				int n = i-(int)(i/j)*j;

				if(n == 0) {
					if(i == j) k += 1;
					
					if(i == m) break; //*****
						else {
							break;
						}
				}else {
					j += 1;
				}
			}
			if(i == m)break;//*****
			i += 1;
		}
		System.out.println("입력된 값 중 소수의 갯수 : "+ k);
			//답이 안나오네요....
	}
}
