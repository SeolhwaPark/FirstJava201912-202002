import java.util.Scanner;

/*	������ ���� �Է� ��, ��, �� ����
 * 	��, ������ ���� ����
 * 
 */
public class Exam_11juri {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("���� ���� �Է�:");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		int max, me, min;
		if(a>b) {
			max=a;
			min=b;
		}else if(a>c) {
			max=a;
			if(b>c) {
				me=b;
				min=c;
			}else {
				me=c;
				min=b;
			}	
			if(a<c){
			max=c;
			me=a;
			min=b;
		}else if(b>c){
			max=b;
		}else if(a>c){
				me=a;
				min=c;
			}else{
					me=c;
					min=a;
		}if(b<c){
					max=c;
					me=b;
					min=a;
					
				}
			}
	}
}

