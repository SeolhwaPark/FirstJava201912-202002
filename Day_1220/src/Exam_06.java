import java.util.Scanner;

/*���߹ݺ���
 *  for(){
 *		for(){
 *		
 *      }
 *    } //if������ �� �� �ֱ�
 */
public class Exam_06 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("�ټ� :");
		int n=s.nextInt();
		System.out.print("ĭ�� :"); 
		int m=s.nextInt();
		
		for(int i=1; i<=n; i++) { // �� n��
			System.out.print(i + ":");
			for(int j=1; j<m; j++) { // �ٴ� ĭ�� mĭ
			System.out.print("*");	// 25�� ����
			}
			System.out.print("\n"); // 5�� ����
		}
		

	}

}
