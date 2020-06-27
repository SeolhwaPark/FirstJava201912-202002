package rensyuu2;

import java.text.DecimalFormat;

public class Gakusei {
	int sabun;
	String namae;
	int okane;
	
	Gakusei(){}
	
	Gakusei(String a[]){
		sabun = Integer.parseInt(a[0]);
		this.namae = a[1];
		this.okane = Integer.parseInt(a[2]);
	}
	
	@Override
	public String toString() { //문자열 변환
		DecimalFormat dcf =  new DecimalFormat("￦#,###,###,###");
		String a = dcf.format(okane);
		return sabun + "\t" + namae + "\t" + a;
	}
}
