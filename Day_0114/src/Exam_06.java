/*생성자 
 * 1.생성자 오버로딩
 * 2.생성자 호출 : this() 자기자신의 메소드, this. 자기자신
 * 
 */

class EE{
	int x;
	int y;
	EE(){
		this(100); //매개변수가 2개면 2개 들어잇는 거 호출. 딱 한번만 사용할 수 있음
		System.out.println("디폴트 생성자 호출");
	}
	EE(int x){
		this(x,200); //생성자 오버로딩일 때 가능
		System.out.println("매개변수 1개 디폴트 생성자 호출");
		this.x = x;
	}
	EE(int x, int y){
		System.out.println("매개변수 2개 디폴트 생성자 호출");
		this.x = y;
		this.y = y;
	}
}
public class Exam_06 {
	public static void main(String[] args) {
		EE e1 = new EE();
		System.out.println("x ="+ e1.x);	
		System.out.println("x ="+ e1.y);	
	}

}
