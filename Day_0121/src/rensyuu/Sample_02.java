package rensyuu;

/* 1���� �迭
 * �����˻���
 * �����Ͱ� �ݵ�� ���ĵǾ� �־�� �Ѵ�
 */
import java.util.Scanner;

public class Sample_02 {
	public static void main(String[] args) {
		int [] score = {11,23,35,40,55,60,70,98,90,95};
		System.out.print("Data Print");
		for(int x = 0; x<score.length ; x++) {
			System.out.print(score[x] + ",");
		}
		System.out.println();
		
		Scanner scn = new Scanner(System.in);
		System.out.print("ã�� �� :");
		int var = scn.nextInt();
		
		int low = 0; // �迭�� ����
		int high = score.length-1; //�迭�� ��
		int mid = 0; // �߾Ӱ�
		while(true) {
			if(low > high) {
				System.out.println("�˻��Ұ�");
				break;
			}
		}
			mid = (low + high) / 2;
			
			if(var == score[mid]) {
				System.out.println(var + "" + mid + "��°");
			}
			if (var > score[mid]){
				low = mid + 1;
			}else {
				high = mid -1;
			}
		
		//������ ����
		//���� ����
	}
	

}
