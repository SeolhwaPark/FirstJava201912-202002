import java.util.Scanner;

/*
 * 
 */

class Hakkk{
 
	int bun;
	String name;
	int score;
	
	Hakkk(){
		dataPrint();

	}
	Hakkk(int bun, String name, int score){
		this(); //�ڱ��ڽ��� ������
		this.bun = bun ; //this �ڱ��ڽ��� ����Ŵ
		this.name = name;
		this.score = score;
	}
	
	void dataPrint() {
		System.out.println("��ȣ\t�̸�\t����");
		System.out.print(bun + "\t"+ name + "\t"+ score + "\t");
 		for(int x = 0; x<score; x++) {
 			if(x%10 == 0) {
 				System.out.print("* ");
 			}
 		}
 		System.out.println();
 	}
}

public class Exam_08 {
	public static void main(String[] args) {
	 	Scanner scn = new Scanner(System.in);
	 	
	 	Hakkk hak;
	 	while(true) {
	 		System.out.print("�Է� :");
	 		hak = new Hakkk();
	 		hak.bun = scn.nextInt();
	 		if(hak.bun == -99 ) {
	 			break;
	 		}
	 		
	 		hak.name = scn.next();
	 		hak.score = scn.nextInt();
	 		
	 		//hak.dataPrint();	
	 	}
/*
 * System.out.println(hak.bun + "\t"+ hak.name + "\t");
	 		for(int x = 0; x<hak.score; x++) {
	 			if(x%10 == 0) {
	 				System.out.print("* ");
	 			}
	 		}
 		System.out.println();
			
	 	}
 */
	}

}
