/*
 * 1���� 10������ �հ踦 ���ϴ� �ݺ���  
 * ���� 54�� ���
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
