/* 상수 정의
 * 리터럴(10, 'a', 3.14, "aa")
 * 
 * final  
 *
 */
class AA{
	final double PI = 3.14; //==상수로 만들어버림. 값이 안바뀜
	final static int MAX = 100; // 공유하겠다는거임
}
public class Exam_03 {
	public static void main(String[] args) {
		 AA a = new AA();
		 int b = 3;
		 double d = b*a.PI;
	}

}
