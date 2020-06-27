package Syain;
//»ç¿ø
public class Syainmeibo {
	String name; //namae
	String number; //juuminbangou
	String seibetu;
	int nenrei;
	String juusyo; //kyojuuti
	String syozoku; //busyo
	String cell; //renrakusaki
	
	Syainmeibo(){}
	
	Syainmeibo(String name,String number,String seibetu, int nenrei,String juusyo, String syozoku, String cell){
		this.name = name;
		this.number = number;
		this.seibetu = seibetu;
		this.nenrei = nenrei;
		this.juusyo = juusyo;
		this.syozoku = syozoku;
		this.cell = cell;
	}
	
	void syainPrint() {
		System.out.println(name + "," + seibetu + "," + nenrei + "," + juusyo + "," + syozoku + "," + cell);
		
	}

}
