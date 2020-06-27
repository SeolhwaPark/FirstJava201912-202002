/*
 * 1~100 합계
 * while(조건식){}
 * 
 */
public class Exam_03 {
	public static void main(String[] args) {
		int i=0, tot=0;
		while(i<100) {
			i++;
			System.out.println(i);
			tot=tot+i;
		}
		System.out.println("1~100 :"+tot);

	}

}
