import java.util.Scanner;

public class sam_28 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("�Է��ϼ��� :");
		int k = scn.nextInt();
		
		int low = 1, high = 10;
		/*
		 * �� �ȵ˴ϴ�..
		 */
		while(true) {
			if(low<=high) {
				int mid = (int)((low+high)/2);
				if(k==a[mid]) {
					System.out.println("���" + mid);
					break;
				}else if(k>a[mid]) {
					low = mid+1;
				}else high =mid-1;
			}
		}
	}

}
