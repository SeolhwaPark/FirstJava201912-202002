/*
 * 제어문
 * 1)if (조건식은 반드시 True or False 산술 관상논)
 *   	문장1;
 *   문장2;
 *   
 */
public class Exam_04 {
	public static void main(String[] args) {
		int  jumsu = 80;
		if(jumsu>=80) {
			System.out.println("합격");
			System.out.println("점수 :" + jumsu);
		}//참일땐 참인 부분에 {} 이거 반드시 필요함
		System.out.println("프로그램 종료");

	}

}
