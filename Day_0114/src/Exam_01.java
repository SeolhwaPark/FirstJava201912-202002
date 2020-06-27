/* 
 * 어셈블리 기계어

 * 절차지향 - C, 코볼, 포트란, 파스칼등  ->함수,계싼
 * 객체지향  - c++, c#, 자바, 파이썬...  
 * 객체지향 프로그래밍 *********************** 엄청중요 *******************
 * 1.클래스 속성 기능(메소드) ,추상화개념(속성 : 멤버변수, 행위(기능): 메소드)
 * 
 * 2.인스턴스(객체) : 클래스로부터 만들어진 객체
 * 
 * 3.메시지(메소드) : 객체들 간의 상호작용에 사용되는 수단
 * 
 * 객체지향 3요소 *********
 * 캡슐화: 하나의 클래스안에 기능을 숨겨놓고 메소드로 접근해야하는 거 
 * 상속성: 부모가 있어야 자식이 있음, 필요한 기능을 물려받는 거, 오버라이딩***
 * 다형성: 동일한 이름으로 여러가지 기능을 수행, 오버로딩 ***
 * 
 */

//마우스 모델링
/*	속성
 * 	버튼수, 유선무선, 색상
 
 * 	기능
 * 	왼쪽 버튼 클릭, 왼쪽 버튼 더블클릭(리턴타입 필요), 오른쪽 버튼 클릭
 * 
 */
class Mouse{ //생성자가 없으면 디폴트생성자가 와야함
	//속성정의(멤버변수)
	//멤버변수에 값을 주는 것 -> 명시적인 초기화
	//Private 데이터 캡슐화, 은닉

	private int btnNo; //= 2 ;//버튼
	private boolean cable; //= true; //선의 유false 무true
	private String color; //= "검정"; //색상
	//기능정의 (메소드) 리턴타입을 줄거냐 안줄거냐.. 
	
	//생성자 = 메소드. 클래스이름과 같은 메소드역할.  생정자 오버로딩한 상태
	//객체의 생성하는 방법을 제시하고 초기화시킴 
	//생성자를 하나이상 만드는 순간 디폴트생성자가 사라지니까 반드시 의무적으로 다시 만들어야함
	Mouse(){
		
	}
	Mouse(int btnNo){
		this.btnNo = btnNo;
	}
	Mouse(int btnNo, boolean wifi){
		this.btnNo = btnNo;
		this.cable = cable;
	}
	Mouse(int btnNo, boolean wifi, String color){
		this.btnNo = btnNo;
		this.cable = cable;
	}
	
	void leftClick() {
		System.out.println("욉쪽 버튼이 클릭되었습니다.");
	}
	void rightClick() {
		System.out.println("오른쪽 버튼이 클릭되었습니다.");
	}
	int doubleClick() {
		System.out.println("왼쪽 버튼이 더블클릭 되었습니다.");
		return 1;
	}
	//자기자신을 출력
	void mPrint() {

		System.out.print("Mouses는 " + btnNo + "버튼");
		if(cable) {
			System.out.print(" 무선방식 ");
		}else {
			System.out.print(" 유선방식 ");

		}
		System.out.print(color + "색상입니다\n");	
	}
	public void setBtnNo(int btnNo) {
		this.btnNo = btnNo;
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		//1. 객체생성 레퍼런스변수
		Mouse mou1; //인스턴스 변수 선언
		mou1 = new Mouse(); //객체생성 주소가르킴
		//바꾸고 싶을 때 여기서 바꿈
		mou1.setBtnNo(5);			
		mou1.mPrint(); 
		System.out.println("----------------------"); // 멍텅구리마우스
		/*mou1.leftClick();
		mou1.rightClick();
		mou1.doubleClick();
		*/
		System.out.println("----------------------"); // 멍텅구리마우스
		Mouse m2 = new Mouse(3);
		m2.mPrint();
		System.out.println("----------------------"); // 멍텅구리마우스
		Mouse m3 = new Mouse(3, true);
		m3.mPrint();
		System.out.println("----------------------"); // 멍텅구리마우스
		Mouse m4 = new Mouse(3, true , "검정");
		m4.mPrint();	
	}
}