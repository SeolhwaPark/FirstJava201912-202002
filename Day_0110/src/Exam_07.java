/*참조에 의한 호출 
 * 
 */
public class Exam_07 {

	public static void main(String[] args) {
		int a[] = {10,20};
		System.out.println("a[0] :" + a[0]);
		System.out.println("a[1] :" + a[1]);
		
		swap(a);
		System.out.println("----교환 후----------------------");

		System.out.println("a[0] :" + a[0]);
		System.out.println("a[1] :" + a[1]);
	}
	//교환
		static void swap(int a[]) {
			int c=a[0];
			a[0] = a[1];
			a[1]= c;
		}
}