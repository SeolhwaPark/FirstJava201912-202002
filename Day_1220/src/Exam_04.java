/*
 * 1~100 Ȧ�� ��
 * 1)for
 * 2)while
 */

public class Exam_04 {
	public static void main(String[] args) {

// 1) for
		//1
		int oddtot1=0;
		for(int i=1; i<100; i++) { //���ڸ� ����� ��Ȱ
		System.out.println(i);
		oddtot1 += i;
			}
		System.out.println("1~100 Ȧ�� ��="+oddtot1);
	    
		
		//2
		int oddtot2=0;
		for(int i=1; i<=100; i++) {// ¦�����̸� int i=0 
			if(i%2==1) {
				oddtot2 += i;
			}
		System.out.println(i);
		oddtot1 += i;
			}
		System.out.println("1~100 Ȧ�� ��="+oddtot2); 
		
		//3
		int oddtot3=0;
		boolean flag=true;
		for(int i=1; i<=100; i++) { 
			if(flag) {
				oddtot3 += i;
			}else {
				flag=true;
			}
		System.out.println(i);
		oddtot1 += i;
			}
		System.out.println("1~100 Ȧ�� ��="+oddtot3);
		
		//4
		int oddtot4=0;
		for(int i=1; i<=100; i++) { 
			if( i % 2 ==0 ) {
				oddtot4 += i;
				System.out.println(i);
			}
		}
		System.out.println("1~100 ¦�� ��="+oddtot4);
		
	}

	}
