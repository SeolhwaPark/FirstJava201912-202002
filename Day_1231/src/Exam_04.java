/*
 * 반복문
 * 1. while(조건식){  } //{}안에 참인 동안에 반복함
 * 2. do{ ~ }while(조건식){  }
 * 3. for(변수 = 초기값;조건식;증감식){}
 * 	반복을 그만 두고 싶을 때 대체적으로 if문을 써야함
 */
public class Exam_04 {
	public static void main(String[] args) {
		int x = 0;
		while (true) { //무한루프함, 정지할 시점도 괄호 안에 넣을 수 있음
			System.out.println("x = " + x);
			x++;
			if(x==10) break;
		}
		int y = 0;
		while (y<10) { //참일 때만 수행
			y++;
			System.out.println("y = " + y);
			
		}
		int z = 0;
		do { //조건이 거짓이라도 일단 한 번은 수행함,테스트 같은
			z++;
			System.out.println("z = " + z);
			
		} while (z<=10);
		
	}
}
