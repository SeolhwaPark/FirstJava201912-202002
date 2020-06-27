/*
 * System클래스
 * 운영체제와 상호작용시 사용하는 클래스
 * 
 * 
 */
public class Exam_04 {
	public static void main(String[] args) {
		int cnt =0;
		while(true){
			System.out.println(cnt);
			if(cnt == 10) {
				System.exit(1); //0이외의 값이 들어가면 강제종료 
				//System.exit(0)은 정상종료
			}
			cnt++;
		}
		
//		System.out.println("프로그램 종료임돠");
//		System.gc(); 환경변수 gc //가비지컬렉션. 자바에게 쓰레기 수집을 부탁할 때
	}
}
