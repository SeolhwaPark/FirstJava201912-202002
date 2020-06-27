package test01;


class AAAA{
	
}

class BBBB extends AAAA{
	
}

public class Exam_09 {
	static void test(AAAA parent) {
		if(parent instanceof BBBB) { //동일한 객체를 확인하는 ...(변수 instanceof 클래스)
			BBBB bb = (BBBB)parent;
			System.out.println("BBBB 변환");
		}else {
			System.out.println("BBBB 변환불가");

		}
	}
	public static void main(String[] args) {
		AAAA aa = new BBBB();
		test(aa);
		AAAA aaa = new AAAA();
		test(aaa);
	}

}
