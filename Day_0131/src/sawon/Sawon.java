package sawon;

import java.text.DecimalFormat;

public class Sawon {
	int sabun;
	String name;
	int money;
	
	Sawon(){}
	
	Sawon(String a[]){
		sabun =Integer.parseInt(a[0]);
		this.name = a[1];
		this.money = Integer.parseInt(a[2]);
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("£Ü #,###,###,###");
		String m = df.format(money);
		return sabun +"\t" + name+ "\t" + m;
	}
	
}
