import java.util.Scanner;

public class sam_13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int k = 0;
		System.out.print("������ �Է��ϼ��� :");
		int m = scn.nextInt();
		
		for(int i=2; i<=m; i++) {
			for(int j=2; j<=m ; j++) {
				if(i % j == 0) {
					if(i==j){
						k += 1;
					}else {
						break;
					}//if2
				}//if1
			}//for2	
		}//for1
		System.out.println("�Ҽ��� ����"+ k);
	}

}
