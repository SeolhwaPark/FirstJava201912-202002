package gakkou;

public class Gakusei {
	String name;
	String gakka;
	String gakuban;
	String jumin;
	String danjo;
	int tosi;
	int jum1;
	int jum2;
	int jum3;
	int sum;
	double ave;
	int rank;
	
	Gakusei(){}
	
	Gakusei(String name, String gakka, String gakuban, String danjo, int tosi,int jum1,int jum2, int jum3,double ave, int rank) {
		this.name = name;
		this.gakka = gakka;
		this.gakuban = gakuban;
		this.danjo = danjo;
		this.tosi = tosi;
		this.jum1 = jum1;
		this.jum2 = jum2;
		this.jum3 = jum3;		
		this.ave = ave;
		this.rank = rank;
	}
	
	void gakuseiPrint() {
		System.out.println("*** "+name + " ,"+ gakka + " ,"+danjo +" ,"+tosi+" ,"+jum1 + " ,"+jum2 + " ,"+ jum3 +" ," +sum+ " ," +ave+" ,"+rank+ " ***");
	}
	
}
