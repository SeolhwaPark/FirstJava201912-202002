package rensyuu;

import java.util.Scanner;

class BB{
	int bun ;
	String na;
	BB(){}
	BB(int b, String n){
		bun = b;
		na = n;
	}
}

class DataBB{

	void printB(BB[] bb) {
		for(int x = 0; x < bb.length ; x++) {
			System.out.print(bb[x].bun + "\t" + bb[x].na + "\n");
		}
	}
}
class DataBBB{
	BB[] bb; // ���հ���
	
	DataBBB(){}
	DataBBB(BB[] aa){
		bb = aa;
		print();
	}
	void print() {
		for(int x = 0; x < bb.length ; x++) {
			System.out.print(bb[x].bun + "\t" + bb[x].na + "\n");
		}
	}
}

public class rensyuu07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BB []  bb = new BB[3];
		
		for(int x = 0; x < bb.length; x++) { //���ٿ� �Ѹ� �Է�
			System.out.print("�Է� :");
			bb[x] = new BB(scn.nextInt(),scn.next());
		}
		
		//DataBB data = new DataBB();
		//data.print(bb);
		DataBBB data = new DataBBB(bb);
	}

}
