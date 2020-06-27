/*멤버변수(인스턴스변수) 초기화
 *	1.명시적 초기화
 *	2. 생성자를 이용한 초기화
 */

class AA{ 
	int x = 0; //명시적 초기화
	int y = 0;
	//정적 초기화 블럭 // 시행순위상 최우선순위의 존재
	static {
	//	x = 10;
	//	y = 20;
	}
	{ //인스턴스 초기화 블럭
		x = 10;
		y = 20;
	}
	AA(){ // 생성자를 이용한 초기화
		x = 10;
		y = 20;
	}
	void data() { //호출될 때
		int x = 0;
		
	}
	
}
public class Exam_03 {
	public static void main(String[] args) {
		
		
		
		
		
		
	}

}
