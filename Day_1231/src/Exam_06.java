/*
 * 1부터 10까지의 합계를 구하는 반복문  
 * 합이 54인 경우
 */
public class Exam_06 {
	public static void main(String[] args) {
		int i = 1;
		int s = 0;

		while(true){
			System.out.println(i);
			i++;//s+=i;
			if(i>10) break;
			s+=i;//i++;
		}
		
		System.out.println("sum = " + s);
	}

}
