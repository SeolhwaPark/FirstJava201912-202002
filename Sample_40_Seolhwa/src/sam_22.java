import java.util.Scanner;

public class sam_22 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = new int [10]; 
		int i = 0;
		int a = arr[i];
		for(int j = 1; j<= arr.length ; j++) {
			System.out.print("ют╥б : ");
			a = scn.nextInt();
		}
		while(true){
			if(a<=10){
				arr [i] = a; 
				i++;
			if(i == 10) break;
			}
		}
	}
}

