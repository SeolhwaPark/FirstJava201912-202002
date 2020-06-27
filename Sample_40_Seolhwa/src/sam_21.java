import java.util.Scanner;

public class sam_21 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[10];
		int i=0;
		while(true) {
			System.out.print("입력해주세요 :");
			arr[i] = scn.nextInt();
			i+=1;
			if(i==10)break;
		}
		for(int j=0;j<10;j++)
			System.out.println("a["+j+"]="+arr[j]);
	}
}
