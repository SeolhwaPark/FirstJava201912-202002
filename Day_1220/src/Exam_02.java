/*
 * 1~100 �հ�
 * while(���ǽ�){}
 */
public class Exam_02 {
	public static void main(String[] args) {
		int i=0; // 1 2 3 4 5 
		int tot=0; // 1+2+3+4+5
		
		while(true) { //���� ���� �ݺ� 
			i++;
			tot=tot+i;
			System.out.println(i);
			if(i==100) {
				break;//�ݺ��� Ż�� ��
				
			}
		}
		System.out.println("1~100 :"+tot);

	}

}
