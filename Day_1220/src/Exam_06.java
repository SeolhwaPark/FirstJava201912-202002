import java.util.Scanner;

/*다중반복문
 *  for(){
 *		for(){
 *		
 *      }
 *    } //if문에도 들어갈 수 있긔
 */
public class Exam_06 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("줄수 :");
		int n=s.nextInt();
		System.out.print("칸수 :"); 
		int m=s.nextInt();
		
		for(int i=1; i<=n; i++) { // 줄 n줄
			System.out.print(i + ":");
			for(int j=1; j<m; j++) { // 줄당 칸수 m칸
			System.out.print("*");	// 25번 돌기
			}
			System.out.print("\n"); // 5번 돌긔
		}
		

	}

}
