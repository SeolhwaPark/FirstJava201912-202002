import java.util.Scanner;
/*
 * 2~ m���� �Էµ� �����߿��� �Ҽ��� ������ ���
 */
public class sam_14 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i = 2; 
		int k = 0;//�Ҽ��� ����
		
		System.out.print("�����Է� :");
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
		System.out.println("�Էµ� �� �� �Ҽ��� ���� : "+ k);
			//���� �ȳ����׿�....
	}
}
