import java.util.Scanner;

/*
 * 01. ���ǹ�
 */
public class sam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("�Է��ϼ��� :");
		int a = scn.nextInt();
		
			if(a>=90 && a<=100) {
			System.out.println("��");}
			else if(a>=80 && a<=89) {
				System.out.println("��");
			}else if(a>=70 && a<=79) {
				System.out.println("��");
			}else if(a>=60 && a<=69) {
				System.out.println("��");	
			}else if(a>=0 && a<=59){
				System.out.println("��");
			}else {
				System.out.println("�Է¿���");
		}
	
	}

}
